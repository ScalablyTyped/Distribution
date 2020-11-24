package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespacesResource extends js.Object {
  
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
  implicit class NamespacesResourceOps[Self <: NamespacesResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorizeddomains(value: AuthorizeddomainsResource): Self = this.set("authorizeddomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurations(value: ConfigurationsResource): Self = this.set("configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainmappings(value: DomainmappingsResource): Self = this.set("domainmappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisions(value: RevisionsResource): Self = this.set("revisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutes(value: RoutesResource): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServices(value: ServicesResource): Self = this.set("services", value.asInstanceOf[js.Any])
  }
}
