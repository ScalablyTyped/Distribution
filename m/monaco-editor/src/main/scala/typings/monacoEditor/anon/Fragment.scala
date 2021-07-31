package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fragment extends StObject {
  
  var authority: js.UndefOr[String] = js.undefined
  
  var fragment: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var scheme: String
}
object Fragment {
  
  @scala.inline
  def apply(scheme: String): Fragment = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
  
  @scala.inline
  implicit class FragmentMutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    @scala.inline
    def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
