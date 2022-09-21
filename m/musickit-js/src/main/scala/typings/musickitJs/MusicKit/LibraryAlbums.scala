package typings.musickitJs.MusicKit

import typings.musickitJs.anon.Catalog
import typings.musickitJs.anon.DateAdded
import typings.musickitJs.musickitJsStrings.`library-albums`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents a library album.
  * https://developer.apple.com/documentation/applemusicapi/libraryalbums/
  */
trait LibraryAlbums
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_LibraryAlbums: js.UndefOr[DateAdded] = js.undefined
  
  @JSName("relationships")
  var relationships_LibraryAlbums: Catalog
  
  @JSName("type")
  var type_LibraryAlbums: `library-albums`
}
object LibraryAlbums {
  
  inline def apply(href: String, id: String, relationships: Catalog): LibraryAlbums = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("library-albums")
    __obj.asInstanceOf[LibraryAlbums]
  }
  
  extension [Self <: LibraryAlbums](x: Self) {
    
    inline def setAttributes(value: DateAdded): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRelationships(value: Catalog): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setType(value: `library-albums`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
