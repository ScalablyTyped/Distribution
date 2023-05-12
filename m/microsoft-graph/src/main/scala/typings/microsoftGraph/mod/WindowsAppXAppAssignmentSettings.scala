package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsAppXAppAssignmentSettings
  extends StObject
     with MobileAppAssignmentSettings {
  
  /**
    * When TRUE, indicates that device execution context will be used for the AppX mobile app. When FALSE, indicates that
    * user context will be used for the AppX mobile app. By default, this property is set to FALSE. Once this property has
    * been set to TRUE it cannot be changed.
    */
  var useDeviceContext: js.UndefOr[Boolean] = js.undefined
}
object WindowsAppXAppAssignmentSettings {
  
  inline def apply(): WindowsAppXAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsAppXAppAssignmentSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsAppXAppAssignmentSettings] (val x: Self) extends AnyVal {
    
    inline def setUseDeviceContext(value: Boolean): Self = StObject.set(x, "useDeviceContext", value.asInstanceOf[js.Any])
    
    inline def setUseDeviceContextUndefined: Self = StObject.set(x, "useDeviceContext", js.undefined)
  }
}
