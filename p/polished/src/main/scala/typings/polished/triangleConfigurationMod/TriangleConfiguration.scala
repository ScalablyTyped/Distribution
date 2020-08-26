package typings.polished.triangleConfigurationMod

import typings.polished.sideKeywordMod.SideKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriangleConfiguration extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var foregroundColor: String = js.native
  var height: Double | String = js.native
  var pointingDirection: SideKeyword = js.native
  var width: Double | String = js.native
}

object TriangleConfiguration {
  @scala.inline
  def apply(
    foregroundColor: String,
    height: Double | String,
    pointingDirection: SideKeyword,
    width: Double | String
  ): TriangleConfiguration = {
    val __obj = js.Dynamic.literal(foregroundColor = foregroundColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pointingDirection = pointingDirection.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriangleConfiguration]
  }
  @scala.inline
  implicit class TriangleConfigurationOps[Self <: TriangleConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForegroundColor(value: String): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointingDirection(value: SideKeyword): Self = this.set("pointingDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
  }
  
}

