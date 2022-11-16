package typings.pgPromise.typescriptPgSubsetMod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClient extends EventEmitter {
  
  var activeQuery: IQuery = js.native
  
  var binary: Boolean = js.native
  
  // PostgreSQL Server to which the client is connected
  var connection: IConnection = js.native
  
  var connectionParameters: IConnectionParameters[IClient] = js.native
  
  var database: String = js.native
  
  var encoding: String = js.native
  
  var host: String = js.native
  
  var password: DynamicPassword = js.native
  
  var port: Double = js.native
  
  var processID: Double = js.native
  
  def query[T](config: Any): js.Promise[IResult[T]] = js.native
  def query[T](config: Any, callback: js.Function2[/* err */ js.Error, /* result */ IResult[T], Unit]): Unit = js.native
  def query[T](config: Any, values: js.Array[Any]): js.Promise[IResult[T]] = js.native
  def query[T](
    config: Any,
    values: js.Array[Any],
    callback: js.Function2[/* err */ js.Error, /* result */ IResult[T], Unit]
  ): Unit = js.native
  
  var queryQueue: js.Array[IQuery] = js.native
  
  var readyForQuery: Boolean = js.native
  
  var secretKey: Double = js.native
  
  //////////////////////////////////////////////////////////////
  // Properties below are not available within Native Bindings:
  val serverVersion: String = js.native
  
  var ssl: Boolean | ISSLConfig = js.native
  
  var user: String = js.native
}
