package typings.popperjsCore.anon

import typings.popperjsCore.typesMod.SideObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasPopperEscaped extends StObject {
  
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
  implicit class HasPopperEscapedMutableBuilder[Self <: HasPopperEscaped] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasPopperEscaped(value: Boolean): Self = StObject.set(x, "hasPopperEscaped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReferenceHidden(value: Boolean): Self = StObject.set(x, "isReferenceHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperEscapeOffsets(value: SideObject): Self = StObject.set(x, "popperEscapeOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceClippingOffsets(value: SideObject): Self = StObject.set(x, "referenceClippingOffsets", value.asInstanceOf[js.Any])
  }
}
