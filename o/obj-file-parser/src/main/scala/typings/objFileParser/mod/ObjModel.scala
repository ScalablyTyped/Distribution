package typings.objFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjModel extends js.Object {
  var faces: js.Array[Face]
  var name: String
  var textureCoords: js.Array[VertexTexture]
  var vertexNormals: js.Array[Vertex]
  var vertices: js.Array[Vertex]
}

object ObjModel {
  @scala.inline
  def apply(
    faces: js.Array[Face],
    name: String,
    textureCoords: js.Array[VertexTexture],
    vertexNormals: js.Array[Vertex],
    vertices: js.Array[Vertex]
  ): ObjModel = {
    val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textureCoords = textureCoords.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjModel]
  }
}

