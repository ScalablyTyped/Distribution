package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDriverProtocolScreenCapture extends js.Object {
  /**
    * Take a screenshot of the current page.
    */
  def screenshot(log_screenshot_data: scala.Boolean): this.type = js.native
  def screenshot(
    log_screenshot_data: scala.Boolean,
    callback: js.Function1[/* screenshotEncoded */ java.lang.String, scala.Unit]
  ): this.type = js.native
}

