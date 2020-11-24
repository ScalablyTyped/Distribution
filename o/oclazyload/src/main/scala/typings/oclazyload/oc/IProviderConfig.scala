package typings.oclazyload.oc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProviderConfig extends js.Object {
  
  /**
    * If true, all errors will be logged to the console, in addition to rejecting a promise. Defaults to false.
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, an event will be broadcast whenever a module, component or file is loaded. Events that can be broadcast are: ocLazyLoad.moduleLoaded,
    * ocLazyLoad.moduleReloaded, ocLazyLoad.componentLoaded, ocLazyLoad.fileLoaded. Defaults to false.
    */
  var events: js.UndefOr[Boolean] = js.native
  
  /**
    * Predefines a set of module configurations for later use. A name must be provided for each module so that it can be retrieved later.
    */
  var modules: js.UndefOr[js.Array[IModuleConfig]] = js.native
}
object IProviderConfig {
  
  @scala.inline
  def apply(): IProviderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProviderConfig]
  }
  
  @scala.inline
  implicit class IProviderConfigOps[Self <: IProviderConfig] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setEvents(value: Boolean): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setModulesVarargs(value: IModuleConfig*): Self = this.set("modules", js.Array(value :_*))
    
    @scala.inline
    def setModules(value: js.Array[IModuleConfig]): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
  }
}
