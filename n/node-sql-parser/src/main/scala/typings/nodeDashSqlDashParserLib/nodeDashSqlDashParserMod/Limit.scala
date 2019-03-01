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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Limit]
  }
}

