package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ms extends StObject {
  
  var __edmType: String
  
  var ms: int
}
object Ms {
  
  inline def apply(__edmType: String, ms: int): Ms = {
    val __obj = js.Dynamic.literal(__edmType = __edmType.asInstanceOf[js.Any], ms = ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ms] (val x: Self) extends AnyVal {
    
    inline def setMs(value: int): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
    
    inline def set__edmType(value: String): Self = StObject.set(x, "__edmType", value.asInstanceOf[js.Any])
  }
}
