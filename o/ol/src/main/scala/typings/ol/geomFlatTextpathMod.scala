package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/textpath", JSImport.Namespace)
@js.native
object geomFlatTextpathMod extends js.Object {
  def drawTextOnPath(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    text: String,
    measure: js.Function1[/* p0 */ String, Double],
    startM: Double,
    maxAngle: Double
  ): js.Array[js.Array[_]] = js.native
}

