package typings
package openjscadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassSideVertexIndices extends js.Object {
  var `class`: java.lang.String
  var sideVertexIndices: stdLib.Uint32Array
  var vertexData: stdLib.Float64Array
}

object Anon_ClassSideVertexIndices {
  @scala.inline
  def apply(`class`: java.lang.String, sideVertexIndices: stdLib.Uint32Array, vertexData: stdLib.Float64Array): Anon_ClassSideVertexIndices = {
    val __obj = js.Dynamic.literal(sideVertexIndices = sideVertexIndices, vertexData = vertexData)
    __obj.updateDynamic("class")(`class`)
    __obj.asInstanceOf[Anon_ClassSideVertexIndices]
  }
}

