package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReview extends StObject {
  
  /** Group is the API Group of the Resource. "*" means all. */
  var group: js.UndefOr[String] = js.undefined
  
  /** Name is the name of the resource being requested. Empty means all. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Namespace of the action being requested. Currently, there is no distinction between no namespace and all namespaces. Both are represented by "" (empty). */
  var ns: js.UndefOr[String] = js.undefined
  
  /** Resource is the optional resource type requested. "*" means all. */
  var resource: js.UndefOr[String] = js.undefined
  
  /** Subresource is the optional subresource type. */
  var subresource: js.UndefOr[String] = js.undefined
  
  /** Verb is a Kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy. "*" means all. */
  var verb: js.UndefOr[String] = js.undefined
  
  /** Version is the API Version of the Resource. "*" means all. */
  var version: js.UndefOr[String] = js.undefined
}
object AccessReview {
  
  inline def apply(): AccessReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReview]
  }
  
  extension [Self <: AccessReview](x: Self) {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setSubresource(value: String): Self = StObject.set(x, "subresource", value.asInstanceOf[js.Any])
    
    inline def setSubresourceUndefined: Self = StObject.set(x, "subresource", js.undefined)
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
