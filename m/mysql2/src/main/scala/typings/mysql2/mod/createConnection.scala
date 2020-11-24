package typings.mysql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mysql2", "createConnection")
@js.native
object createConnection extends js.Object {
  
  def apply(config: ConnectionOptions): Connection = js.native
  def apply(connectionUri: String): Connection = js.native
}
