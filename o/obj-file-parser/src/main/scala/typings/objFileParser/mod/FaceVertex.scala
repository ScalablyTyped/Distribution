package typings.objFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceVertex extends js.Object {
  var textureCoordsIndex: Double = js.native
  var vertexIndex: Double = js.native
  var vertexNormalIndex: Double = js.native
}

object FaceVertex {
  @scala.inline
  def apply(textureCoordsIndex: Double, vertexIndex: Double, vertexNormalIndex: Double): FaceVertex = {
    val __obj = js.Dynamic.literal(textureCoordsIndex = textureCoordsIndex.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any], vertexNormalIndex = vertexNormalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceVertex]
  }
  @scala.inline
  implicit class FaceVertexOps[Self <: FaceVertex] (val x: Self) extends AnyVal {
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
    def setTextureCoordsIndex(value: Double): Self = this.set("textureCoordsIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexIndex(value: Double): Self = this.set("vertexIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexNormalIndex(value: Double): Self = this.set("vertexNormalIndex", value.asInstanceOf[js.Any])
  }
  
}

