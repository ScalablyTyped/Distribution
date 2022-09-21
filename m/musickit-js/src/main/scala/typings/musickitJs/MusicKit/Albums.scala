package typings.musickitJs.MusicKit

import typings.musickitJs.anon.Appearson
import typings.musickitJs.anon.ArtistUrl
import typings.musickitJs.musickitJsStrings.albums
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents an album.
  * https://developer.apple.com/documentation/applemusicapi/albums-uib
  */
trait Albums
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_Albums: js.UndefOr[ArtistUrl] = js.undefined
  
  @JSName("relationships")
  var relationships_Albums: typings.musickitJs.anon.Artists
  
  @JSName("type")
  var type_Albums: albums
  
  @JSName("views")
  var views_Albums: Appearson
}
object Albums {
  
  inline def apply(href: String, id: String, relationships: typings.musickitJs.anon.Artists, views: Appearson): Albums = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("albums")
    __obj.asInstanceOf[Albums]
  }
  
  extension [Self <: Albums](x: Self) {
    
    inline def setAttributes(value: ArtistUrl): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRelationships(value: typings.musickitJs.anon.Artists): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setType(value: albums): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViews(value: Appearson): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
