package typings.nodeRedRegistry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeAPISettings extends js.Object {
  
  def available(): Boolean = js.native
  
  def delete(prop: String): js.Promise[Unit] = js.native
  
  def disableNodeSettings(types: js.Array[String]): Unit = js.native
  
  def enableNodeSettings(types: js.Array[String]): Unit = js.native
  
  def exportNodeSettings(safeSettings: js.Object): js.Object = js.native
  
  def get(prop: String): js.Any = js.native
  
  def getUserSettings(username: String): Unit = js.native
  
  def registerNodeSettings(`type`: String, opts: js.Object): Unit = js.native
  
  def set(prop: String, value: js.Any): js.Promise[Unit] = js.native
  
  def setUserSettings(username: String, settings: js.Object): js.Promise[Unit] = js.native
}
object NodeAPISettings {
  
  @scala.inline
  def apply(
    available: () => Boolean,
    delete: String => js.Promise[Unit],
    disableNodeSettings: js.Array[String] => Unit,
    enableNodeSettings: js.Array[String] => Unit,
    exportNodeSettings: js.Object => js.Object,
    get: String => js.Any,
    getUserSettings: String => Unit,
    registerNodeSettings: (String, js.Object) => Unit,
    set: (String, js.Any) => js.Promise[Unit],
    setUserSettings: (String, js.Object) => js.Promise[Unit]
  ): NodeAPISettings = {
    val __obj = js.Dynamic.literal(available = js.Any.fromFunction0(available), delete = js.Any.fromFunction1(delete), disableNodeSettings = js.Any.fromFunction1(disableNodeSettings), enableNodeSettings = js.Any.fromFunction1(enableNodeSettings), exportNodeSettings = js.Any.fromFunction1(exportNodeSettings), get = js.Any.fromFunction1(get), getUserSettings = js.Any.fromFunction1(getUserSettings), registerNodeSettings = js.Any.fromFunction2(registerNodeSettings), set = js.Any.fromFunction2(set), setUserSettings = js.Any.fromFunction2(setUserSettings))
    __obj.asInstanceOf[NodeAPISettings]
  }
  
  @scala.inline
  implicit class NodeAPISettingsOps[Self <: NodeAPISettings] (val x: Self) extends AnyVal {
    
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
    def setAvailable(value: () => Boolean): Self = this.set("available", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: String => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisableNodeSettings(value: js.Array[String] => Unit): Self = this.set("disableNodeSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableNodeSettings(value: js.Array[String] => Unit): Self = this.set("enableNodeSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExportNodeSettings(value: js.Object => js.Object): Self = this.set("exportNodeSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUserSettings(value: String => Unit): Self = this.set("getUserSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterNodeSettings(value: (String, js.Object) => Unit): Self = this.set("registerNodeSettings", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => js.Promise[Unit]): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetUserSettings(value: (String, js.Object) => js.Promise[Unit]): Self = this.set("setUserSettings", js.Any.fromFunction2(value))
  }
}
