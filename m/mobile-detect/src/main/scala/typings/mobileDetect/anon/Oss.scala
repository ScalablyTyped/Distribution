package typings.mobileDetect.anon

import typings.mobileDetect.mod.MobileDetectComplexRules
import typings.mobileDetect.mod.MobileDetectRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Oss extends js.Object {
  
  var oss: MobileDetectRules = js.native
  
  var phones: MobileDetectRules = js.native
  
  var props: MobileDetectComplexRules = js.native
  
  var tablets: MobileDetectRules = js.native
  
  var uas: MobileDetectRules = js.native
  
  var utils: MobileDetectRules = js.native
}
object Oss {
  
  @scala.inline
  def apply(
    oss: MobileDetectRules,
    phones: MobileDetectRules,
    props: MobileDetectComplexRules,
    tablets: MobileDetectRules,
    uas: MobileDetectRules,
    utils: MobileDetectRules
  ): Oss = {
    val __obj = js.Dynamic.literal(oss = oss.asInstanceOf[js.Any], phones = phones.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tablets = tablets.asInstanceOf[js.Any], uas = uas.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oss]
  }
  
  @scala.inline
  implicit class OssOps[Self <: Oss] (val x: Self) extends AnyVal {
    
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
    def setOss(value: MobileDetectRules): Self = this.set("oss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhones(value: MobileDetectRules): Self = this.set("phones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: MobileDetectComplexRules): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablets(value: MobileDetectRules): Self = this.set("tablets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUas(value: MobileDetectRules): Self = this.set("uas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtils(value: MobileDetectRules): Self = this.set("utils", value.asInstanceOf[js.Any])
  }
}
