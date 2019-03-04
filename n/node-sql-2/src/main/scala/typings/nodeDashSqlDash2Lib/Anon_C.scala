package typings
package nodeDashSqlDash2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_C extends js.Object {
  def LOWER[Name](c: nodeDashSqlDash2Lib.sqlMod.Column[Name, java.lang.String]): nodeDashSqlDash2Lib.sqlMod.Column[Name, java.lang.String]
}

object Anon_C {
  @scala.inline
  def apply(
    LOWER: js.Function1[
      nodeDashSqlDash2Lib.sqlMod.Column[js.Any, java.lang.String], 
      nodeDashSqlDash2Lib.sqlMod.Column[js.Any, java.lang.String]
    ]
  ): Anon_C = {
    val __obj = js.Dynamic.literal(LOWER = LOWER)
  
    __obj.asInstanceOf[Anon_C]
  }
}

