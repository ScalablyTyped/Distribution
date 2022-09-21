package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.ApiRootUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  def get[T](key: String, defaultIfUndefined: T): T
  
  def init(options: ApiRootUrl, done: js.Function0[Unit]): Unit
  
  def load(done: js.Function0[Unit]): Unit
  
  def loadUserSettings(done: js.Function0[Unit]): Unit
  
  def remove(key: String): Unit
  
  def set(key: String, value: Any): Unit
  
  def theme[T](property: String, defaultValue: T): T
}
object Settings {
  
  inline def apply(
    get: (String, Any) => Any,
    init: (ApiRootUrl, js.Function0[Unit]) => Unit,
    load: js.Function0[Unit] => Unit,
    loadUserSettings: js.Function0[Unit] => Unit,
    remove: String => Unit,
    set: (String, Any) => Unit,
    theme: (String, Any) => Any
  ): Settings = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), init = js.Any.fromFunction2(init), load = js.Any.fromFunction1(load), loadUserSettings = js.Any.fromFunction1(loadUserSettings), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), theme = js.Any.fromFunction2(theme))
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setGet(value: (String, Any) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setInit(value: (ApiRootUrl, js.Function0[Unit]) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
    
    inline def setLoad(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    inline def setLoadUserSettings(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "loadUserSettings", js.Any.fromFunction1(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setTheme(value: (String, Any) => Any): Self = StObject.set(x, "theme", js.Any.fromFunction2(value))
  }
}
