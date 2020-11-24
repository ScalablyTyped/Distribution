package typings.popperjsCore.anon

import typings.popperjsCore.typesMod.Padding
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/arrow.Options> */
@js.native
trait PartialOptionsElement extends js.Object {
  
  var element: js.UndefOr[HTMLElement | String | Null] = js.native
  
  var padding: js.UndefOr[Padding] = js.native
}
object PartialOptionsElement {
  
  @scala.inline
  def apply(): PartialOptionsElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsElement]
  }
  
  @scala.inline
  implicit class PartialOptionsElementOps[Self <: PartialOptionsElement] (val x: Self) extends AnyVal {
    
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
    def setElement(value: HTMLElement | String): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setElementNull: Self = this.set("element", null)
    
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
}
