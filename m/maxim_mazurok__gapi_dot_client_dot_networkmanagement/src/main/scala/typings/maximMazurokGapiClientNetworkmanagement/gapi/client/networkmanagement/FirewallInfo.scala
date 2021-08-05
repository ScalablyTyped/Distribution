package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallInfo extends StObject {
  
  /** Possible values: ALLOW, DENY */
  var action: js.UndefOr[String] = js.undefined
  
  /** Possible values: INGRESS, EGRESS */
  var direction: js.UndefOr[String] = js.undefined
  
  /** Name of a Compute Engine firewall rule. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** URI of a Compute Engine network. */
  var networkUri: js.UndefOr[String] = js.undefined
  
  /** Priority of the firewall rule. */
  var priority: js.UndefOr[Double] = js.undefined
  
  /** Target service accounts of the firewall rule. */
  var targetServiceAccounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Target tags of the firewall rule. */
  var targetTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** URI of a Compute Engine firewall rule. Implied default rule does not have URI. */
  var uri: js.UndefOr[String] = js.undefined
}
object FirewallInfo {
  
  inline def apply(): FirewallInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallInfo]
  }
  
  extension [Self <: FirewallInfo](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTargetServiceAccounts(value: js.Array[String]): Self = StObject.set(x, "targetServiceAccounts", value.asInstanceOf[js.Any])
    
    inline def setTargetServiceAccountsUndefined: Self = StObject.set(x, "targetServiceAccounts", js.undefined)
    
    inline def setTargetServiceAccountsVarargs(value: String*): Self = StObject.set(x, "targetServiceAccounts", js.Array(value :_*))
    
    inline def setTargetTags(value: js.Array[String]): Self = StObject.set(x, "targetTags", value.asInstanceOf[js.Any])
    
    inline def setTargetTagsUndefined: Self = StObject.set(x, "targetTags", js.undefined)
    
    inline def setTargetTagsVarargs(value: String*): Self = StObject.set(x, "targetTags", js.Array(value :_*))
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
