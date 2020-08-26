package typings.objFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjModel extends js.Object {
  var faces: js.Array[Face] = js.native
  var name: String = js.native
  var textureCoords: js.Array[VertexTexture] = js.native
  var vertexNormals: js.Array[Vertex] = js.native
  var vertices: js.Array[Vertex] = js.native
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
  @scala.inline
  implicit class ObjModelOps[Self <: ObjModel] (val x: Self) extends AnyVal {
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
    def setFacesVarargs(value: Face*): Self = this.set("faces", js.Array(value :_*))
    @scala.inline
    def setFaces(value: js.Array[Face]): Self = this.set("faces", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextureCoordsVarargs(value: VertexTexture*): Self = this.set("textureCoords", js.Array(value :_*))
    @scala.inline
    def setTextureCoords(value: js.Array[VertexTexture]): Self = this.set("textureCoords", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexNormalsVarargs(value: Vertex*): Self = this.set("vertexNormals", js.Array(value :_*))
    @scala.inline
    def setVertexNormals(value: js.Array[Vertex]): Self = this.set("vertexNormals", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticesVarargs(value: Vertex*): Self = this.set("vertices", js.Array(value :_*))
    @scala.inline
    def setVertices(value: js.Array[Vertex]): Self = this.set("vertices", value.asInstanceOf[js.Any])
  }
  
}

