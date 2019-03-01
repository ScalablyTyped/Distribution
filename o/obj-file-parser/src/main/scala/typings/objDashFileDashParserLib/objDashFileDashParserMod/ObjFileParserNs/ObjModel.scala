package typings
package objDashFileDashParserLib.objDashFileDashParserMod.ObjFileParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjModel extends js.Object {
  var faces: js.Array[Face]
  var name: java.lang.String
  var textureCoords: js.Array[VertexTexture]
  var vertexNormals: js.Array[Vertex]
  var vertices: js.Array[Vertex]
}

object ObjModel {
  @scala.inline
  def apply(
    faces: js.Array[Face],
    name: java.lang.String,
    textureCoords: js.Array[VertexTexture],
    vertexNormals: js.Array[Vertex],
    vertices: js.Array[Vertex]
  ): ObjModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("faces")(faces)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("textureCoords")(textureCoords)
    __obj.updateDynamic("vertexNormals")(vertexNormals)
    __obj.updateDynamic("vertices")(vertices)
    __obj.asInstanceOf[ObjModel]
  }
}

