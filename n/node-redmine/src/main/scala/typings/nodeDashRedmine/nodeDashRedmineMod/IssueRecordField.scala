package typings.nodeDashRedmine.nodeDashRedmineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueRecordField extends js.Object {
  var id: Double
  var name: js.UndefOr[String] = js.undefined
}

object IssueRecordField {
  @scala.inline
  def apply(id: Double, name: String = null): IssueRecordField = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueRecordField]
  }
}

