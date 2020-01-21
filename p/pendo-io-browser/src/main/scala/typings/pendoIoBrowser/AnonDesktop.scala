package typings.pendoIoBrowser

import typings.pendoIoBrowser.pendoIoBrowserStrings.desktop
import typings.pendoIoBrowser.pendoIoBrowserStrings.mobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDesktop extends js.Object {
  var desktop: Boolean
  var mobile: Boolean
  var `type`: desktop | mobile
}

object AnonDesktop {
  @scala.inline
  def apply(desktop: Boolean, mobile: Boolean, `type`: desktop | mobile): AnonDesktop = {
    val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDesktop]
  }
}

