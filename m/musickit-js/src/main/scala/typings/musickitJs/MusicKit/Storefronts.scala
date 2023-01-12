package typings.musickitJs.MusicKit

import typings.musickitJs.anon.DefaultLanguageTag
import typings.musickitJs.musickitJsStrings.storefronts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents a storefront, an Apple Music and iTunes Store territory that the content is available in.
  * https://developer.apple.com/documentation/applemusicapi/storefronts
  */
trait Storefronts
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_Storefronts: js.UndefOr[DefaultLanguageTag] = js.undefined
  
  @JSName("type")
  var type_Storefronts: storefronts
}
object Storefronts {
  
  inline def apply(href: String, id: String): Storefronts = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("storefronts")
    __obj.asInstanceOf[Storefronts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Storefronts] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: DefaultLanguageTag): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setType(value: storefronts): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
