package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executable extends js.Object {
  def toQuery(): QueryLike
}

object Executable {
  @scala.inline
  def apply(toQuery: js.Function0[QueryLike]): Executable = {
    val __obj = js.Dynamic.literal(toQuery = toQuery)
  
    __obj.asInstanceOf[Executable]
  }
}

