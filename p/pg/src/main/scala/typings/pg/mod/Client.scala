package typings.pg.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg", "Client")
@js.native
class Client () extends ClientBase {
  def this(config: String) = this()
  def this(config: ClientConfig) = this()
  
  var database: js.UndefOr[String] = js.native
  
  def end(): js.Promise[Unit] = js.native
  def end(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  var host: String = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var port: Double = js.native
  
  var ssl: Boolean = js.native
  
  var user: js.UndefOr[String] = js.native
}
