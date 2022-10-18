package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileAlternate extends StObject {
  
  var href: String
  
  var media: String
}
object MobileAlternate {
  
  inline def apply(href: String, media: String): MobileAlternate = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileAlternate]
  }
  
  extension [Self <: MobileAlternate](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
