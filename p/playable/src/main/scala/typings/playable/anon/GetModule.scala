package typings.playable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetModule extends js.Object {
  
  def getModule(name: String): js.Any = js.native
  
  def registerModule(name: String, fn: js.Function): Unit = js.native
  
  def registerModuleAsSingleton(name: String, fn: js.Function): Unit = js.native
  
  def setConfig(newConfig: js.Object): Unit = js.native
  
  def setPlaybackAdapters(newAdapters: js.Any): Unit = js.native
}
object GetModule {
  
  @scala.inline
  def apply(
    getModule: String => js.Any,
    registerModule: (String, js.Function) => Unit,
    registerModuleAsSingleton: (String, js.Function) => Unit,
    setConfig: js.Object => Unit,
    setPlaybackAdapters: js.Any => Unit
  ): GetModule = {
    val __obj = js.Dynamic.literal(getModule = js.Any.fromFunction1(getModule), registerModule = js.Any.fromFunction2(registerModule), registerModuleAsSingleton = js.Any.fromFunction2(registerModuleAsSingleton), setConfig = js.Any.fromFunction1(setConfig), setPlaybackAdapters = js.Any.fromFunction1(setPlaybackAdapters))
    __obj.asInstanceOf[GetModule]
  }
  
  @scala.inline
  implicit class GetModuleOps[Self <: GetModule] (val x: Self) extends AnyVal {
    
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
    def setGetModule(value: String => js.Any): Self = this.set("getModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterModule(value: (String, js.Function) => Unit): Self = this.set("registerModule", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterModuleAsSingleton(value: (String, js.Function) => Unit): Self = this.set("registerModuleAsSingleton", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetConfig(value: js.Object => Unit): Self = this.set("setConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPlaybackAdapters(value: js.Any => Unit): Self = this.set("setPlaybackAdapters", js.Any.fromFunction1(value))
  }
}
