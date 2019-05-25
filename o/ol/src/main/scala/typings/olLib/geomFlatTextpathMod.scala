package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/textpath", JSImport.Namespace)
@js.native
object geomFlatTextpathMod extends js.Object {
  def drawTextOnPath(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    text: java.lang.String,
    measure: js.Function1[/* param0 */ java.lang.String, scala.Double],
    startM: scala.Double,
    maxAngle: scala.Double
  ): js.Array[js.Array[_]] = js.native
}

