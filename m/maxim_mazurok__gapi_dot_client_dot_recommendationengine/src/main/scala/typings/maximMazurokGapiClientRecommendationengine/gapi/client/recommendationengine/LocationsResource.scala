package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var catalogs: CatalogsResource
}
object LocationsResource {
  
  inline def apply(catalogs: CatalogsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(catalogs = catalogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setCatalogs(value: CatalogsResource): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
  }
}
