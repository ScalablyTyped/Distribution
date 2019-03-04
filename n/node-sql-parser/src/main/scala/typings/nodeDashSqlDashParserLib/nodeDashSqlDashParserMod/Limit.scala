package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  var `type`: java.lang.String
  var value: scala.Double
}

object Limit {
  @scala.inline
  def apply(`type`: java.lang.String, value: scala.Double): Limit = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Limit]
  }
}

