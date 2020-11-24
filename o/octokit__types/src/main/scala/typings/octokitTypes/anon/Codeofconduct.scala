package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Codeofconduct extends js.Object {
  
  var code_of_conduct: HtmlurlKey = js.native
  
  var contributing: HtmlurlUrl = js.native
  
  var issue_template: HtmlurlUrl = js.native
  
  var license: Spdxid = js.native
  
  var pull_request_template: HtmlurlUrl = js.native
  
  var readme: HtmlurlUrl = js.native
}
object Codeofconduct {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CodeofconductOps[Self <: Codeofconduct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode_of_conduct(value: HtmlurlKey): Self = this.set("code_of_conduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributing(value: HtmlurlUrl): Self = this.set("contributing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssue_template(value: HtmlurlUrl): Self = this.set("issue_template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicense(value: Spdxid): Self = this.set("license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_request_template(value: HtmlurlUrl): Self = this.set("pull_request_template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadme(value: HtmlurlUrl): Self = this.set("readme", value.asInstanceOf[js.Any])
  }
}
