package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.ApiRootUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends StObject {
  
  def get[T](key: String, defaultIfUndefined: T): T = js.native
  
  def init(options: ApiRootUrl, done: js.Function0[Unit]): Unit = js.native
  
  def load(done: js.Function0[Unit]): Unit = js.native
  
  def loadUserSettings(done: js.Function0[Unit]): Unit = js.native
  
  def remove(key: String): Unit = js.native
  
  def set(key: String, value: js.Any): Unit = js.native
  
  def theme[T](property: String, defaultValue: T): T = js.native
}
object Settings {
  
  @scala.inline
  def apply(
    get: (String, js.Any) => js.Any,
    init: (ApiRootUrl, js.Function0[Unit]) => Unit,
    load: js.Function0[Unit] => Unit,
    loadUserSettings: js.Function0[Unit] => Unit,
    remove: String => Unit,
    set: (String, js.Any) => Unit,
    theme: (String, js.Any) => js.Any
  ): Settings = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), init = js.Any.fromFunction2(init), load = js.Any.fromFunction1(load), loadUserSettings = js.Any.fromFunction1(loadUserSettings), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), theme = js.Any.fromFunction2(theme))
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: (String, js.Any) => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInit(value: (ApiRootUrl, js.Function0[Unit]) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoad(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadUserSettings(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "loadUserSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTheme(value: (String, js.Any) => js.Any): Self = StObject.set(x, "theme", js.Any.fromFunction2(value))
  }
}
