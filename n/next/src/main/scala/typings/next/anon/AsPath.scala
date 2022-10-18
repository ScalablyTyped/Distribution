package typings.next.anon

import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsPath extends StObject {
  
  var asPath: String
  
  var href: String
  
  var locale: js.UndefOr[String | `false`] = js.undefined
  
  var skipInterpolation: js.UndefOr[Boolean] = js.undefined
}
object AsPath {
  
  inline def apply(asPath: String, href: String): AsPath = {
    val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsPath]
  }
  
  extension [Self <: AsPath](x: Self) {
    
    inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String | `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setSkipInterpolation(value: Boolean): Self = StObject.set(x, "skipInterpolation", value.asInstanceOf[js.Any])
    
    inline def setSkipInterpolationUndefined: Self = StObject.set(x, "skipInterpolation", js.undefined)
  }
}
