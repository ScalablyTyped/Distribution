package typings.oclazyload.oc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILazyLoadProvider extends js.Object {
  
  /**
    * Configures the main service provider.
    * @param config The configuration settings to use
    */
  def config(config: IProviderConfig): Unit = js.native
}
object ILazyLoadProvider {
  
  @scala.inline
  def apply(config: IProviderConfig => Unit): ILazyLoadProvider = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
    __obj.asInstanceOf[ILazyLoadProvider]
  }
  
  @scala.inline
  implicit class ILazyLoadProviderOps[Self <: ILazyLoadProvider] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: IProviderConfig => Unit): Self = this.set("config", js.Any.fromFunction1(value))
  }
}
