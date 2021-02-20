package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var catalogs: CatalogsResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(catalogs: CatalogsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(catalogs = catalogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceMutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogs(value: CatalogsResource): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
  }
}
