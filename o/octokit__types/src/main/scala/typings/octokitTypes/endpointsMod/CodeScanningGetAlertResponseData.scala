package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeScanningGetAlertResponseData extends js.Object {
  var closed_at: String = js.native
  var closed_by: String = js.native
  var created_at: String = js.native
  var html_url: String = js.native
  var open: Boolean = js.native
  var rule_description: String = js.native
  var rule_id: String = js.native
  var rule_severity: String = js.native
  var tool: String = js.native
  var url: String = js.native
}

object CodeScanningGetAlertResponseData {
  @scala.inline
  def apply(
    closed_at: String,
    closed_by: String,
    created_at: String,
    html_url: String,
    open: Boolean,
    rule_description: String,
    rule_id: String,
    rule_severity: String,
    tool: String,
    url: String
  ): CodeScanningGetAlertResponseData = {
    val __obj = js.Dynamic.literal(closed_at = closed_at.asInstanceOf[js.Any], closed_by = closed_by.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], rule_description = rule_description.asInstanceOf[js.Any], rule_id = rule_id.asInstanceOf[js.Any], rule_severity = rule_severity.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningGetAlertResponseData]
  }
  @scala.inline
  implicit class CodeScanningGetAlertResponseDataOps[Self <: CodeScanningGetAlertResponseData] (val x: Self) extends AnyVal {
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
    def setClosed_at(value: String): Self = this.set("closed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosed_by(value: String): Self = this.set("closed_by", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule_description(value: String): Self = this.set("rule_description", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule_id(value: String): Self = this.set("rule_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule_severity(value: String): Self = this.set("rule_severity", value.asInstanceOf[js.Any])
    @scala.inline
    def setTool(value: String): Self = this.set("tool", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

