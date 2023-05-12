package typings.pgPromise.typescriptPgSubsetMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// interface IPool, as per the following implementation:
// https://github.com/brianc/node-postgres/blob/master/packages/pg-pool/index.js#L61
// NOTE: We declare only what can be used from pg-promise
@js.native
trait IPool extends EventEmitter {
  
  def connect(): js.Promise[IClient] = js.native
  
  def end(): js.Promise[Unit] = js.native
  def end(cb: js.Function1[/* err */ js.Error, Any]): Any = js.native
  
  // connection options
  val ended: Boolean = js.native
  
  val ending: Boolean = js.native
  
  val expiredCount: Double = js.native
  
  val idleCount: Double = js.native
  
  def log(msg: String): Unit = js.native
  def log(msg: String, err: Any): Unit = js.native
  
  val options: StringDictionary[Any] = js.native
  
  val totalCount: Double = js.native
  
  val waitingCount: Double = js.native
}
