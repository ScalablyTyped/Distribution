package typings
package objDashFileDashParserLib.objDashFileDashParserMod.ObjFileParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceVertex extends js.Object {
  var textureCoordsIndex: scala.Double
  var vertexIndex: scala.Double
  var vertexNormalIndex: scala.Double
}

object FaceVertex {
  @scala.inline
  def apply(textureCoordsIndex: scala.Double, vertexIndex: scala.Double, vertexNormalIndex: scala.Double): FaceVertex = {
    val __obj = js.Dynamic.literal(textureCoordsIndex = textureCoordsIndex, vertexIndex = vertexIndex, vertexNormalIndex = vertexNormalIndex)
  
    __obj.asInstanceOf[FaceVertex]
  }
}

