package typings.openjscad.CAG

import typings.openjscad.CSG.fuzzyFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fuzzyCAGFactory extends js.Object {
  var vertexfactory: fuzzyFactory
  def getCAG(sourcecag: typings.openjscad.CAG): typings.openjscad.CAG
  def getSide(sourceside: Side): Side
  def getVertex(sourcevertex: Vertex): Vertex
}

object fuzzyCAGFactory {
  @scala.inline
  def apply(
    getCAG: typings.openjscad.CAG => typings.openjscad.CAG,
    getSide: Side => Side,
    getVertex: Vertex => Vertex,
    vertexfactory: fuzzyFactory
  ): fuzzyCAGFactory = {
    val __obj = js.Dynamic.literal(getCAG = js.Any.fromFunction1(getCAG), getSide = js.Any.fromFunction1(getSide), getVertex = js.Any.fromFunction1(getVertex), vertexfactory = vertexfactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[fuzzyCAGFactory]
  }
}

