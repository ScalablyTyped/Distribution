package typings.objFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceVertex extends js.Object {
  var textureCoordsIndex: Double
  var vertexIndex: Double
  var vertexNormalIndex: Double
}

object FaceVertex {
  @scala.inline
  def apply(textureCoordsIndex: Double, vertexIndex: Double, vertexNormalIndex: Double): FaceVertex = {
    val __obj = js.Dynamic.literal(textureCoordsIndex = textureCoordsIndex.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any], vertexNormalIndex = vertexNormalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceVertex]
  }
}

