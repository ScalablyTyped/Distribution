package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fragment extends StObject {
  
  var fragment: js.UndefOr[String] = js.undefined
  
  var matches: js.UndefOr[js.Array[Indices]] = js.undefined
  
  var object_type: js.UndefOr[String | Null] = js.undefined
  
  var object_url: js.UndefOr[String] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
}
object Fragment {
  
  inline def apply(): Fragment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fragment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setMatches(value: js.Array[Indices]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: Indices*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setObject_type(value: String): Self = StObject.set(x, "object_type", value.asInstanceOf[js.Any])
    
    inline def setObject_typeNull: Self = StObject.set(x, "object_type", null)
    
    inline def setObject_typeUndefined: Self = StObject.set(x, "object_type", js.undefined)
    
    inline def setObject_url(value: String): Self = StObject.set(x, "object_url", value.asInstanceOf[js.Any])
    
    inline def setObject_urlUndefined: Self = StObject.set(x, "object_url", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
