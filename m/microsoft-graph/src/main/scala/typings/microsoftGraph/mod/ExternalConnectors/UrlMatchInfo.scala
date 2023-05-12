package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlMatchInfo extends StObject {
  
  // A list of the URL prefixes that must match URLs to be processed by this URL-to-item-resolver.
  var baseUrls: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * A regular expression that will be matched towards the URL that is processed by this URL-to-item-resolver. The
    * ECMAScript specification for regular expressions (ECMA-262) is used for the evaluation. The named groups defined by the
    * regular expression will be used later to extract values from the URL.
    */
  var urlPattern: js.UndefOr[NullableOption[String]] = js.undefined
}
object UrlMatchInfo {
  
  inline def apply(): UrlMatchInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMatchInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlMatchInfo] (val x: Self) extends AnyVal {
    
    inline def setBaseUrls(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "baseUrls", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlsNull: Self = StObject.set(x, "baseUrls", null)
    
    inline def setBaseUrlsUndefined: Self = StObject.set(x, "baseUrls", js.undefined)
    
    inline def setBaseUrlsVarargs(value: String*): Self = StObject.set(x, "baseUrls", js.Array(value*))
    
    inline def setUrlPattern(value: NullableOption[String]): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
    
    inline def setUrlPatternNull: Self = StObject.set(x, "urlPattern", null)
    
    inline def setUrlPatternUndefined: Self = StObject.set(x, "urlPattern", js.undefined)
  }
}
