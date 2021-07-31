package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  /**
    * DEPRECATED: This field is no longer supported. Instead of using aliases, please specify multiple google.api.Endpoint for each of the intended aliases. Additional names that this
    * endpoint will be hosted on.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Allowing [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka cross-domain traffic, would allow the backends served from this endpoint to receive and respond to
    * HTTP OPTIONS requests. The response will be used by the browser to determine whether the subsequent cross-origin request is allowed to proceed.
    */
  var allowCors: js.UndefOr[Boolean] = js.undefined
  
  /** The canonical name of this endpoint. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The specification of an Internet routable address of API frontend that will handle requests to this [API Endpoint](https://cloud.google.com/apis/design/glossary). It should be
    * either a valid IPv4 address or a fully-qualified domain name. For example, "8.8.8.8" or "myservice.appspot.com".
    */
  var target: js.UndefOr[String] = js.undefined
}
object Endpoint {
  
  @scala.inline
  def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setAllowCors(value: Boolean): Self = StObject.set(x, "allowCors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCorsUndefined: Self = StObject.set(x, "allowCors", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
