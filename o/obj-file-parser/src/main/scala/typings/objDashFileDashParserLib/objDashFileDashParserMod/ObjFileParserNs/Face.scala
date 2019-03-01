package typings
package objDashFileDashParserLib.objDashFileDashParserMod.ObjFileParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Face extends js.Object {
  var group: java.lang.String
  var material: js.Any
  var smoothingGroup: scala.Double
  var vertices: js.Array[FaceVertex]
}

object Face {
  @scala.inline
  def apply(
    group: java.lang.String,
    material: js.Any,
    smoothingGroup: scala.Double,
    vertices: js.Array[FaceVertex]
  ): Face = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("material")(material)
    __obj.updateDynamic("smoothingGroup")(smoothingGroup)
    __obj.updateDynamic("vertices")(vertices)
    __obj.asInstanceOf[Face]
  }
}

