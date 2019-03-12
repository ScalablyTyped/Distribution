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
  def apply(toQuery: () => QueryLike): Executable = {
    val __obj = js.Dynamic.literal(toQuery = js.Any.fromFunction0(toQuery))
  
    __obj.asInstanceOf[Executable]
  }
}

