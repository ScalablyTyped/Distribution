package typings.objDashFileDashParser.objDashFileDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Face extends js.Object {
  var group: String
  var material: js.Any
  var smoothingGroup: Double
  var vertices: js.Array[FaceVertex]
}

object Face {
  @scala.inline
  def apply(group: String, material: js.Any, smoothingGroup: Double, vertices: js.Array[FaceVertex]): Face = {
    val __obj = js.Dynamic.literal(group = group, material = material, smoothingGroup = smoothingGroup, vertices = vertices)
  
    __obj.asInstanceOf[Face]
  }
}

