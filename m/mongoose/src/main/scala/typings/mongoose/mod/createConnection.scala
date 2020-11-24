package typings.mongoose.mod

import typings.mongoose.anon.ConnectionthenPromiseConn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongoose", "createConnection")
@js.native
object createConnection extends js.Object {
  
  def apply(): Connection_ = js.native
  def apply(uri: String): ConnectionthenPromiseConn = js.native
  def apply(uri: String, options: ConnectionOptions): ConnectionthenPromiseConn = js.native
}
