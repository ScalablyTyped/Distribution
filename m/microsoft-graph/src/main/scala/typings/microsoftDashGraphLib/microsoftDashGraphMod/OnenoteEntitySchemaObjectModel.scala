package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenoteEntitySchemaObjectModel extends OnenoteEntityBaseModel {
  /**
    * The date and time when the page was created. The timestamp represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
}

object OnenoteEntitySchemaObjectModel {
  @scala.inline
  def apply(
    createdDateTime: java.lang.String = null,
    id: java.lang.String = null,
    self: java.lang.String = null
  ): OnenoteEntitySchemaObjectModel = {
    val __obj = js.Dynamic.literal()
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (self != null) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[OnenoteEntitySchemaObjectModel]
  }
}

