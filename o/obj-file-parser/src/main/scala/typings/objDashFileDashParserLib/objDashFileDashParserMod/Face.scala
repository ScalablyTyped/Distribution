package typings
package objDashFileDashParserLib.objDashFileDashParserMod

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
    val __obj = js.Dynamic.literal(group = group, material = material, smoothingGroup = smoothingGroup, vertices = vertices)
  
    __obj.asInstanceOf[Face]
  }
}

