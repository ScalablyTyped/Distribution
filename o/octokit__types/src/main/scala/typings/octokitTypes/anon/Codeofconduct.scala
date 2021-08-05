package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codeofconduct extends StObject {
  
  var code_of_conduct: HtmlurlKey
  
  var contributing: HtmlurlUrl
  
  var issue_template: HtmlurlUrl
  
  var license: Spdxid
  
  var pull_request_template: HtmlurlUrl
  
  var readme: HtmlurlUrl
}
object Codeofconduct {
  
  inline def apply(
    code_of_conduct: HtmlurlKey,
    contributing: HtmlurlUrl,
    issue_template: HtmlurlUrl,
    license: Spdxid,
    pull_request_template: HtmlurlUrl,
    readme: HtmlurlUrl
  ): Codeofconduct = {
    val __obj = js.Dynamic.literal(code_of_conduct = code_of_conduct.asInstanceOf[js.Any], contributing = contributing.asInstanceOf[js.Any], issue_template = issue_template.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], pull_request_template = pull_request_template.asInstanceOf[js.Any], readme = readme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codeofconduct]
  }
  
  extension [Self <: Codeofconduct](x: Self) {
    
    inline def setCode_of_conduct(value: HtmlurlKey): Self = StObject.set(x, "code_of_conduct", value.asInstanceOf[js.Any])
    
    inline def setContributing(value: HtmlurlUrl): Self = StObject.set(x, "contributing", value.asInstanceOf[js.Any])
    
    inline def setIssue_template(value: HtmlurlUrl): Self = StObject.set(x, "issue_template", value.asInstanceOf[js.Any])
    
    inline def setLicense(value: Spdxid): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setPull_request_template(value: HtmlurlUrl): Self = StObject.set(x, "pull_request_template", value.asInstanceOf[js.Any])
    
    inline def setReadme(value: HtmlurlUrl): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
  }
}
