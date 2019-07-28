package typings.openjscad.CAGNs

import typings.openjscad.CAG
import typings.openjscad.CSGNs.fuzzyFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CAG.fuzzyCAGFactory")
@js.native
class fuzzyCAGFactory () extends js.Object {
  var vertexfactory: fuzzyFactory = js.native
  def getCAG(sourcecag: CAG): CAG = js.native
  def getSide(sourceside: Side): Side = js.native
  def getVertex(sourcevertex: Vertex): Vertex = js.native
}

