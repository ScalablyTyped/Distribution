package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mergedat extends StObject {
  
  /** Format: uri */
  var diff_url: js.UndefOr[String] = js.undefined
  
  /** Format: uri */
  var html_url: js.UndefOr[String] = js.undefined
  
  /** Format: date-time */
  var merged_at: js.UndefOr[String | Null] = js.undefined
  
  /** Format: uri */
  var patch_url: js.UndefOr[String] = js.undefined
  
  /** Format: uri */
  var url: js.UndefOr[String] = js.undefined
}
object Mergedat {
  
  inline def apply(): Mergedat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mergedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mergedat] (val x: Self) extends AnyVal {
    
    inline def setDiff_url(value: String): Self = StObject.set(x, "diff_url", value.asInstanceOf[js.Any])
    
    inline def setDiff_urlUndefined: Self = StObject.set(x, "diff_url", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setMerged_at(value: String): Self = StObject.set(x, "merged_at", value.asInstanceOf[js.Any])
    
    inline def setMerged_atNull: Self = StObject.set(x, "merged_at", null)
    
    inline def setMerged_atUndefined: Self = StObject.set(x, "merged_at", js.undefined)
    
    inline def setPatch_url(value: String): Self = StObject.set(x, "patch_url", value.asInstanceOf[js.Any])
    
    inline def setPatch_urlUndefined: Self = StObject.set(x, "patch_url", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
