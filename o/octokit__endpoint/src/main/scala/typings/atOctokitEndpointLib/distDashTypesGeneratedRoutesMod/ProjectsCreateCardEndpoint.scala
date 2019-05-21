package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateCardEndpoint extends js.Object {
  var column_id: scala.Double
  var content_id: js.UndefOr[scala.Double] = js.undefined
  var content_type: js.UndefOr[java.lang.String] = js.undefined
  var note: js.UndefOr[java.lang.String] = js.undefined
}

object ProjectsCreateCardEndpoint {
  @scala.inline
  def apply(
    column_id: scala.Double,
    content_id: scala.Int | scala.Double = null,
    content_type: java.lang.String = null,
    note: java.lang.String = null
  ): ProjectsCreateCardEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id)
    if (content_id != null) __obj.updateDynamic("content_id")(content_id.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (note != null) __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[ProjectsCreateCardEndpoint]
  }
}

