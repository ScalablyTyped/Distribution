package typings.officeUiFabricReact.keytipConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeytipConfig extends js.Object {
  
  var keytips: js.Array[IKeytipConfigItem] = js.native
}
object IKeytipConfig {
  
  @scala.inline
  def apply(keytips: js.Array[IKeytipConfigItem]): IKeytipConfig = {
    val __obj = js.Dynamic.literal(keytips = keytips.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipConfig]
  }
  
  @scala.inline
  implicit class IKeytipConfigOps[Self <: IKeytipConfig] (val x: Self) extends AnyVal {
    
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
    def setKeytipsVarargs(value: IKeytipConfigItem*): Self = this.set("keytips", js.Array(value :_*))
    
    @scala.inline
    def setKeytips(value: js.Array[IKeytipConfigItem]): Self = this.set("keytips", value.asInstanceOf[js.Any])
  }
}
