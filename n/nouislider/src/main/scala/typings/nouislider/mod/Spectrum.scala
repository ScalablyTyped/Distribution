package typings.nouislider.mod

import typings.nouislider.nouisliderBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spectrum extends StObject {
  
  def convert(value: Double): Double = js.native
  
  def countStepDecimals(): Double = js.native
  
  def fromStepping(value: Double): Double = js.native
  
  def getAbsoluteDistance(value: Double, distances: js.Array[Double], direction: Boolean): Double = js.native
  def getAbsoluteDistance(value: Double, distances: Null, direction: Boolean): Double = js.native
  
  def getDefaultStep(value: Double, isDown: Boolean, size: Double): Double = js.native
  
  def getDistance(value: Double): js.Array[Double] = js.native
  
  def getNearbySteps(value: Double): NearBySteps = js.native
  
  def getStep(value: Double): Double = js.native
  
  /* private */ var handleEntryPoint: Any = js.native
  
  /* private */ var handleStepPoint: Any = js.native
  
  def hasNoSize(): Boolean = js.native
  
  /* protected */ var snap: Boolean = js.native
  
  def toStepping(value: Double): Double = js.native
  
  /* protected */ var xHighestCompleteStep: js.Array[Double] = js.native
  
  var xNumSteps: js.Array[Double | `false`] = js.native
  
  var xPct: js.Array[Double] = js.native
  
  var xSteps: js.Array[Double | `false`] = js.native
  
  var xVal: js.Array[Double] = js.native
}
