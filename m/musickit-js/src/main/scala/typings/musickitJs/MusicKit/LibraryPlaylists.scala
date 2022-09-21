package typings.musickitJs.MusicKit

import typings.musickitJs.anon.CanEdit
import typings.musickitJs.anon.Tracks
import typings.musickitJs.musickitJsStrings.`library-playlists`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents a library playlist.
  * https://developer.apple.com/documentation/applemusicapi/libraryplaylists/
  */
trait LibraryPlaylists
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_LibraryPlaylists: js.UndefOr[CanEdit] = js.undefined
  
  @JSName("relationships")
  var relationships_LibraryPlaylists: Tracks
  
  @JSName("type")
  var type_LibraryPlaylists: `library-playlists`
}
object LibraryPlaylists {
  
  inline def apply(href: String, id: String, relationships: Tracks): LibraryPlaylists = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("library-playlists")
    __obj.asInstanceOf[LibraryPlaylists]
  }
  
  extension [Self <: LibraryPlaylists](x: Self) {
    
    inline def setAttributes(value: CanEdit): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRelationships(value: Tracks): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setType(value: `library-playlists`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
