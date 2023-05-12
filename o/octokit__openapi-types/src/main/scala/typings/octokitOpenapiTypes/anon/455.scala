package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `455` extends StObject {
  
  var from: String | Null
}
object `455` {
  
  inline def apply(): `455` = {
    val __obj = js.Dynamic.literal(from = null)
    __obj.asInstanceOf[`455`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `455`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
  }
}
