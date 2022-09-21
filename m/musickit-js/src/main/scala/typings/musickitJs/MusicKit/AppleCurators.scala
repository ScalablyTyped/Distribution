package typings.musickitJs.MusicKit

import typings.musickitJs.musickitJsStrings.`apple-curators`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents an Apple curator.
  * https://developer.apple.com/documentation/applemusicapi/applecurators/
  */
trait AppleCurators
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_AppleCurators: js.UndefOr[typings.musickitJs.anon.Artwork] = js.undefined
  
  @JSName("relationships")
  var relationships_AppleCurators: typings.musickitJs.anon.Playlists
  
  @JSName("type")
  var type_AppleCurators: `apple-curators`
}
object AppleCurators {
  
  inline def apply(href: String, id: String, relationships: typings.musickitJs.anon.Playlists): AppleCurators = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("apple-curators")
    __obj.asInstanceOf[AppleCurators]
  }
  
  extension [Self <: AppleCurators](x: Self) {
    
    inline def setAttributes(value: typings.musickitJs.anon.Artwork): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRelationships(value: typings.musickitJs.anon.Playlists): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setType(value: `apple-curators`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
