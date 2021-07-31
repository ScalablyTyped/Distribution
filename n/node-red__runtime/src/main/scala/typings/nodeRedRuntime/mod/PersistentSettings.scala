package typings.nodeRedRuntime.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentSettings extends StObject {
  
  def available(): Boolean
  
  def delete(prop: String): js.Promise[Unit]
  
  def disableNodeSettings(types: js.Array[String]): Unit
  
  def enableNodeSettings(types: js.Array[String]): Unit
  
  def exportNodeSettings(safeSettings: js.Object): js.Object
  
  def get(prop: String): js.Any
  
  def getUserSettings(username: String): js.Object
  
  def init(settings: LocalSettings): Unit
  
  def load(storage: StorageModule): Unit
  
  def registerNodeSettings(`type`: String, opts: js.Object): Unit
  
  def reset(): Unit
  
  def set(prop: String, value: js.Any): js.Promise[Unit]
  
  def setUserSettings(username: String, settings: js.Object): js.Promise[Unit]
}
object PersistentSettings {
  
  @scala.inline
  def apply(
    available: () => Boolean,
    delete: String => js.Promise[Unit],
    disableNodeSettings: js.Array[String] => Unit,
    enableNodeSettings: js.Array[String] => Unit,
    exportNodeSettings: js.Object => js.Object,
    get: String => js.Any,
    getUserSettings: String => js.Object,
    init: LocalSettings => Unit,
    load: StorageModule => Unit,
    registerNodeSettings: (String, js.Object) => Unit,
    reset: () => Unit,
    set: (String, js.Any) => js.Promise[Unit],
    setUserSettings: (String, js.Object) => js.Promise[Unit]
  ): PersistentSettings = {
    val __obj = js.Dynamic.literal(available = js.Any.fromFunction0(available), delete = js.Any.fromFunction1(delete), disableNodeSettings = js.Any.fromFunction1(disableNodeSettings), enableNodeSettings = js.Any.fromFunction1(enableNodeSettings), exportNodeSettings = js.Any.fromFunction1(exportNodeSettings), get = js.Any.fromFunction1(get), getUserSettings = js.Any.fromFunction1(getUserSettings), init = js.Any.fromFunction1(init), load = js.Any.fromFunction1(load), registerNodeSettings = js.Any.fromFunction2(registerNodeSettings), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set), setUserSettings = js.Any.fromFunction2(setUserSettings))
    __obj.asInstanceOf[PersistentSettings]
  }
  
  @scala.inline
  implicit class PersistentSettingsMutableBuilder[Self <: PersistentSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: () => Boolean): Self = StObject.set(x, "available", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: String => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisableNodeSettings(value: js.Array[String] => Unit): Self = StObject.set(x, "disableNodeSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableNodeSettings(value: js.Array[String] => Unit): Self = StObject.set(x, "enableNodeSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExportNodeSettings(value: js.Object => js.Object): Self = StObject.set(x, "exportNodeSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUserSettings(value: String => js.Object): Self = StObject.set(x, "getUserSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: LocalSettings => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoad(value: StorageModule => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterNodeSettings(value: (String, js.Object) => Unit): Self = StObject.set(x, "registerNodeSettings", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetUserSettings(value: (String, js.Object) => js.Promise[Unit]): Self = StObject.set(x, "setUserSettings", js.Any.fromFunction2(value))
  }
}
