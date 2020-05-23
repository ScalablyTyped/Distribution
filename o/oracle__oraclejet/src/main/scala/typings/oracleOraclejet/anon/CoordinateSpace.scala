package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoordinateSpace extends js.Object {
  var coordinateSpace: js.Any
  var id: js.Any
  var labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
  var path: String
}

object CoordinateSpace {
  @scala.inline
  def apply(
    coordinateSpace: js.Any,
    id: js.Any,
    labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout,
    path: String
  ): CoordinateSpace = {
    val __obj = js.Dynamic.literal(coordinateSpace = coordinateSpace.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labelLayout = labelLayout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinateSpace]
  }
}

