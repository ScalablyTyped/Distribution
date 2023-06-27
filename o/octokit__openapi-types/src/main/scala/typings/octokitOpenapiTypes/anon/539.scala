package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `539` extends StObject {
  
  var from: js.UndefOr[String | Null] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
}
object `539` {
  
  inline def apply(): `539` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`539`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `539`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
