package typings.musickitJs.MusicKit

import typings.musickitJs.anon.Curator
import typings.musickitJs.anon.CuratorName
import typings.musickitJs.anon.Featuredartists
import typings.musickitJs.musickitJsStrings.playlists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents a playlist.
  * https://developer.apple.com/documentation/applemusicapi/playlists-ulf
  */
trait Playlists
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_Playlists: js.UndefOr[CuratorName] = js.undefined
  
  @JSName("id")
  var id_Playlists: MusicItemID
  
  @JSName("relationships")
  var relationships_Playlists: Curator
  
  @JSName("type")
  var type_Playlists: playlists
  
  @JSName("views")
  var views_Playlists: Featuredartists
}
object Playlists {
  
  inline def apply(href: String, id: MusicItemID, relationships: Curator, views: Featuredartists): Playlists = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("playlists")
    __obj.asInstanceOf[Playlists]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Playlists] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: CuratorName): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setId(value: MusicItemID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRelationships(value: Curator): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setType(value: playlists): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViews(value: Featuredartists): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
