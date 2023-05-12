package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.edited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionHtmlurl extends StObject {
  
  /**
    * @description The action that was performed on the page. Can be `created` or `edited`.
    * @enum {string}
    */
  var action: created_ | edited
  
  /**
    * Format: uri
    * @description Points to the HTML wiki page.
    */
  var html_url: String
  
  /** @description The name of the page. */
  var page_name: String
  
  /** @description The latest commit SHA of the page. */
  var sha: String
  
  var summary: String | Null
  
  /** @description The current page title. */
  var title: String
}
object ActionHtmlurl {
  
  inline def apply(action: created_ | edited, html_url: String, page_name: String, sha: String, title: String): ActionHtmlurl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], page_name = page_name.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], summary = null)
    __obj.asInstanceOf[ActionHtmlurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionHtmlurl] (val x: Self) extends AnyVal {
    
    inline def setAction(value: created_ | edited): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setPage_name(value: String): Self = StObject.set(x, "page_name", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
