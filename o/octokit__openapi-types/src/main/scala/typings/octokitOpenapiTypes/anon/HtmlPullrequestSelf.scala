package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlPullrequestSelf extends StObject {
  
  var html: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link'] */ js.Any
  
  var pull_request: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link'] */ js.Any
  
  var self: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link'] */ js.Any
}
object HtmlPullrequestSelf {
  
  inline def apply(
    html: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link'] */ js.Any,
    pull_request: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link'] */ js.Any,
    self: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link'] */ js.Any
  ): HtmlPullrequestSelf = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlPullrequestSelf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HtmlPullrequestSelf] (val x: Self) extends AnyVal {
    
    inline def setHtml(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link'] */ js.Any
    ): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setPull_request(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link'] */ js.Any
    ): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setSelf(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link'] */ js.Any
    ): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
