package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuperStickerMetadata extends StObject {
  
  /** Internationalized alt text that describes the sticker image and any animation associated with it. */
  var altText: js.UndefOr[String] = js.undefined
  
  /** Specifies the localization language in which the alt text is returned. */
  var altTextLanguage: js.UndefOr[String] = js.undefined
  
  /** Unique identifier of the Super Sticker. This is a shorter form of the alt_text that includes pack name and a recognizable characteristic of the sticker. */
  var stickerId: js.UndefOr[String] = js.undefined
}
object SuperStickerMetadata {
  
  inline def apply(): SuperStickerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuperStickerMetadata]
  }
  
  extension [Self <: SuperStickerMetadata](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextLanguage(value: String): Self = StObject.set(x, "altTextLanguage", value.asInstanceOf[js.Any])
    
    inline def setAltTextLanguageUndefined: Self = StObject.set(x, "altTextLanguage", js.undefined)
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setStickerId(value: String): Self = StObject.set(x, "stickerId", value.asInstanceOf[js.Any])
    
    inline def setStickerIdUndefined: Self = StObject.set(x, "stickerId", js.undefined)
  }
}
