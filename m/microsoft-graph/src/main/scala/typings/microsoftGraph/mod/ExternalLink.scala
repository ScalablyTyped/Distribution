package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalLink extends StObject {
  
  // The url of the link.
  var href: js.UndefOr[NullableOption[String]] = js.undefined
}
object ExternalLink {
  
  inline def apply(): ExternalLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalLink] (val x: Self) extends AnyVal {
    
    inline def setHref(value: NullableOption[String]): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefNull: Self = StObject.set(x, "href", null)
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
  }
}
