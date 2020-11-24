package typings.mysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mysql", "createPool")
@js.native
object createPool extends js.Object {
  
  def apply(config: String): Pool = js.native
  def apply(config: PoolConfig): Pool = js.native
}
