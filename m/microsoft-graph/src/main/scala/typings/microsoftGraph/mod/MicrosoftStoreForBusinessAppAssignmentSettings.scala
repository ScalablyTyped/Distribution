package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MicrosoftStoreForBusinessAppAssignmentSettings
  extends StObject
     with MobileAppAssignmentSettings {
  
  // Whether or not to use device execution context for Microsoft Store for Business mobile app.
  var useDeviceContext: js.UndefOr[Boolean] = js.undefined
}
object MicrosoftStoreForBusinessAppAssignmentSettings {
  
  @scala.inline
  def apply(): MicrosoftStoreForBusinessAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrosoftStoreForBusinessAppAssignmentSettings]
  }
  
  @scala.inline
  implicit class MicrosoftStoreForBusinessAppAssignmentSettingsMutableBuilder[Self <: MicrosoftStoreForBusinessAppAssignmentSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseDeviceContext(value: Boolean): Self = StObject.set(x, "useDeviceContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDeviceContextUndefined: Self = StObject.set(x, "useDeviceContext", js.undefined)
  }
}
