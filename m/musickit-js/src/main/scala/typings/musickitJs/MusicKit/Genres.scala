package typings.musickitJs.MusicKit

import typings.musickitJs.anon.Name
import typings.musickitJs.musickitJsStrings.genres
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents a music genre.
  * https://developer.apple.com/documentation/applemusicapi/genres
  */
trait Genres
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_Genres: js.UndefOr[Name] = js.undefined
  
  @JSName("type")
  var type_Genres: genres
}
object Genres {
  
  inline def apply(href: String, id: String): Genres = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("genres")
    __obj.asInstanceOf[Genres]
  }
  
  extension [Self <: Genres](x: Self) {
    
    inline def setAttributes(value: Name): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setType(value: genres): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
