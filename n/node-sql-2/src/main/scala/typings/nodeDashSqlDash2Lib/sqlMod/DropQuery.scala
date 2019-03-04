package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropQuery extends Executable {
  def ifExists(): Executable
}

object DropQuery {
  @scala.inline
  def apply(ifExists: js.Function0[Executable], toQuery: js.Function0[QueryLike]): DropQuery = {
    val __obj = js.Dynamic.literal(ifExists = ifExists, toQuery = toQuery)
  
    __obj.asInstanceOf[DropQuery]
  }
}

