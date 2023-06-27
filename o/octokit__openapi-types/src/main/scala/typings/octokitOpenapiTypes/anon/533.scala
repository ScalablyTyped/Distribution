package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `533` extends StObject {
  
  var from: String | Null
}
object `533` {
  
  inline def apply(): `533` = {
    val __obj = js.Dynamic.literal(from = null)
    __obj.asInstanceOf[`533`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `533`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
  }
}
