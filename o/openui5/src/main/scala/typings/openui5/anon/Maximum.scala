package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maximum extends StObject {
  
  /**
    * Largest value allowed for this type
    */
  var maximum: js.UndefOr[int] = js.undefined
  
  /**
    * Smallest value allowed for this type
    */
  var minimum: js.UndefOr[int] = js.undefined
}
object Maximum {
  
  inline def apply(): Maximum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maximum]
  }
  
  extension [Self <: Maximum](x: Self) {
    
    inline def setMaximum(value: int): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: int): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
  }
}
