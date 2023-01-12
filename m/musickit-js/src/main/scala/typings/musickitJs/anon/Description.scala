package typings.musickitJs.anon

import typings.musickitJs.MusicKit.DescriptionAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var artwork: typings.musickitJs.MusicKit.Artwork
  
  var description: DescriptionAttribute
  
  var name: String
  
  var url: String
}
object Description {
  
  inline def apply(
    artwork: typings.musickitJs.MusicKit.Artwork,
    description: DescriptionAttribute,
    name: String,
    url: String
  ): Description = {
    val __obj = js.Dynamic.literal(artwork = artwork.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
    
    inline def setArtwork(value: typings.musickitJs.MusicKit.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: DescriptionAttribute): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
