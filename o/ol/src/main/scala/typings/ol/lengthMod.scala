package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lengthMod {
  
  @JSImport("ol/geom/flat/length", "lineStringLength")
  @js.native
  def lineStringLength(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Double = js.native
  
  @JSImport("ol/geom/flat/length", "linearRingLength")
  @js.native
  def linearRingLength(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Double = js.native
}
