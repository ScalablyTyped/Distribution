package typings.ngkookies.angular.kookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKookiesProvider extends js.Object {
  
  var config: Config = js.native
  
  var defaults: Options = js.native
  
  def setConfig(config: Config): Unit = js.native
  
  def setDefaults(options: Options): Unit = js.native
}
object IKookiesProvider {
  
  @scala.inline
  def apply(config: Config, defaults: Options, setConfig: Config => Unit, setDefaults: Options => Unit): IKookiesProvider = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], setConfig = js.Any.fromFunction1(setConfig), setDefaults = js.Any.fromFunction1(setDefaults))
    __obj.asInstanceOf[IKookiesProvider]
  }
  
  @scala.inline
  implicit class IKookiesProviderOps[Self <: IKookiesProvider] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: Config): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaults(value: Options): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetConfig(value: Config => Unit): Self = this.set("setConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaults(value: Options => Unit): Self = this.set("setDefaults", js.Any.fromFunction1(value))
  }
}
