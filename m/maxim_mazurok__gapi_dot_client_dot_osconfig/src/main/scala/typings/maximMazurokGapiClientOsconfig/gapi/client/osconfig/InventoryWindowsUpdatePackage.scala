package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryWindowsUpdatePackage extends StObject {
  
  /** The categories that are associated with this update package. */
  var categories: js.UndefOr[js.Array[InventoryWindowsUpdatePackageWindowsUpdateCategory]] = js.undefined
  
  /** The localized description of the update package. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A collection of Microsoft Knowledge Base article IDs that are associated with the update package. */
  var kbArticleIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The last published date of the update, in (UTC) date and time. */
  var lastDeploymentChangeTime: js.UndefOr[String] = js.undefined
  
  /** A collection of URLs that provide more information about the update package. */
  var moreInfoUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The revision number of this update package. */
  var revisionNumber: js.UndefOr[Double] = js.undefined
  
  /** A hyperlink to the language-specific support information for the update. */
  var supportUrl: js.UndefOr[String] = js.undefined
  
  /** The localized title of the update package. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Gets the identifier of an update package. Stays the same across revisions. */
  var updateId: js.UndefOr[String] = js.undefined
}
object InventoryWindowsUpdatePackage {
  
  inline def apply(): InventoryWindowsUpdatePackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryWindowsUpdatePackage]
  }
  
  extension [Self <: InventoryWindowsUpdatePackage](x: Self) {
    
    inline def setCategories(value: js.Array[InventoryWindowsUpdatePackageWindowsUpdateCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: InventoryWindowsUpdatePackageWindowsUpdateCategory*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKbArticleIds(value: js.Array[String]): Self = StObject.set(x, "kbArticleIds", value.asInstanceOf[js.Any])
    
    inline def setKbArticleIdsUndefined: Self = StObject.set(x, "kbArticleIds", js.undefined)
    
    inline def setKbArticleIdsVarargs(value: String*): Self = StObject.set(x, "kbArticleIds", js.Array(value :_*))
    
    inline def setLastDeploymentChangeTime(value: String): Self = StObject.set(x, "lastDeploymentChangeTime", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentChangeTimeUndefined: Self = StObject.set(x, "lastDeploymentChangeTime", js.undefined)
    
    inline def setMoreInfoUrls(value: js.Array[String]): Self = StObject.set(x, "moreInfoUrls", value.asInstanceOf[js.Any])
    
    inline def setMoreInfoUrlsUndefined: Self = StObject.set(x, "moreInfoUrls", js.undefined)
    
    inline def setMoreInfoUrlsVarargs(value: String*): Self = StObject.set(x, "moreInfoUrls", js.Array(value :_*))
    
    inline def setRevisionNumber(value: Double): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    inline def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
    
    inline def setSupportUrl(value: String): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlUndefined: Self = StObject.set(x, "supportUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateId(value: String): Self = StObject.set(x, "updateId", value.asInstanceOf[js.Any])
    
    inline def setUpdateIdUndefined: Self = StObject.set(x, "updateId", js.undefined)
  }
}
