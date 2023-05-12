package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayConfigurationOptions extends StObject {
  
  var physicalResolution: js.UndefOr[Boolean] = js.undefined
}
object DisplayConfigurationOptions {
  
  inline def apply(): DisplayConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayConfigurationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayConfigurationOptions] (val x: Self) extends AnyVal {
    
    inline def setPhysicalResolution(value: Boolean): Self = StObject.set(x, "physicalResolution", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResolutionUndefined: Self = StObject.set(x, "physicalResolution", js.undefined)
  }
}
