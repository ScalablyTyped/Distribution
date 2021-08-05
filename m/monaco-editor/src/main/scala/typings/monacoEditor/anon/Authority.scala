package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authority extends StObject {
  
  var authority: js.UndefOr[String | Null] = js.undefined
  
  var fragment: js.UndefOr[String | Null] = js.undefined
  
  var path: js.UndefOr[String | Null] = js.undefined
  
  var query: js.UndefOr[String | Null] = js.undefined
  
  var scheme: js.UndefOr[String] = js.undefined
}
object Authority {
  
  inline def apply(): Authority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Authority]
  }
  
  extension [Self <: Authority](x: Self) {
    
    inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityNull: Self = StObject.set(x, "authority", null)
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentNull: Self = StObject.set(x, "fragment", null)
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
