package typings
package openjscadLib.CAGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CAG.fuzzyCAGFactory")
@js.native
class fuzzyCAGFactory () extends js.Object {
  var vertexfactory: openjscadLib.CSGNs.fuzzyFactory = js.native
  def getCAG(sourcecag: openjscadLib.CAG): openjscadLib.CAG = js.native
  def getSide(sourceside: Side): Side = js.native
  def getVertex(sourcevertex: Vertex): Vertex = js.native
}

