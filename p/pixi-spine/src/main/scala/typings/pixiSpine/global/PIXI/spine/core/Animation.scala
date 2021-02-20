package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import typings.pixiSpine.PIXI.spine.core.Timeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.Animation")
@js.native
class Animation protected ()
  extends typings.pixiSpine.PIXI.spine.core.Animation {
  def this(name: String, timelines: js.Array[Timeline], duration: Double) = this()
}
object Animation {
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Animation.binarySearch")
  @js.native
  def binarySearch(values: ArrayLike[Double], target: Double): Double = js.native
  @JSGlobal("PIXI.spine.core.Animation.binarySearch")
  @js.native
  def binarySearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Animation.linearSearch")
  @js.native
  def linearSearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
}
