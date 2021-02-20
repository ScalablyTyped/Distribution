package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessPlatforms extends StObject {
  
  // Possible values are: android, iOS, windows, windowsPhone, macOS, unknownFutureValue.
  var excludePlatforms: js.UndefOr[js.Array[ConditionalAccessDevicePlatform]] = js.native
  
  // Possible values are: android, iOS, windows, windowsPhone, macOS, all, unknownFutureValue.
  var includePlatforms: js.UndefOr[js.Array[ConditionalAccessDevicePlatform]] = js.native
}
object ConditionalAccessPlatforms {
  
  @scala.inline
  def apply(): ConditionalAccessPlatforms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessPlatforms]
  }
  
  @scala.inline
  implicit class ConditionalAccessPlatformsMutableBuilder[Self <: ConditionalAccessPlatforms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludePlatforms(value: js.Array[ConditionalAccessDevicePlatform]): Self = StObject.set(x, "excludePlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludePlatformsUndefined: Self = StObject.set(x, "excludePlatforms", js.undefined)
    
    @scala.inline
    def setExcludePlatformsVarargs(value: ConditionalAccessDevicePlatform*): Self = StObject.set(x, "excludePlatforms", js.Array(value :_*))
    
    @scala.inline
    def setIncludePlatforms(value: js.Array[ConditionalAccessDevicePlatform]): Self = StObject.set(x, "includePlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePlatformsUndefined: Self = StObject.set(x, "includePlatforms", js.undefined)
    
    @scala.inline
    def setIncludePlatformsVarargs(value: ConditionalAccessDevicePlatform*): Self = StObject.set(x, "includePlatforms", js.Array(value :_*))
  }
}
