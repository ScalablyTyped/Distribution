package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diffurl extends StObject {
  
  /** Format: uri */
  var diff_url: String | Null
  
  /** Format: uri */
  var html_url: String | Null
  
  /** Format: date-time */
  var merged_at: js.UndefOr[String | Null] = js.undefined
  
  /** Format: uri */
  var patch_url: String | Null
  
  /** Format: uri */
  var url: String | Null
}
object Diffurl {
  
  inline def apply(): Diffurl = {
    val __obj = js.Dynamic.literal(diff_url = null, html_url = null, patch_url = null, url = null)
    __obj.asInstanceOf[Diffurl]
  }
  
  extension [Self <: Diffurl](x: Self) {
    
    inline def setDiff_url(value: String): Self = StObject.set(x, "diff_url", value.asInstanceOf[js.Any])
    
    inline def setDiff_urlNull: Self = StObject.set(x, "diff_url", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlNull: Self = StObject.set(x, "html_url", null)
    
    inline def setMerged_at(value: String): Self = StObject.set(x, "merged_at", value.asInstanceOf[js.Any])
    
    inline def setMerged_atNull: Self = StObject.set(x, "merged_at", null)
    
    inline def setMerged_atUndefined: Self = StObject.set(x, "merged_at", js.undefined)
    
    inline def setPatch_url(value: String): Self = StObject.set(x, "patch_url", value.asInstanceOf[js.Any])
    
    inline def setPatch_urlNull: Self = StObject.set(x, "patch_url", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
  }
}
