package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `536` extends StObject {
  
  var from: js.UndefOr[Boolean] = js.undefined
  
  var to: js.UndefOr[Boolean] = js.undefined
}
object `536` {
  
  inline def apply(): `536` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`536`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `536`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Boolean): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: Boolean): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
