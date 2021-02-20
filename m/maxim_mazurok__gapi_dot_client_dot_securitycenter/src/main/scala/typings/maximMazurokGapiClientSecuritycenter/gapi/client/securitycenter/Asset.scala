package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asset extends StObject {
  
  /** The time at which the asset was created in Security Command Center. */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Cloud IAM Policy information associated with the Google Cloud resource described by the Security Command Center asset. This information is managed and defined by the Google Cloud
    * resource and cannot be modified by the user.
    */
  var iamPolicy: js.UndefOr[IamPolicy] = js.native
  
  /**
    * The relative resource name of this asset. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
    * "organizations/{organization_id}/assets/{asset_id}".
    */
  var name: js.UndefOr[String] = js.native
  
  /** Resource managed properties. These properties are managed and defined by the Google Cloud resource and cannot be modified by the user. */
  var resourceProperties: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.Asset with TopLevel[js.Any]
  ] = js.native
  
  /** Security Command Center managed properties. These properties are managed by Security Command Center and cannot be modified by the user. */
  var securityCenterProperties: js.UndefOr[SecurityCenterProperties] = js.native
  
  /** User specified security marks. These marks are entirely managed by the user and come from the SecurityMarks resource that belongs to the asset. */
  var securityMarks: js.UndefOr[SecurityMarks] = js.native
  
  /** The time at which the asset was last updated, added, or deleted in Security Command Center. */
  var updateTime: js.UndefOr[String] = js.native
}
object Asset {
  
  @scala.inline
  def apply(): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asset]
  }
  
  @scala.inline
  implicit class AssetMutableBuilder[Self <: Asset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setIamPolicy(value: IamPolicy): Self = StObject.set(x, "iamPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamPolicyUndefined: Self = StObject.set(x, "iamPolicy", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.Asset with TopLevel[js.Any]
    ): Self = StObject.set(x, "resourceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePropertiesUndefined: Self = StObject.set(x, "resourceProperties", js.undefined)
    
    @scala.inline
    def setSecurityCenterProperties(value: SecurityCenterProperties): Self = StObject.set(x, "securityCenterProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityCenterPropertiesUndefined: Self = StObject.set(x, "securityCenterProperties", js.undefined)
    
    @scala.inline
    def setSecurityMarks(value: SecurityMarks): Self = StObject.set(x, "securityMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityMarksUndefined: Self = StObject.set(x, "securityMarks", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
