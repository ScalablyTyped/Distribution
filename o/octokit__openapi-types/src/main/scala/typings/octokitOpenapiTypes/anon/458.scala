package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `458` extends StObject {
  
  var from: js.UndefOr[Boolean] = js.undefined
  
  var to: js.UndefOr[Boolean] = js.undefined
}
object `458` {
  
  inline def apply(): `458` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`458`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `458`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Boolean): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: Boolean): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
