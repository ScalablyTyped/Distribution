package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var req: js.UndefOr[js.Object] = js.undefined
  
  var settings: js.Object
  
  var user: js.UndefOr[typings.nodeRedRuntime.mod.User] = js.undefined
}
object Settings {
  
  @scala.inline
  def apply(settings: js.Object): Settings = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    @scala.inline
    def setSettings(value: js.Object): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: typings.nodeRedRuntime.mod.User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
