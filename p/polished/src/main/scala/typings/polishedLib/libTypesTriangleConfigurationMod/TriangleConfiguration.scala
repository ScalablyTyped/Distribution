package typings
package polishedLib.libTypesTriangleConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriangleConfiguration extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var foregroundColor: java.lang.String
  var height: scala.Double | java.lang.String
  var pointingDirection: polishedLib.libTypesSideKeywordMod.SideKeyword
  var width: scala.Double | java.lang.String
}

object TriangleConfiguration {
  @scala.inline
  def apply(
    foregroundColor: java.lang.String,
    height: scala.Double | java.lang.String,
    pointingDirection: polishedLib.libTypesSideKeywordMod.SideKeyword,
    width: scala.Double | java.lang.String,
    backgroundColor: java.lang.String = null
  ): TriangleConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("foregroundColor")(foregroundColor)
    __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.updateDynamic("pointingDirection")(pointingDirection)
    __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.asInstanceOf[TriangleConfiguration]
  }
}

