package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsGetBySlugEndpoint extends StObject {
  
  var app_slug: String
}
object AppsGetBySlugEndpoint {
  
  inline def apply(app_slug: String): AppsGetBySlugEndpoint = {
    val __obj = js.Dynamic.literal(app_slug = app_slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetBySlugEndpoint]
  }
  
  extension [Self <: AppsGetBySlugEndpoint](x: Self) {
    
    inline def setApp_slug(value: String): Self = StObject.set(x, "app_slug", value.asInstanceOf[js.Any])
  }
}
