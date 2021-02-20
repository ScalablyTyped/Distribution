package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Documentation extends StObject {
  
  /** The URL to the root of documentation. */
  var documentationRootUrl: js.UndefOr[String] = js.native
  
  /**
    * Declares a single overview page. For example: documentation: summary: ... overview: (== include overview.md ==) This is a shortcut for the following declaration (using pages style):
    * documentation: summary: ... pages: - name: Overview content: (== include overview.md ==) Note: you cannot specify both `overview` field and `pages` field.
    */
  var overview: js.UndefOr[String] = js.native
  
  /** The top level pages for the documentation set. */
  var pages: js.UndefOr[js.Array[Page]] = js.native
  
  /** A list of documentation rules that apply to individual API elements. **NOTE:** All service configuration rules follow "last one wins" order. */
  var rules: js.UndefOr[js.Array[DocumentationRule]] = js.native
  
  /**
    * Specifies the service root url if the default one (the service name from the yaml file) is not suitable. This can be seen in any fully specified service urls as well as sections
    * that show a base that other urls are relative to.
    */
  var serviceRootUrl: js.UndefOr[String] = js.native
  
  /** A short summary of what the service does. Can only be provided by plain text. */
  var summary: js.UndefOr[String] = js.native
}
object Documentation {
  
  @scala.inline
  def apply(): Documentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Documentation]
  }
  
  @scala.inline
  implicit class DocumentationMutableBuilder[Self <: Documentation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentationRootUrl(value: String): Self = StObject.set(x, "documentationRootUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationRootUrlUndefined: Self = StObject.set(x, "documentationRootUrl", js.undefined)
    
    @scala.inline
    def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    @scala.inline
    def setPages(value: js.Array[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setPagesVarargs(value: Page*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[DocumentationRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: DocumentationRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    @scala.inline
    def setServiceRootUrl(value: String): Self = StObject.set(x, "serviceRootUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRootUrlUndefined: Self = StObject.set(x, "serviceRootUrl", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
