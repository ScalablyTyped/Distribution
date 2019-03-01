package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQuery extends Executable {
  def ifNotExists(): Executable
}

object CreateQuery {
  @scala.inline
  def apply(ifNotExists: js.Function0[Executable], toQuery: js.Function0[QueryLike]): CreateQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ifNotExists")(ifNotExists)
    __obj.updateDynamic("toQuery")(toQuery)
    __obj.asInstanceOf[CreateQuery]
  }
}

