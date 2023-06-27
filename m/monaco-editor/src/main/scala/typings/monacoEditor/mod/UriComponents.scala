package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriComponents extends StObject {
  
  var authority: js.UndefOr[String] = js.undefined
  
  var fragment: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var scheme: String
}
object UriComponents {
  
  inline def apply(scheme: String): UriComponents = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UriComponents] (val x: Self) extends AnyVal {
    
    inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
