package typings.openui5.anon

import typings.openui5.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  /**
    * Largest value allowed for this type
    */
  var maximum: js.UndefOr[float] = js.undefined
  
  /**
    * Smallest value allowed for this type
    */
  var minimum: js.UndefOr[float] = js.undefined
}
object `38` {
  
  inline def apply(): `38` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`38`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `38`] (val x: Self) extends AnyVal {
    
    inline def setMaximum(value: float): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: float): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
  }
}
