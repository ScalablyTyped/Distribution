package typings.pendoIoBrowser.anon

import typings.pendoIoBrowser.pendoIoBrowserStrings.desktop
import typings.pendoIoBrowser.pendoIoBrowserStrings.mobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Desktop extends js.Object {
  var desktop: Boolean
  var mobile: Boolean
  var `type`: desktop | mobile
}

object Desktop {
  @scala.inline
  def apply(desktop: Boolean, mobile: Boolean, `type`: desktop | mobile): Desktop = {
    val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desktop]
  }
}

