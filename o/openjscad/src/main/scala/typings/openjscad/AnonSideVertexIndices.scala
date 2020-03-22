package typings.openjscad

import typings.std.Float64Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSideVertexIndices extends js.Object {
  var `class`: String
  var sideVertexIndices: Uint32Array
  var vertexData: Float64Array
}

object AnonSideVertexIndices {
  @scala.inline
  def apply(`class`: String, sideVertexIndices: Uint32Array, vertexData: Float64Array): AnonSideVertexIndices = {
    val __obj = js.Dynamic.literal(sideVertexIndices = sideVertexIndices.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSideVertexIndices]
  }
}

