package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchTestOptions
  extends StObject
     with NightwatchTestSettingGeneric {
  
  var screenshots: Boolean
  
  var screenshotsPath: String
}
object NightwatchTestOptions {
  
  inline def apply(screenshots: Boolean, screenshotsPath: String): NightwatchTestOptions = {
    val __obj = js.Dynamic.literal(screenshots = screenshots.asInstanceOf[js.Any], screenshotsPath = screenshotsPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NightwatchTestOptions] (val x: Self) extends AnyVal {
    
    inline def setScreenshots(value: Boolean): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    inline def setScreenshotsPath(value: String): Self = StObject.set(x, "screenshotsPath", value.asInstanceOf[js.Any])
  }
}
