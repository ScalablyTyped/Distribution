package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoordinateSpace extends js.Object {
  var coordinateSpace: js.Any
  var id: js.Any
  var labelLayout: atOracleOraclejetLib.ojdiagramDashUtilsMod.LabelLayout
  var path: java.lang.String
}

object Anon_CoordinateSpace {
  @scala.inline
  def apply(
    coordinateSpace: js.Any,
    id: js.Any,
    labelLayout: atOracleOraclejetLib.ojdiagramDashUtilsMod.LabelLayout,
    path: java.lang.String
  ): Anon_CoordinateSpace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coordinateSpace")(coordinateSpace)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("labelLayout")(labelLayout)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_CoordinateSpace]
  }
}

