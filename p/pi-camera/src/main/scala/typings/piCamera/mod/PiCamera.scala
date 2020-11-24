package typings.piCamera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PiCamera extends js.Object {
  
  def get(prop: ConfigKey): ConfigValue = js.native
  
  def record(): js.Promise[String] = js.native
  
  def set(prop: ConfigKey, value: ConfigValue): ConfigValue = js.native
  
  def snap(): js.Promise[String] = js.native
  
  /** @async */
  def snapDataUrl(): js.Promise[String] = js.native
}
object PiCamera {
  
  @scala.inline
  def apply(
    get: ConfigKey => ConfigValue,
    record: () => js.Promise[String],
    set: (ConfigKey, ConfigValue) => ConfigValue,
    snap: () => js.Promise[String],
    snapDataUrl: () => js.Promise[String]
  ): PiCamera = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), record = js.Any.fromFunction0(record), set = js.Any.fromFunction2(set), snap = js.Any.fromFunction0(snap), snapDataUrl = js.Any.fromFunction0(snapDataUrl))
    __obj.asInstanceOf[PiCamera]
  }
  
  @scala.inline
  implicit class PiCameraOps[Self <: PiCamera] (val x: Self) extends AnyVal {
    
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
    def setGet(value: ConfigKey => ConfigValue): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRecord(value: () => js.Promise[String]): Self = this.set("record", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (ConfigKey, ConfigValue) => ConfigValue): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSnap(value: () => js.Promise[String]): Self = this.set("snap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSnapDataUrl(value: () => js.Promise[String]): Self = this.set("snapDataUrl", js.Any.fromFunction0(value))
  }
}
