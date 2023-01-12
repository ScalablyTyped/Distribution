package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codeofconduct extends StObject {
  
  var code_of_conduct: HtmlurlKey | Null
  
  var code_of_conduct_file: HtmlurlUrl | Null
  
  var contributing: HtmlurlUrl | Null
  
  var issue_template: HtmlurlUrl | Null
  
  var license: Nodeid | Null
  
  var pull_request_template: HtmlurlUrl | Null
  
  var readme: HtmlurlUrl | Null
}
object Codeofconduct {
  
  inline def apply(): Codeofconduct = {
    val __obj = js.Dynamic.literal(code_of_conduct = null, code_of_conduct_file = null, contributing = null, issue_template = null, license = null, pull_request_template = null, readme = null)
    __obj.asInstanceOf[Codeofconduct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Codeofconduct] (val x: Self) extends AnyVal {
    
    inline def setCode_of_conduct(value: HtmlurlKey): Self = StObject.set(x, "code_of_conduct", value.asInstanceOf[js.Any])
    
    inline def setCode_of_conductNull: Self = StObject.set(x, "code_of_conduct", null)
    
    inline def setCode_of_conduct_file(value: HtmlurlUrl): Self = StObject.set(x, "code_of_conduct_file", value.asInstanceOf[js.Any])
    
    inline def setCode_of_conduct_fileNull: Self = StObject.set(x, "code_of_conduct_file", null)
    
    inline def setContributing(value: HtmlurlUrl): Self = StObject.set(x, "contributing", value.asInstanceOf[js.Any])
    
    inline def setContributingNull: Self = StObject.set(x, "contributing", null)
    
    inline def setIssue_template(value: HtmlurlUrl): Self = StObject.set(x, "issue_template", value.asInstanceOf[js.Any])
    
    inline def setIssue_templateNull: Self = StObject.set(x, "issue_template", null)
    
    inline def setLicense(value: Nodeid): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseNull: Self = StObject.set(x, "license", null)
    
    inline def setPull_request_template(value: HtmlurlUrl): Self = StObject.set(x, "pull_request_template", value.asInstanceOf[js.Any])
    
    inline def setPull_request_templateNull: Self = StObject.set(x, "pull_request_template", null)
    
    inline def setReadme(value: HtmlurlUrl): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
    
    inline def setReadmeNull: Self = StObject.set(x, "readme", null)
  }
}
