package typings.musickitJs.MusicKit

import typings.musickitJs.anon.AlbumName
import typings.musickitJs.musickitJsStrings.songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents a song.
  * https://developer.apple.com/documentation/applemusicapi/songs-um8
  */
trait Songs
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_Songs: js.UndefOr[AlbumName] = js.undefined
  
  @JSName("id")
  var id_Songs: MusicItemID
  
  @JSName("relationships")
  var relationships_Songs: typings.musickitJs.anon.Albums
  
  @JSName("type")
  var type_Songs: songs
}
object Songs {
  
  inline def apply(href: String, id: MusicItemID, relationships: typings.musickitJs.anon.Albums): Songs = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("songs")
    __obj.asInstanceOf[Songs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Songs] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: AlbumName): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setId(value: MusicItemID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRelationships(value: typings.musickitJs.anon.Albums): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setType(value: songs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
