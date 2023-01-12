package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cloned extends StObject {
  
  /**
    * Option to exclude elements that are clones of list bindings
    */
  var cloned: Boolean
  
  /**
    * Option to exclude elements that are not public aggregations
    */
  var public: Boolean
  
  /**
    * Type name to filter by type
    */
  var `type`: String
}
object Cloned {
  
  inline def apply(cloned: Boolean, public: Boolean, `type`: String): Cloned = {
    val __obj = js.Dynamic.literal(cloned = cloned.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cloned]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cloned] (val x: Self) extends AnyVal {
    
    inline def setCloned(value: Boolean): Self = StObject.set(x, "cloned", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
