package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessPlatforms extends StObject {
  
  // Possible values are: android, iOS, windows, windowsPhone, macOS, linux, all, unknownFutureValue.
  var excludePlatforms: js.UndefOr[js.Array[ConditionalAccessDevicePlatform]] = js.undefined
  
  // Possible values are: android, iOS, windows, windowsPhone, macOS, linux, all, unknownFutureValue.
  var includePlatforms: js.UndefOr[js.Array[ConditionalAccessDevicePlatform]] = js.undefined
}
object ConditionalAccessPlatforms {
  
  inline def apply(): ConditionalAccessPlatforms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessPlatforms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalAccessPlatforms] (val x: Self) extends AnyVal {
    
    inline def setExcludePlatforms(value: js.Array[ConditionalAccessDevicePlatform]): Self = StObject.set(x, "excludePlatforms", value.asInstanceOf[js.Any])
    
    inline def setExcludePlatformsUndefined: Self = StObject.set(x, "excludePlatforms", js.undefined)
    
    inline def setExcludePlatformsVarargs(value: ConditionalAccessDevicePlatform*): Self = StObject.set(x, "excludePlatforms", js.Array(value*))
    
    inline def setIncludePlatforms(value: js.Array[ConditionalAccessDevicePlatform]): Self = StObject.set(x, "includePlatforms", value.asInstanceOf[js.Any])
    
    inline def setIncludePlatformsUndefined: Self = StObject.set(x, "includePlatforms", js.undefined)
    
    inline def setIncludePlatformsVarargs(value: ConditionalAccessDevicePlatform*): Self = StObject.set(x, "includePlatforms", js.Array(value*))
  }
}
