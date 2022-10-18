package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asset extends StObject {
  
  /**
    * The canonical name of the resource. It's either "organizations/{organization_id}/assets/{asset_id}", "folders/{folder_id}/assets/{asset_id}" or
    * "projects/{project_number}/assets/{asset_id}", depending on the closest CRM ancestor of the resource.
    */
  var canonicalName: js.UndefOr[String] = js.undefined
  
  /** The time at which the asset was created in Security Command Center. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Cloud IAM Policy information associated with the Google Cloud resource described by the Security Command Center asset. This information is managed and defined by the Google Cloud
    * resource and cannot be modified by the user.
    */
  var iamPolicy: js.UndefOr[IamPolicy] = js.undefined
  
  /**
    * The relative resource name of this asset. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
    * "organizations/{organization_id}/assets/{asset_id}".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Resource managed properties. These properties are managed and defined by the Google Cloud resource and cannot be modified by the user. */
  var resourceProperties: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** Security Command Center managed properties. These properties are managed by Security Command Center and cannot be modified by the user. */
  var securityCenterProperties: js.UndefOr[SecurityCenterProperties] = js.undefined
  
  /** User specified security marks. These marks are entirely managed by the user and come from the SecurityMarks resource that belongs to the asset. */
  var securityMarks: js.UndefOr[SecurityMarks] = js.undefined
  
  /** The time at which the asset was last updated or added in Cloud SCC. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Asset {
  
  inline def apply(): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asset]
  }
  
  extension [Self <: Asset](x: Self) {
    
    inline def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
    
    inline def setCanonicalNameUndefined: Self = StObject.set(x, "canonicalName", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setIamPolicy(value: IamPolicy): Self = StObject.set(x, "iamPolicy", value.asInstanceOf[js.Any])
    
    inline def setIamPolicyUndefined: Self = StObject.set(x, "iamPolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceProperties(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "resourceProperties", value.asInstanceOf[js.Any])
    
    inline def setResourcePropertiesUndefined: Self = StObject.set(x, "resourceProperties", js.undefined)
    
    inline def setSecurityCenterProperties(value: SecurityCenterProperties): Self = StObject.set(x, "securityCenterProperties", value.asInstanceOf[js.Any])
    
    inline def setSecurityCenterPropertiesUndefined: Self = StObject.set(x, "securityCenterProperties", js.undefined)
    
    inline def setSecurityMarks(value: SecurityMarks): Self = StObject.set(x, "securityMarks", value.asInstanceOf[js.Any])
    
    inline def setSecurityMarksUndefined: Self = StObject.set(x, "securityMarks", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
