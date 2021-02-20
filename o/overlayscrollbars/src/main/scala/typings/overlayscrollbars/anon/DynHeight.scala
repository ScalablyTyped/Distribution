package typings.overlayscrollbars.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynHeight extends StObject {
  
  var dynHeight: js.UndefOr[Boolean] = js.native
  
  var dynWidth: js.UndefOr[Boolean] = js.native
  
  var inheritedAttrs: js.UndefOr[String | js.Array[String] | Null] = js.native
}
object DynHeight {
  
  @scala.inline
  def apply(): DynHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynHeight]
  }
  
  @scala.inline
  implicit class DynHeightMutableBuilder[Self <: DynHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynHeight(value: Boolean): Self = StObject.set(x, "dynHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynHeightUndefined: Self = StObject.set(x, "dynHeight", js.undefined)
    
    @scala.inline
    def setDynWidth(value: Boolean): Self = StObject.set(x, "dynWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynWidthUndefined: Self = StObject.set(x, "dynWidth", js.undefined)
    
    @scala.inline
    def setInheritedAttrs(value: String | js.Array[String]): Self = StObject.set(x, "inheritedAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritedAttrsNull: Self = StObject.set(x, "inheritedAttrs", null)
    
    @scala.inline
    def setInheritedAttrsUndefined: Self = StObject.set(x, "inheritedAttrs", js.undefined)
    
    @scala.inline
    def setInheritedAttrsVarargs(value: String*): Self = StObject.set(x, "inheritedAttrs", js.Array(value :_*))
  }
}
