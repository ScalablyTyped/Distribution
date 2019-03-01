package typings
package pouchdbDashMapreduceLib.PouchDBNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[Content /* <: js.Object */] extends js.Object {
  var offset: scala.Double
  var rows: js.Array[pouchdbDashMapreduceLib.Anon_Doc[Content]]
  var total_rows: scala.Double
}

object Response {
  @scala.inline
  def apply[Content /* <: js.Object */](
    offset: scala.Double,
    rows: js.Array[pouchdbDashMapreduceLib.Anon_Doc[Content]],
    total_rows: scala.Double
  ): Response[Content] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("rows")(rows)
    __obj.updateDynamic("total_rows")(total_rows)
    __obj.asInstanceOf[Response[Content]]
  }
}

