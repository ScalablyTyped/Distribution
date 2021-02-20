package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class NightwatchTestOptionsMutableBuilder[Self <: NightwatchTestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScreenshots(value: Boolean): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenshotsPath(value: String): Self = StObject.set(x, "screenshotsPath", value.asInstanceOf[js.Any])
  }
}
