package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespacesResource extends StObject {
  
  var authorizeddomains: AuthorizeddomainsResource = js.native
  
  var configurations: ConfigurationsResource = js.native
  
  var domainmappings: DomainmappingsResource = js.native
  
  var revisions: RevisionsResource = js.native
  
  var routes: RoutesResource = js.native
  
  var services: ServicesResource = js.native
}
object NamespacesResource {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class NamespacesResourceMutableBuilder[Self <: NamespacesResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizeddomains(value: AuthorizeddomainsResource): Self = StObject.set(x, "authorizeddomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurations(value: ConfigurationsResource): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainmappings(value: DomainmappingsResource): Self = StObject.set(x, "domainmappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisions(value: RevisionsResource): Self = StObject.set(x, "revisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutes(value: RoutesResource): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServices(value: ServicesResource): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
  }
}
