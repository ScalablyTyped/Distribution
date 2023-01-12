package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlType extends StObject {
  
  /**
    * optional - control type to match
    */
  var controlType: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * required - ID to match. Can be string, regex or array
    */
  var id: js.UndefOr[String | js.Array[String]] = js.undefined
}
object ControlType {
  
  inline def apply(): ControlType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlType] (val x: Self) extends AnyVal {
    
    inline def setControlType(value: String | js.Function): Self = StObject.set(x, "controlType", value.asInstanceOf[js.Any])
    
    inline def setControlTypeUndefined: Self = StObject.set(x, "controlType", js.undefined)
    
    inline def setId(value: String | js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value*))
  }
}
