package typings.overlayscrollbars.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynHeight extends StObject {
  
  var dynHeight: js.UndefOr[Boolean] = js.undefined
  
  var dynWidth: js.UndefOr[Boolean] = js.undefined
  
  var inheritedAttrs: js.UndefOr[String | js.Array[String] | Null] = js.undefined
}
object DynHeight {
  
  inline def apply(): DynHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynHeight]
  }
  
  extension [Self <: DynHeight](x: Self) {
    
    inline def setDynHeight(value: Boolean): Self = StObject.set(x, "dynHeight", value.asInstanceOf[js.Any])
    
    inline def setDynHeightUndefined: Self = StObject.set(x, "dynHeight", js.undefined)
    
    inline def setDynWidth(value: Boolean): Self = StObject.set(x, "dynWidth", value.asInstanceOf[js.Any])
    
    inline def setDynWidthUndefined: Self = StObject.set(x, "dynWidth", js.undefined)
    
    inline def setInheritedAttrs(value: String | js.Array[String]): Self = StObject.set(x, "inheritedAttrs", value.asInstanceOf[js.Any])
    
    inline def setInheritedAttrsNull: Self = StObject.set(x, "inheritedAttrs", null)
    
    inline def setInheritedAttrsUndefined: Self = StObject.set(x, "inheritedAttrs", js.undefined)
    
    inline def setInheritedAttrsVarargs(value: String*): Self = StObject.set(x, "inheritedAttrs", js.Array(value*))
  }
}
