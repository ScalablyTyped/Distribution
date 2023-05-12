package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Integrationurl extends StObject {
  
  /**
    * @description The unique identifier of the deployment protection rule integration.
    * @example 3515
    */
  var id: Double
  
  /**
    * @description The URL for the endpoint to get details about the app.
    * @example https://api.github.com/apps/custom-app-slug
    */
  var integration_url: String
  
  /**
    * @description The node ID for the deployment protection rule integration.
    * @example MDQ6R2F0ZTM1MTU=
    */
  var node_id: String
  
  /**
    * @description The slugified name of the deployment protection rule integration.
    * @example my-custom-app
    */
  var slug: String
}
object Integrationurl {
  
  inline def apply(id: Double, integration_url: String, node_id: String, slug: String): Integrationurl = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], integration_url = integration_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Integrationurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Integrationurl] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIntegration_url(value: String): Self = StObject.set(x, "integration_url", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
  }
}
