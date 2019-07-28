package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateCardEndpoint extends js.Object {
  var column_id: Double
  var content_id: js.UndefOr[Double] = js.undefined
  var content_type: js.UndefOr[String] = js.undefined
  var note: js.UndefOr[String] = js.undefined
}

object ProjectsCreateCardEndpoint {
  @scala.inline
  def apply(
    column_id: Double,
    content_id: Int | Double = null,
    content_type: String = null,
    note: String = null
  ): ProjectsCreateCardEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id)
    if (content_id != null) __obj.updateDynamic("content_id")(content_id.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (note != null) __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[ProjectsCreateCardEndpoint]
  }
}

