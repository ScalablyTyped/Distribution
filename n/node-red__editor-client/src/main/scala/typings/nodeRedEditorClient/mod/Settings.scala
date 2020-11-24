package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.ApiRootUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
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
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: (String, js.Any) => js.Any): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInit(value: (ApiRootUrl, js.Function0[Unit]) => Unit): Self = this.set("init", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoad(value: js.Function0[Unit] => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadUserSettings(value: js.Function0[Unit] => Unit): Self = this.set("loadUserSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTheme(value: (String, js.Any) => js.Any): Self = this.set("theme", js.Any.fromFunction2(value))
  }
}
