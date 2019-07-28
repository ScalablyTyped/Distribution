package typings.polished.libTypesTriangleConfigurationMod

import typings.polished.libTypesSideKeywordMod.SideKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriangleConfiguration extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var foregroundColor: String
  var height: Double | String
  var pointingDirection: SideKeyword
  var width: Double | String
}

object TriangleConfiguration {
  @scala.inline
  def apply(
    foregroundColor: String,
    height: Double | String,
    pointingDirection: SideKeyword,
    width: Double | String,
    backgroundColor: String = null
  ): TriangleConfiguration = {
    val __obj = js.Dynamic.literal(foregroundColor = foregroundColor, height = height.asInstanceOf[js.Any], pointingDirection = pointingDirection, width = width.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.asInstanceOf[TriangleConfiguration]
  }
}

