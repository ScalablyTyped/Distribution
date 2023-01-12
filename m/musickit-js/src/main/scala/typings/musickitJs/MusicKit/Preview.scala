package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that represents a preview for resources.
  * https://developer.apple.com/documentation/applemusicapi/preview
  */
trait Preview extends StObject {
  
  var artwork: Artwork
  
  var hlsUrl: String
  
  var url: String
}
object Preview {
  
  inline def apply(artwork: Artwork, hlsUrl: String, url: String): Preview = {
    val __obj = js.Dynamic.literal(artwork = artwork.asInstanceOf[js.Any], hlsUrl = hlsUrl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Preview] (val x: Self) extends AnyVal {
    
    inline def setArtwork(value: Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setHlsUrl(value: String): Self = StObject.set(x, "hlsUrl", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
