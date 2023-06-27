package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `524` extends StObject {
  
  var from: Boolean | Null
}
object `524` {
  
  inline def apply(): `524` = {
    val __obj = js.Dynamic.literal(from = null)
    __obj.asInstanceOf[`524`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `524`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Boolean): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
  }
}
