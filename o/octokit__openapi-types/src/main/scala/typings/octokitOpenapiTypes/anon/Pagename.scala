package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pagename extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var html_url: js.UndefOr[String] = js.undefined
  
  var page_name: js.UndefOr[String] = js.undefined
  
  var sha: js.UndefOr[String] = js.undefined
  
  var summary: js.UndefOr[String | Null] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object Pagename {
  
  inline def apply(): Pagename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pagename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pagename] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setPage_name(value: String): Self = StObject.set(x, "page_name", value.asInstanceOf[js.Any])
    
    inline def setPage_nameUndefined: Self = StObject.set(x, "page_name", js.undefined)
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
