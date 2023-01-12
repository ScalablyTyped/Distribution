package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldersResource extends StObject {
  
  var locations: LocationsResource
}
object FoldersResource {
  
  inline def apply(locations: LocationsResource): FoldersResource = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldersResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FoldersResource] (val x: Self) extends AnyVal {
    
    inline def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
  }
}
