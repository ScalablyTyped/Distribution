package typings.musickitJs.MusicKit

import typings.musickitJs.anon.ArtistName
import typings.musickitJs.anon.Morebyartist
import typings.musickitJs.musickitJsStrings.`music-videos`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents a music video.
  * https://developer.apple.com/documentation/applemusicapi/musicvideos/
  */
trait MusicVideos
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_MusicVideos: js.UndefOr[ArtistName] = js.undefined
  
  @JSName("id")
  var id_MusicVideos: MusicItemID
  
  @JSName("relationships")
  var relationships_MusicVideos: typings.musickitJs.anon.Genres
  
  @JSName("type")
  var type_MusicVideos: `music-videos`
  
  @JSName("views")
  var views_MusicVideos: Morebyartist
}
object MusicVideos {
  
  inline def apply(href: String, id: MusicItemID, relationships: typings.musickitJs.anon.Genres, views: Morebyartist): MusicVideos = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("music-videos")
    __obj.asInstanceOf[MusicVideos]
  }
  
  extension [Self <: MusicVideos](x: Self) {
    
    inline def setAttributes(value: ArtistName): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setId(value: MusicItemID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRelationships(value: typings.musickitJs.anon.Genres): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setType(value: `music-videos`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViews(value: Morebyartist): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
