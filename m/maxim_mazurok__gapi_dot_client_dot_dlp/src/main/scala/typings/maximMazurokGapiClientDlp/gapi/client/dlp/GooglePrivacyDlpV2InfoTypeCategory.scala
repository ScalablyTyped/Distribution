package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InfoTypeCategory extends StObject {
  
  /** The group of relevant businesses where this infoType is commonly used */
  var industryCategory: js.UndefOr[String] = js.undefined
  
  /** The region or country that issued the ID or document represented by the infoType. */
  var locationCategory: js.UndefOr[String] = js.undefined
  
  /** The class of identifiers where this infoType belongs */
  var typeCategory: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2InfoTypeCategory {
  
  inline def apply(): GooglePrivacyDlpV2InfoTypeCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InfoTypeCategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2InfoTypeCategory] (val x: Self) extends AnyVal {
    
    inline def setIndustryCategory(value: String): Self = StObject.set(x, "industryCategory", value.asInstanceOf[js.Any])
    
    inline def setIndustryCategoryUndefined: Self = StObject.set(x, "industryCategory", js.undefined)
    
    inline def setLocationCategory(value: String): Self = StObject.set(x, "locationCategory", value.asInstanceOf[js.Any])
    
    inline def setLocationCategoryUndefined: Self = StObject.set(x, "locationCategory", js.undefined)
    
    inline def setTypeCategory(value: String): Self = StObject.set(x, "typeCategory", value.asInstanceOf[js.Any])
    
    inline def setTypeCategoryUndefined: Self = StObject.set(x, "typeCategory", js.undefined)
  }
}
