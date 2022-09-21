package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSecuritycenterV1p1beta1Finding extends StObject {
  
  /**
    * The canonical name of the finding. It's either "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}",
    * "folders/{folder_id}/sources/{source_id}/findings/{finding_id}" or "projects/{project_number}/sources/{source_id}/findings/{finding_id}", depending on the closest CRM ancestor of
    * the resource associated with the finding.
    */
  var canonicalName: js.UndefOr[String] = js.undefined
  
  /** The additional taxonomy group within findings from a given source. This field is immutable after creation time. Example: "XSS_FLASH_INJECTION" */
  var category: js.UndefOr[String] = js.undefined
  
  /** The time at which the finding was created in Security Command Center. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the event took place, or when an update to the finding occurred. For example, if the finding represents an open firewall it would capture the time the detector
    * believes the firewall became open. The accuracy is determined by the detector. If the finding were to be resolved afterward, this time would reflect when the finding was resolved.
    * Must not be set to a value greater than the current timestamp.
    */
  var eventTime: js.UndefOr[String] = js.undefined
  
  /**
    * The URI that, if available, points to a web page outside of Security Command Center where additional information about the finding can be found. This field is guaranteed to be
    * either empty or a well formed URL.
    */
  var externalUri: js.UndefOr[String] = js.undefined
  
  /**
    * The relative resource name of this finding. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
    * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The relative resource name of the source the finding belongs to. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name This field is immutable after
    * creation time. For example: "organizations/{organization_id}/sources/{source_id}"
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * For findings on Google Cloud resources, the full resource name of the Google Cloud resource this finding is for. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name When the finding is for a non-Google Cloud resource, the resourceName can be a customer or partner defined
    * string. This field is immutable after creation time.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /** Output only. User specified security marks. These marks are entirely managed by the user and come from the SecurityMarks resource that belongs to the finding. */
  var securityMarks: js.UndefOr[GoogleCloudSecuritycenterV1p1beta1SecurityMarks] = js.undefined
  
  /** The severity of the finding. This field is managed by the source that writes the finding. */
  var severity: js.UndefOr[String] = js.undefined
  
  /**
    * Source specific properties. These properties are managed by the source that writes the finding. The key names in the source_properties map must be between 1 and 255 characters, and
    * must start with a letter and contain alphanumeric characters or underscores only.
    */
  var sourceProperties: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.GoogleCloudSecuritycenterV1p1beta1Finding & TopLevel[Any]
  ] = js.undefined
  
  /** The state of the finding. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleCloudSecuritycenterV1p1beta1Finding {
  
  inline def apply(): GoogleCloudSecuritycenterV1p1beta1Finding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1p1beta1Finding]
  }
  
  extension [Self <: GoogleCloudSecuritycenterV1p1beta1Finding](x: Self) {
    
    inline def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
    
    inline def setCanonicalNameUndefined: Self = StObject.set(x, "canonicalName", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setExternalUri(value: String): Self = StObject.set(x, "externalUri", value.asInstanceOf[js.Any])
    
    inline def setExternalUriUndefined: Self = StObject.set(x, "externalUri", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setSecurityMarks(value: GoogleCloudSecuritycenterV1p1beta1SecurityMarks): Self = StObject.set(x, "securityMarks", value.asInstanceOf[js.Any])
    
    inline def setSecurityMarksUndefined: Self = StObject.set(x, "securityMarks", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSourceProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.GoogleCloudSecuritycenterV1p1beta1Finding & TopLevel[Any]
    ): Self = StObject.set(x, "sourceProperties", value.asInstanceOf[js.Any])
    
    inline def setSourcePropertiesUndefined: Self = StObject.set(x, "sourceProperties", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
