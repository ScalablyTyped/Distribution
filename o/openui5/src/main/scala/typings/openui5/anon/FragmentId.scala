package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentId extends StObject {
  
  var controlType: js.UndefOr[js.Function] = js.undefined
  
  var fragmentId: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  
  var viewId: js.UndefOr[String] = js.undefined
  
  var viewName: js.UndefOr[String] = js.undefined
  
  var viewNamespace: js.UndefOr[String] = js.undefined
}
object FragmentId {
  
  inline def apply(): FragmentId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FragmentId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragmentId] (val x: Self) extends AnyVal {
    
    inline def setControlType(value: js.Function): Self = StObject.set(x, "controlType", value.asInstanceOf[js.Any])
    
    inline def setControlTypeUndefined: Self = StObject.set(x, "controlType", js.undefined)
    
    inline def setFragmentId(value: String): Self = StObject.set(x, "fragmentId", value.asInstanceOf[js.Any])
    
    inline def setFragmentIdUndefined: Self = StObject.set(x, "fragmentId", js.undefined)
    
    inline def setId(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
    
    inline def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
    
    inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
    
    inline def setViewNamespace(value: String): Self = StObject.set(x, "viewNamespace", value.asInstanceOf[js.Any])
    
    inline def setViewNamespaceUndefined: Self = StObject.set(x, "viewNamespace", js.undefined)
  }
}
