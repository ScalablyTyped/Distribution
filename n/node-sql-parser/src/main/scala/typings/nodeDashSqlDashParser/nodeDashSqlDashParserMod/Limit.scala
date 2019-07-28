package typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  var `type`: String
  var value: Double
}

object Limit {
  @scala.inline
  def apply(`type`: String, value: Double): Limit = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Limit]
  }
}

