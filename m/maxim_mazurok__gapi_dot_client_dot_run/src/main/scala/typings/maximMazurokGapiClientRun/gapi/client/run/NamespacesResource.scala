package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamespacesResource extends StObject {
  
  var authorizeddomains: AuthorizeddomainsResource
  
  var configurations: ConfigurationsResource
  
  var domainmappings: DomainmappingsResource
  
  var revisions: RevisionsResource
  
  var routes: RoutesResource
  
  var services: ServicesResource
}
object NamespacesResource {
  
  inline def apply(
    authorizeddomains: AuthorizeddomainsResource,
    configurations: ConfigurationsResource,
    domainmappings: DomainmappingsResource,
    revisions: RevisionsResource,
    routes: RoutesResource,
    services: ServicesResource
  ): NamespacesResource = {
    val __obj = js.Dynamic.literal(authorizeddomains = authorizeddomains.asInstanceOf[js.Any], configurations = configurations.asInstanceOf[js.Any], domainmappings = domainmappings.asInstanceOf[js.Any], revisions = revisions.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespacesResource]
  }
  
  extension [Self <: NamespacesResource](x: Self) {
    
    inline def setAuthorizeddomains(value: AuthorizeddomainsResource): Self = StObject.set(x, "authorizeddomains", value.asInstanceOf[js.Any])
    
    inline def setConfigurations(value: ConfigurationsResource): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setDomainmappings(value: DomainmappingsResource): Self = StObject.set(x, "domainmappings", value.asInstanceOf[js.Any])
    
    inline def setRevisions(value: RevisionsResource): Self = StObject.set(x, "revisions", value.asInstanceOf[js.Any])
    
    inline def setRoutes(value: RoutesResource): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setServices(value: ServicesResource): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
  }
}
