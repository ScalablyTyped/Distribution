package typings.popperjsCore.anon

import typings.popperjsCore.typesMod.SideObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasPopperEscaped extends js.Object {
  
  var hasPopperEscaped: Boolean = js.native
  
  var isReferenceHidden: Boolean = js.native
  
  var popperEscapeOffsets: SideObject = js.native
  
  var referenceClippingOffsets: SideObject = js.native
}
object HasPopperEscaped {
  
  @scala.inline
  def apply(
    hasPopperEscaped: Boolean,
    isReferenceHidden: Boolean,
    popperEscapeOffsets: SideObject,
    referenceClippingOffsets: SideObject
  ): HasPopperEscaped = {
    val __obj = js.Dynamic.literal(hasPopperEscaped = hasPopperEscaped.asInstanceOf[js.Any], isReferenceHidden = isReferenceHidden.asInstanceOf[js.Any], popperEscapeOffsets = popperEscapeOffsets.asInstanceOf[js.Any], referenceClippingOffsets = referenceClippingOffsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasPopperEscaped]
  }
  
  @scala.inline
  implicit class HasPopperEscapedOps[Self <: HasPopperEscaped] (val x: Self) extends AnyVal {
    
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
    def setHasPopperEscaped(value: Boolean): Self = this.set("hasPopperEscaped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReferenceHidden(value: Boolean): Self = this.set("isReferenceHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperEscapeOffsets(value: SideObject): Self = this.set("popperEscapeOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceClippingOffsets(value: SideObject): Self = this.set("referenceClippingOffsets", value.asInstanceOf[js.Any])
  }
}
