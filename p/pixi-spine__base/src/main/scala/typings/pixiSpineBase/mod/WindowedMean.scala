package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/base", "WindowedMean")
@js.native
open class WindowedMean () extends StObject {
  def this(windowSize: Double) = this()
  
  def addValue(value: Double): Unit = js.native
  
  var addedValues: Double = js.native
  
  var dirty: Boolean = js.native
  
  def getMean(): Double = js.native
  
  def hasEnoughData(): Boolean = js.native
  
  var lastValue: Double = js.native
  
  var mean: Double = js.native
  
  var values: js.Array[Double] = js.native
}
