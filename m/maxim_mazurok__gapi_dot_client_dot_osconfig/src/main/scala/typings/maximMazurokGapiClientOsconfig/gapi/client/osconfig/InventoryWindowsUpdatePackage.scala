package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryWindowsUpdatePackage extends js.Object {
  
  /** The categories that are associated with this update package. */
  var categories: js.UndefOr[js.Array[InventoryWindowsUpdatePackageWindowsUpdateCategory]] = js.native
  
  /** The localized description of the update package. */
  var description: js.UndefOr[String] = js.native
  
  /** A collection of Microsoft Knowledge Base article IDs that are associated with the update package. */
  var kbArticleIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The last published date of the update, in (UTC) date and time. */
  var lastDeploymentChangeTime: js.UndefOr[String] = js.native
  
  /** A collection of URLs that provide more information about the update package. */
  var moreInfoUrls: js.UndefOr[js.Array[String]] = js.native
  
  /** The revision number of this update package. */
  var revisionNumber: js.UndefOr[Double] = js.native
  
  /** A hyperlink to the language-specific support information for the update. */
  var supportUrl: js.UndefOr[String] = js.native
  
  /** The localized title of the update package. */
  var title: js.UndefOr[String] = js.native
  
  /** Gets the identifier of an update package. Stays the same across revisions. */
  var updateId: js.UndefOr[String] = js.native
}
object InventoryWindowsUpdatePackage {
  
  @scala.inline
  def apply(): InventoryWindowsUpdatePackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryWindowsUpdatePackage]
  }
  
  @scala.inline
  implicit class InventoryWindowsUpdatePackageOps[Self <: InventoryWindowsUpdatePackage] (val x: Self) extends AnyVal {
    
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
    def setCategoriesVarargs(value: InventoryWindowsUpdatePackageWindowsUpdateCategory*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[InventoryWindowsUpdatePackageWindowsUpdateCategory]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setKbArticleIdsVarargs(value: String*): Self = this.set("kbArticleIds", js.Array(value :_*))
    
    @scala.inline
    def setKbArticleIds(value: js.Array[String]): Self = this.set("kbArticleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKbArticleIds: Self = this.set("kbArticleIds", js.undefined)
    
    @scala.inline
    def setLastDeploymentChangeTime(value: String): Self = this.set("lastDeploymentChangeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDeploymentChangeTime: Self = this.set("lastDeploymentChangeTime", js.undefined)
    
    @scala.inline
    def setMoreInfoUrlsVarargs(value: String*): Self = this.set("moreInfoUrls", js.Array(value :_*))
    
    @scala.inline
    def setMoreInfoUrls(value: js.Array[String]): Self = this.set("moreInfoUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoreInfoUrls: Self = this.set("moreInfoUrls", js.undefined)
    
    @scala.inline
    def setRevisionNumber(value: Double): Self = this.set("revisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionNumber: Self = this.set("revisionNumber", js.undefined)
    
    @scala.inline
    def setSupportUrl(value: String): Self = this.set("supportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportUrl: Self = this.set("supportUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUpdateId(value: String): Self = this.set("updateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateId: Self = this.set("updateId", js.undefined)
  }
}
