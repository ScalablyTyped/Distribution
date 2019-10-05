package typings.mysql.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mysql", "createPool")
@js.native
object createPool extends js.Object {
  def apply(config: String): Pool = js.native
  def apply(config: PoolConfig): Pool = js.native
}

