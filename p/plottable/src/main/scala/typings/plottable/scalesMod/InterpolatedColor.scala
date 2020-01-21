package typings.plottable.scalesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/scales", "InterpolatedColor")
@js.native
/**
  * An InterpolatedColor Scale maps numbers to color hex values, expressed as strings.
  *
  * @param {string} [scaleType="linear"] One of "linear"/"log"/"sqrt"/"pow".
  */
class InterpolatedColor ()
  extends typings.plottable.interpolatedColorScaleMod.InterpolatedColor {
  def this(scaleType: String) = this()
}

/* static members */
@JSImport("plottable/build/src/scales", "InterpolatedColor")
@js.native
object InterpolatedColor extends js.Object {
  var BLUES: js.Array[String] = js.native
  var POSNEG: js.Array[String] = js.native
  var REDS: js.Array[String] = js.native
}

