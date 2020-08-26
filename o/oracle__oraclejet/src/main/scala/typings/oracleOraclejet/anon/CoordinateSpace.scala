package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoordinateSpace extends js.Object {
  var coordinateSpace: js.Any = js.native
  var id: js.Any = js.native
  var labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout = js.native
  var path: String = js.native
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
  @scala.inline
  implicit class CoordinateSpaceOps[Self <: CoordinateSpace] (val x: Self) extends AnyVal {
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
    def setCoordinateSpace(value: js.Any): Self = this.set("coordinateSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelLayout(value: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout): Self = this.set("labelLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

