package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthSettingCamera extends StObject {
  
  var authSetting: Camera
}
object AuthSettingCamera {
  
  inline def apply(authSetting: Camera): AuthSettingCamera = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSettingCamera]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthSettingCamera] (val x: Self) extends AnyVal {
    
    inline def setAuthSetting(value: Camera): Self = StObject.set(x, "authSetting", value.asInstanceOf[js.Any])
  }
}
