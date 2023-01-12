package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alternative extends StObject {
  
  var alt: js.UndefOr[String | Null] = js.undefined
}
object Alternative {
  
  inline def apply(): Alternative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alternative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alternative] (val x: Self) extends AnyVal {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltNull: Self = StObject.set(x, "alt", null)
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
  }
}
