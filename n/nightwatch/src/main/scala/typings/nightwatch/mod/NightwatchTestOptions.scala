package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchTestOptions extends NightwatchTestSettingGeneric {
  var screenshots: Boolean = js.native
  var screenshotsPath: String = js.native
}

object NightwatchTestOptions {
  @scala.inline
  def apply(screenshots: Boolean, screenshotsPath: String): NightwatchTestOptions = {
    val __obj = js.Dynamic.literal(screenshots = screenshots.asInstanceOf[js.Any], screenshotsPath = screenshotsPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestOptions]
  }
  @scala.inline
  implicit class NightwatchTestOptionsOps[Self <: NightwatchTestOptions] (val x: Self) extends AnyVal {
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
    def setScreenshots(value: Boolean): Self = this.set("screenshots", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenshotsPath(value: String): Self = this.set("screenshotsPath", value.asInstanceOf[js.Any])
  }
  
}

