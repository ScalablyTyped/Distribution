package typings.oracleOraclejet

import typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoordinateSpace extends js.Object {
  var coordinateSpace: js.Any
  var id: js.Any
  var labelLayout: LabelLayout
  var path: String
}

object AnonCoordinateSpace {
  @scala.inline
  def apply(coordinateSpace: js.Any, id: js.Any, labelLayout: LabelLayout, path: String): AnonCoordinateSpace = {
    val __obj = js.Dynamic.literal(coordinateSpace = coordinateSpace.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labelLayout = labelLayout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCoordinateSpace]
  }
}

