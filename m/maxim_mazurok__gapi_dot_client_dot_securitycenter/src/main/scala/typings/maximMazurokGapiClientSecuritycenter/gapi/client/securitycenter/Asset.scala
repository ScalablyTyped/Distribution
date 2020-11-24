package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asset extends js.Object {
  
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
  implicit class AssetOps[Self <: Asset] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setIamPolicy(value: IamPolicy): Self = this.set("iamPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamPolicy: Self = this.set("iamPolicy", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.Asset with TopLevel[js.Any]
    ): Self = this.set("resourceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceProperties: Self = this.set("resourceProperties", js.undefined)
    
    @scala.inline
    def setSecurityCenterProperties(value: SecurityCenterProperties): Self = this.set("securityCenterProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityCenterProperties: Self = this.set("securityCenterProperties", js.undefined)
    
    @scala.inline
    def setSecurityMarks(value: SecurityMarks): Self = this.set("securityMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityMarks: Self = this.set("securityMarks", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
