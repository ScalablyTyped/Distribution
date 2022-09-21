package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdiscoveryCustodian
  extends StObject
     with DataSourceContainer {
  
  // Date and time the custodian acknowledged a hold notification.
  var acknowledgedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Email address of the custodian.
  var email: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Operation entity that represents the latest indexing for the custodian.
  var lastIndexOperation: js.UndefOr[NullableOption[EdiscoveryIndexOperation]] = js.undefined
  
  // Data source entity for SharePoint sites associated with the custodian.
  var siteSources: js.UndefOr[NullableOption[js.Array[SiteSource]]] = js.undefined
  
  // Data source entity for groups associated with the custodian.
  var unifiedGroupSources: js.UndefOr[NullableOption[js.Array[UnifiedGroupSource]]] = js.undefined
  
  // Data source entity for a the custodian. This is the container for a custodian's mailbox and OneDrive for Business site.
  var userSources: js.UndefOr[NullableOption[js.Array[UserSource]]] = js.undefined
}
object EdiscoveryCustodian {
  
  inline def apply(): EdiscoveryCustodian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdiscoveryCustodian]
  }
  
  extension [Self <: EdiscoveryCustodian](x: Self) {
    
    inline def setAcknowledgedDateTime(value: NullableOption[String]): Self = StObject.set(x, "acknowledgedDateTime", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgedDateTimeNull: Self = StObject.set(x, "acknowledgedDateTime", null)
    
    inline def setAcknowledgedDateTimeUndefined: Self = StObject.set(x, "acknowledgedDateTime", js.undefined)
    
    inline def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setLastIndexOperation(value: NullableOption[EdiscoveryIndexOperation]): Self = StObject.set(x, "lastIndexOperation", value.asInstanceOf[js.Any])
    
    inline def setLastIndexOperationNull: Self = StObject.set(x, "lastIndexOperation", null)
    
    inline def setLastIndexOperationUndefined: Self = StObject.set(x, "lastIndexOperation", js.undefined)
    
    inline def setSiteSources(value: NullableOption[js.Array[SiteSource]]): Self = StObject.set(x, "siteSources", value.asInstanceOf[js.Any])
    
    inline def setSiteSourcesNull: Self = StObject.set(x, "siteSources", null)
    
    inline def setSiteSourcesUndefined: Self = StObject.set(x, "siteSources", js.undefined)
    
    inline def setSiteSourcesVarargs(value: SiteSource*): Self = StObject.set(x, "siteSources", js.Array(value*))
    
    inline def setUnifiedGroupSources(value: NullableOption[js.Array[UnifiedGroupSource]]): Self = StObject.set(x, "unifiedGroupSources", value.asInstanceOf[js.Any])
    
    inline def setUnifiedGroupSourcesNull: Self = StObject.set(x, "unifiedGroupSources", null)
    
    inline def setUnifiedGroupSourcesUndefined: Self = StObject.set(x, "unifiedGroupSources", js.undefined)
    
    inline def setUnifiedGroupSourcesVarargs(value: UnifiedGroupSource*): Self = StObject.set(x, "unifiedGroupSources", js.Array(value*))
    
    inline def setUserSources(value: NullableOption[js.Array[UserSource]]): Self = StObject.set(x, "userSources", value.asInstanceOf[js.Any])
    
    inline def setUserSourcesNull: Self = StObject.set(x, "userSources", null)
    
    inline def setUserSourcesUndefined: Self = StObject.set(x, "userSources", js.undefined)
    
    inline def setUserSourcesVarargs(value: UserSource*): Self = StObject.set(x, "userSources", js.Array(value*))
  }
}
