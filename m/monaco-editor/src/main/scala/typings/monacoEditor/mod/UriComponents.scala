package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UriComponents extends StObject {
  
  var authority: String = js.native
  
  var fragment: String = js.native
  
  var path: String = js.native
  
  var query: String = js.native
  
  var scheme: String = js.native
}
object UriComponents {
  
  @scala.inline
  def apply(authority: String, fragment: String, path: String, query: String, scheme: String): UriComponents = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriComponents]
  }
  
  @scala.inline
  implicit class UriComponentsMutableBuilder[Self <: UriComponents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
