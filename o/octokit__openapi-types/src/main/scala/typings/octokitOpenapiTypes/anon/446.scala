package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `446` extends StObject {
  
  var from: Boolean | Null
}
object `446` {
  
  inline def apply(): `446` = {
    val __obj = js.Dynamic.literal(from = null)
    __obj.asInstanceOf[`446`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `446`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Boolean): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
  }
}
