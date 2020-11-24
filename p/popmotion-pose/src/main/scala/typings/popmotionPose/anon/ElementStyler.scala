package typings.popmotionPose.anon

import typings.stylefire.typesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementStyler extends js.Object {
  
  var elementStyler: Styler = js.native
}
object ElementStyler {
  
  @scala.inline
  def apply(elementStyler: Styler): ElementStyler = {
    val __obj = js.Dynamic.literal(elementStyler = elementStyler.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStyler]
  }
  
  @scala.inline
  implicit class ElementStylerOps[Self <: ElementStyler] (val x: Self) extends AnyVal {
    
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
    def setElementStyler(value: Styler): Self = this.set("elementStyler", value.asInstanceOf[js.Any])
  }
}
