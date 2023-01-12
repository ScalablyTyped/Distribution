package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeAPISettings extends StObject {
  
  def available(): Boolean
  
  def delete(prop: String): js.Promise[Unit]
  
  def disableNodeSettings(types: js.Array[String]): Unit
  
  def enableNodeSettings(types: js.Array[String]): Unit
  
  def exportNodeSettings(safeSettings: js.Object): js.Object
  
  def get(prop: String): Any
  
  def getUserSettings(username: String): Unit
  
  def registerNodeSettings(`type`: String, opts: js.Object): Unit
  
  def set(prop: String, value: Any): js.Promise[Unit]
  
  def setUserSettings(username: String, settings: js.Object): js.Promise[Unit]
}
object NodeAPISettings {
  
  inline def apply(
    available: () => Boolean,
    delete: String => js.Promise[Unit],
    disableNodeSettings: js.Array[String] => Unit,
    enableNodeSettings: js.Array[String] => Unit,
    exportNodeSettings: js.Object => js.Object,
    get: String => Any,
    getUserSettings: String => Unit,
    registerNodeSettings: (String, js.Object) => Unit,
    set: (String, Any) => js.Promise[Unit],
    setUserSettings: (String, js.Object) => js.Promise[Unit]
  ): NodeAPISettings = {
    val __obj = js.Dynamic.literal(available = js.Any.fromFunction0(available), delete = js.Any.fromFunction1(delete), disableNodeSettings = js.Any.fromFunction1(disableNodeSettings), enableNodeSettings = js.Any.fromFunction1(enableNodeSettings), exportNodeSettings = js.Any.fromFunction1(exportNodeSettings), get = js.Any.fromFunction1(get), getUserSettings = js.Any.fromFunction1(getUserSettings), registerNodeSettings = js.Any.fromFunction2(registerNodeSettings), set = js.Any.fromFunction2(set), setUserSettings = js.Any.fromFunction2(setUserSettings))
    __obj.asInstanceOf[NodeAPISettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeAPISettings] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: () => Boolean): Self = StObject.set(x, "available", js.Any.fromFunction0(value))
    
    inline def setDelete(value: String => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setDisableNodeSettings(value: js.Array[String] => Unit): Self = StObject.set(x, "disableNodeSettings", js.Any.fromFunction1(value))
    
    inline def setEnableNodeSettings(value: js.Array[String] => Unit): Self = StObject.set(x, "enableNodeSettings", js.Any.fromFunction1(value))
    
    inline def setExportNodeSettings(value: js.Object => js.Object): Self = StObject.set(x, "exportNodeSettings", js.Any.fromFunction1(value))
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetUserSettings(value: String => Unit): Self = StObject.set(x, "getUserSettings", js.Any.fromFunction1(value))
    
    inline def setRegisterNodeSettings(value: (String, js.Object) => Unit): Self = StObject.set(x, "registerNodeSettings", js.Any.fromFunction2(value))
    
    inline def setSet(value: (String, Any) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetUserSettings(value: (String, js.Object) => js.Promise[Unit]): Self = StObject.set(x, "setUserSettings", js.Any.fromFunction2(value))
  }
}
