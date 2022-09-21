package typings.musickitJs.MusicKit

import typings.musickitJs.anon.Appearsonalbums
import typings.musickitJs.anon.GenreNames
import typings.musickitJs.anon.Musicvideos
import typings.musickitJs.musickitJsStrings.artists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents an artist of an album where an artist can be one or more persons.
  * https://developer.apple.com/documentation/applemusicapi/artists-uip
  */
trait Artists
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_Artists: js.UndefOr[GenreNames] = js.undefined
  
  @JSName("relationships")
  var relationships_Artists: Musicvideos
  
  @JSName("type")
  var type_Artists: artists
  
  @JSName("views")
  var views_Artists: Appearsonalbums
}
object Artists {
  
  inline def apply(href: String, id: String, relationships: Musicvideos, views: Appearsonalbums): Artists = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("artists")
    __obj.asInstanceOf[Artists]
  }
  
  extension [Self <: Artists](x: Self) {
    
    inline def setAttributes(value: GenreNames): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRelationships(value: Musicvideos): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setType(value: artists): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViews(value: Appearsonalbums): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
