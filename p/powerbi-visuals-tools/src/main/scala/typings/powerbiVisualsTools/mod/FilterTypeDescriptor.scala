package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterTypeDescriptor extends StObject {
  
  var selfFilter: js.UndefOr[Boolean] = js.undefined
}
object FilterTypeDescriptor {
  
  inline def apply(): FilterTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterTypeDescriptor]
  }
  
  extension [Self <: FilterTypeDescriptor](x: Self) {
    
    inline def setSelfFilter(value: Boolean): Self = StObject.set(x, "selfFilter", value.asInstanceOf[js.Any])
    
    inline def setSelfFilterUndefined: Self = StObject.set(x, "selfFilter", js.undefined)
  }
}
