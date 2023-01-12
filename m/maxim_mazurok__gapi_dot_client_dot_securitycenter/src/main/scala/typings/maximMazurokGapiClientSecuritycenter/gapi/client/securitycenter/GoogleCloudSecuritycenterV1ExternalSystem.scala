package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSecuritycenterV1ExternalSystem extends StObject {
  
  /** References primary/secondary etc assignees in the external system. */
  var assignees: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The most recent time when the corresponding finding's ticket/tracker was updated in the external system. */
  var externalSystemUpdateTime: js.UndefOr[String] = js.undefined
  
  /** Identifier that's used to track the given finding in the external system. */
  var externalUid: js.UndefOr[String] = js.undefined
  
  /**
    * External System Name e.g. jira, demisto, etc. e.g.: `organizations/1234/sources/5678/findings/123456/externalSystems/jira`
    * `folders/1234/sources/5678/findings/123456/externalSystems/jira` `projects/1234/sources/5678/findings/123456/externalSystems/jira`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Most recent status of the corresponding finding's ticket/tracker in the external system. */
  var status: js.UndefOr[String] = js.undefined
}
object GoogleCloudSecuritycenterV1ExternalSystem {
  
  inline def apply(): GoogleCloudSecuritycenterV1ExternalSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1ExternalSystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudSecuritycenterV1ExternalSystem] (val x: Self) extends AnyVal {
    
    inline def setAssignees(value: js.Array[String]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    inline def setAssigneesUndefined: Self = StObject.set(x, "assignees", js.undefined)
    
    inline def setAssigneesVarargs(value: String*): Self = StObject.set(x, "assignees", js.Array(value*))
    
    inline def setExternalSystemUpdateTime(value: String): Self = StObject.set(x, "externalSystemUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setExternalSystemUpdateTimeUndefined: Self = StObject.set(x, "externalSystemUpdateTime", js.undefined)
    
    inline def setExternalUid(value: String): Self = StObject.set(x, "externalUid", value.asInstanceOf[js.Any])
    
    inline def setExternalUidUndefined: Self = StObject.set(x, "externalUid", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
