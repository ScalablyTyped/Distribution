package typings.openjscad

import typings.std.Float64Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassSideVertexIndices extends js.Object {
  var `class`: String
  var sideVertexIndices: Uint32Array
  var vertexData: Float64Array
}

object Anon_ClassSideVertexIndices {
  @scala.inline
  def apply(`class`: String, sideVertexIndices: Uint32Array, vertexData: Float64Array): Anon_ClassSideVertexIndices = {
    val __obj = js.Dynamic.literal(sideVertexIndices = sideVertexIndices, vertexData = vertexData)
    __obj.updateDynamic("class")(`class`)
    __obj.asInstanceOf[Anon_ClassSideVertexIndices]
  }
}

