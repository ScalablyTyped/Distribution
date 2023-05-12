package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsUniversalAppXAppAssignmentSettings
  extends StObject
     with MobileAppAssignmentSettings {
  
  /**
    * If true, uses device execution context for Windows Universal AppX mobile app. Device-context install is not allowed
    * when this type of app is targeted with Available intent. Defaults to false.
    */
  var useDeviceContext: js.UndefOr[Boolean] = js.undefined
}
object WindowsUniversalAppXAppAssignmentSettings {
  
  inline def apply(): WindowsUniversalAppXAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUniversalAppXAppAssignmentSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsUniversalAppXAppAssignmentSettings] (val x: Self) extends AnyVal {
    
    inline def setUseDeviceContext(value: Boolean): Self = StObject.set(x, "useDeviceContext", value.asInstanceOf[js.Any])
    
    inline def setUseDeviceContextUndefined: Self = StObject.set(x, "useDeviceContext", js.undefined)
  }
}
