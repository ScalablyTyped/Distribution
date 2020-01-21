package typings.osrsJsonApi

import typings.osrsJsonApi.mod.ge.TrendPriceObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  var current: TrendPriceObject
  var day180: TrendPriceObject
  var day30: TrendPriceObject
  var day90: TrendPriceObject
  var description: String
  var icon: String
  var icon_large: String
  var id: Double
  var members: Boolean
  var name: String
  var today: TrendPriceObject
  var `type`: String
  var typeIcon: String
}

object AnonCurrent {
  @scala.inline
  def apply(
    current: TrendPriceObject,
    day180: TrendPriceObject,
    day30: TrendPriceObject,
    day90: TrendPriceObject,
    description: String,
    icon: String,
    icon_large: String,
    id: Double,
    members: Boolean,
    name: String,
    today: TrendPriceObject,
    `type`: String,
    typeIcon: String
  ): AnonCurrent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], day180 = day180.asInstanceOf[js.Any], day30 = day30.asInstanceOf[js.Any], day90 = day90.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], icon_large = icon_large.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], typeIcon = typeIcon.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrent]
  }
}

