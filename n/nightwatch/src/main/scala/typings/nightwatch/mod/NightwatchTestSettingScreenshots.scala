package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchTestSettingScreenshots
  extends StObject
     with NightwatchTestSettingGeneric {
  
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
object NightwatchTestSettingScreenshots {
  
  inline def apply(screenshots: NightwatchScreenshotOptions): NightwatchTestSettingScreenshots = {
    val __obj = js.Dynamic.literal(screenshots = screenshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestSettingScreenshots]
  }
  
  extension [Self <: NightwatchTestSettingScreenshots](x: Self) {
    
    inline def setScreenshots(value: NightwatchScreenshotOptions): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
  }
}
