package typings.passportSaml.multiSamlStrategyMod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportSaml.mod.SamlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiSamlConfig extends SamlConfig {
  
  def getSamlOptions(req: Request_[ParamsDictionary, _, _, Query], callback: SamlOptionsCallback): Unit = js.native
}
object MultiSamlConfig {
  
  @scala.inline
  def apply(getSamlOptions: (Request_[ParamsDictionary, _, _, Query], SamlOptionsCallback) => Unit): MultiSamlConfig = {
    val __obj = js.Dynamic.literal(getSamlOptions = js.Any.fromFunction2(getSamlOptions))
    __obj.asInstanceOf[MultiSamlConfig]
  }
  
  @scala.inline
  implicit class MultiSamlConfigOps[Self <: MultiSamlConfig] (val x: Self) extends AnyVal {
    
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
    def setGetSamlOptions(value: (Request_[ParamsDictionary, _, _, Query], SamlOptionsCallback) => Unit): Self = this.set("getSamlOptions", js.Any.fromFunction2(value))
  }
}
