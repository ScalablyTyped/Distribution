package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerVersionHeader extends StObject {
  
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.undefined
  
  /** The Container Version ID uniquely identifies the GTM Container Version. */
  var containerVersionId: js.UndefOr[String] = js.undefined
  
  /** A value of true indicates this container version has been deleted. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /** Container version display name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Number of clients in the container version. */
  var numClients: js.UndefOr[String] = js.undefined
  
  /** Number of custom templates in the container version. */
  var numCustomTemplates: js.UndefOr[String] = js.undefined
  
  /** Number of macros in the container version. */
  var numMacros: js.UndefOr[String] = js.undefined
  
  /** Number of rules in the container version. */
  var numRules: js.UndefOr[String] = js.undefined
  
  /** Number of tags in the container version. */
  var numTags: js.UndefOr[String] = js.undefined
  
  /** Number of triggers in the container version. */
  var numTriggers: js.UndefOr[String] = js.undefined
  
  /** Number of variables in the container version. */
  var numVariables: js.UndefOr[String] = js.undefined
  
  /** Number of zones in the container version. */
  var numZones: js.UndefOr[String] = js.undefined
  
  /** GTM Container Versions's API relative path. */
  var path: js.UndefOr[String] = js.undefined
}
object ContainerVersionHeader {
  
  inline def apply(): ContainerVersionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerVersionHeader]
  }
  
  extension [Self <: ContainerVersionHeader](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumClients(value: String): Self = StObject.set(x, "numClients", value.asInstanceOf[js.Any])
    
    inline def setNumClientsUndefined: Self = StObject.set(x, "numClients", js.undefined)
    
    inline def setNumCustomTemplates(value: String): Self = StObject.set(x, "numCustomTemplates", value.asInstanceOf[js.Any])
    
    inline def setNumCustomTemplatesUndefined: Self = StObject.set(x, "numCustomTemplates", js.undefined)
    
    inline def setNumMacros(value: String): Self = StObject.set(x, "numMacros", value.asInstanceOf[js.Any])
    
    inline def setNumMacrosUndefined: Self = StObject.set(x, "numMacros", js.undefined)
    
    inline def setNumRules(value: String): Self = StObject.set(x, "numRules", value.asInstanceOf[js.Any])
    
    inline def setNumRulesUndefined: Self = StObject.set(x, "numRules", js.undefined)
    
    inline def setNumTags(value: String): Self = StObject.set(x, "numTags", value.asInstanceOf[js.Any])
    
    inline def setNumTagsUndefined: Self = StObject.set(x, "numTags", js.undefined)
    
    inline def setNumTriggers(value: String): Self = StObject.set(x, "numTriggers", value.asInstanceOf[js.Any])
    
    inline def setNumTriggersUndefined: Self = StObject.set(x, "numTriggers", js.undefined)
    
    inline def setNumVariables(value: String): Self = StObject.set(x, "numVariables", value.asInstanceOf[js.Any])
    
    inline def setNumVariablesUndefined: Self = StObject.set(x, "numVariables", js.undefined)
    
    inline def setNumZones(value: String): Self = StObject.set(x, "numZones", value.asInstanceOf[js.Any])
    
    inline def setNumZonesUndefined: Self = StObject.set(x, "numZones", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
