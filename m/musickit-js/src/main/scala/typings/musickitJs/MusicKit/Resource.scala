package typings.musickitJs.MusicKit

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource—such as an album, song, or playlist.
  * https://developer.apple.com/documentation/applemusicapi/resource
  */
trait Resource extends StObject {
  
  var attributes: js.UndefOr[Record[String, Any]] = js.undefined
  
  var href: String
  
  var id: String
  
  var meta: js.UndefOr[Record[String, Any]] = js.undefined
  
  var relationships: js.UndefOr[Record[String, Relationship[Resource] | js.Array[Relationship[Resource]]]] = js.undefined
  
  var `type`: String
  
  var views: js.UndefOr[Record[String, View[Resource]]] = js.undefined
}
object Resource {
  
  inline def apply(href: String, id: String, `type`: String): Resource = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Record[String, Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setRelationships(value: Record[String, Relationship[Resource] | js.Array[Relationship[Resource]]]): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViews(value: Record[String, View[Resource]]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
  }
}
