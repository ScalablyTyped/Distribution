package typings.objDashFileDashParser.objDashFileDashParserMod

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
    val __obj = js.Dynamic.literal(textureCoordsIndex = textureCoordsIndex, vertexIndex = vertexIndex, vertexNormalIndex = vertexNormalIndex)
  
    __obj.asInstanceOf[FaceVertex]
  }
}

