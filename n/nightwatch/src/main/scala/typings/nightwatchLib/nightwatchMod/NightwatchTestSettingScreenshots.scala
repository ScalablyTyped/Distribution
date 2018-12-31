package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestSettingScreenshots extends NightwatchTestSettingGeneric {
  /**
    * Selenium generates screenshots when command errors occur. With on_failure set to true, also generates screenshots for failing or erroring tests. These are saved on the disk.
    * Since v0.7.5 you can disable screenshots for command errors by setting "on_error" to false.
    * Example:
    * "screenshots" : {
    *      "enabled" : true,
    *      "on_failure" : true,
    *      "on_error" : false,
    *      "path" : ""
    * }
    */
  var screenshots: NightwatchScreenshotOptions
}

