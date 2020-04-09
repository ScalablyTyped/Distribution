package typings.pa11y.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var documentTitle: String
  var issues: js.Array[ResultIssue]
  var pageUrl: String
}

object Results {
  @scala.inline
  def apply(documentTitle: String, issues: js.Array[ResultIssue], pageUrl: String): Results = {
    val __obj = js.Dynamic.literal(documentTitle = documentTitle.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], pageUrl = pageUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Results]
  }
}

