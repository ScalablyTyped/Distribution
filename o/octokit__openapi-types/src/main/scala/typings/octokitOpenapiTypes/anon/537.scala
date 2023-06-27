package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `537` extends StObject {
  
  var from: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
}
object `537` {
  
  inline def apply(): `537` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`537`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `537`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
