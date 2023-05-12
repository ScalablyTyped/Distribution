package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginSlug extends StObject {
  
  var login: js.UndefOr[FromString] = js.undefined
  
  var slug: js.UndefOr[FromString] = js.undefined
}
object LoginSlug {
  
  inline def apply(): LoginSlug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginSlug]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginSlug] (val x: Self) extends AnyVal {
    
    inline def setLogin(value: FromString): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    inline def setSlug(value: FromString): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
  }
}
