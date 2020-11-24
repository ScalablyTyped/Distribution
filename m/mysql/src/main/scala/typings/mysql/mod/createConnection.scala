package typings.mysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mysql", "createConnection")
@js.native
object createConnection extends js.Object {
  
  def apply(connectionUri: String): Connection = js.native
  def apply(connectionUri: ConnectionConfig): Connection = js.native
}
