package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnenoteEntitySchemaObjectModel extends OnenoteEntityBaseModel {
  /**
    * The date and time when the page was created. The timestamp represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
    * Read-only.
    */
  var createdDateTime: js.UndefOr[String] = js.native
}

object OnenoteEntitySchemaObjectModel {
  @scala.inline
  def apply(): OnenoteEntitySchemaObjectModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteEntitySchemaObjectModel]
  }
  @scala.inline
  implicit class OnenoteEntitySchemaObjectModelOps[Self <: OnenoteEntitySchemaObjectModel] (val x: Self) extends AnyVal {
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
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
  }
  
}

