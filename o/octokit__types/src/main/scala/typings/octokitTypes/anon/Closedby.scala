package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Closedby extends js.Object {
  var closed_at: String
  var closed_by: String
  var created_at: String
  var html_url: String
  var open: Boolean
  var rule_description: String
  var rule_id: String
  var rule_severity: String
  var tool: String
  var url: String
}

object Closedby {
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
  ): Closedby = {
    val __obj = js.Dynamic.literal(closed_at = closed_at.asInstanceOf[js.Any], closed_by = closed_by.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], rule_description = rule_description.asInstanceOf[js.Any], rule_id = rule_id.asInstanceOf[js.Any], rule_severity = rule_severity.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closedby]
  }
}

