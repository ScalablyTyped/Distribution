package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends js.Object {
  
  var attributes: js.Any = js.native
  
  var fshader: String = js.native
  
  var useTransformFeedback: js.UndefOr[Boolean] = js.native
  
  var vshader: String = js.native
}
object Attributes {
  
  @scala.inline
  def apply(attributes: js.Any, fshader: String, vshader: String): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fshader = fshader.asInstanceOf[js.Any], vshader = vshader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFshader(value: String): Self = this.set("fshader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVshader(value: String): Self = this.set("vshader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTransformFeedback(value: Boolean): Self = this.set("useTransformFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTransformFeedback: Self = this.set("useTransformFeedback", js.undefined)
  }
}
