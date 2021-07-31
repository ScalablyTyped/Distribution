package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.WindowedMean")
@js.native
class WindowedMean ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.WindowedMean {
  def this(windowSize: Double) = this()
  
  /* CompleteClass */
  override def addValue(value: Double): Unit = js.native
  
  /* CompleteClass */
  var addedValues: Double = js.native
  
  /* CompleteClass */
  var dirty: Boolean = js.native
  
  /* CompleteClass */
  override def getMean(): Double = js.native
  
  /* CompleteClass */
  override def hasEnoughData(): Boolean = js.native
  
  /* CompleteClass */
  var lastValue: Double = js.native
  
  /* CompleteClass */
  var mean: Double = js.native
  
  /* CompleteClass */
  var values: js.Array[Double] = js.native
}
