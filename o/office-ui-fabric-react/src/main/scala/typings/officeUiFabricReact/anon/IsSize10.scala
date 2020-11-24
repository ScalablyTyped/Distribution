package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsSize10 extends js.Object {
  
  var isSize10: Boolean = js.native
  
  var isSize100: Boolean = js.native
  
  var isSize120: Boolean = js.native
  
  var isSize16: Boolean = js.native
  
  var isSize24: Boolean = js.native
  
  var isSize28: Boolean = js.native
  
  var isSize32: Boolean = js.native
  
  var isSize40: Boolean = js.native
  
  var isSize48: Boolean = js.native
  
  var isSize56: Boolean = js.native
  
  var isSize72: Boolean = js.native
  
  var isSize8: Boolean = js.native
}
object IsSize10 {
  
  @scala.inline
  def apply(
    isSize10: Boolean,
    isSize100: Boolean,
    isSize120: Boolean,
    isSize16: Boolean,
    isSize24: Boolean,
    isSize28: Boolean,
    isSize32: Boolean,
    isSize40: Boolean,
    isSize48: Boolean,
    isSize56: Boolean,
    isSize72: Boolean,
    isSize8: Boolean
  ): IsSize10 = {
    val __obj = js.Dynamic.literal(isSize10 = isSize10.asInstanceOf[js.Any], isSize100 = isSize100.asInstanceOf[js.Any], isSize120 = isSize120.asInstanceOf[js.Any], isSize16 = isSize16.asInstanceOf[js.Any], isSize24 = isSize24.asInstanceOf[js.Any], isSize28 = isSize28.asInstanceOf[js.Any], isSize32 = isSize32.asInstanceOf[js.Any], isSize40 = isSize40.asInstanceOf[js.Any], isSize48 = isSize48.asInstanceOf[js.Any], isSize56 = isSize56.asInstanceOf[js.Any], isSize72 = isSize72.asInstanceOf[js.Any], isSize8 = isSize8.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSize10]
  }
  
  @scala.inline
  implicit class IsSize10Ops[Self <: IsSize10] (val x: Self) extends AnyVal {
    
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
    def setIsSize10(value: Boolean): Self = this.set("isSize10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSize100(value: Boolean): Self = this.set("isSize100", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSize120(value: Boolean): Self = this.set("isSize120", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSize16(value: Boolean): Self = this.set("isSize16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSize24(value: Boolean): Self = this.set("isSize24", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSize28(value: Boolean): Self = this.set("isSize28", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSize32(value: Boolean): Self = this.set("isSize32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSize40(value: Boolean): Self = this.set("isSize40", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSize48(value: Boolean): Self = this.set("isSize48", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSize56(value: Boolean): Self = this.set("isSize56", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSize72(value: Boolean): Self = this.set("isSize72", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSize8(value: Boolean): Self = this.set("isSize8", value.asInstanceOf[js.Any])
  }
}
