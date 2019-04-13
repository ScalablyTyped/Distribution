package typings
package objDashFileDashParserLib.objDashFileDashParserMod

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
    val __obj = js.Dynamic.literal(faces = faces, name = name, textureCoords = textureCoords, vertexNormals = vertexNormals, vertices = vertices)
  
    __obj.asInstanceOf[ObjModel]
  }
}

