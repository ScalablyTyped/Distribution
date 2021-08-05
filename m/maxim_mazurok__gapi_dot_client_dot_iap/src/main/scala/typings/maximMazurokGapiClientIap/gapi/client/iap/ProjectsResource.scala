package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var brands: BrandsResource
}
object ProjectsResource {
  
  inline def apply(brands: BrandsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(brands = brands.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setBrands(value: BrandsResource): Self = StObject.set(x, "brands", value.asInstanceOf[js.Any])
  }
}
