package typings.popmotion

import typings.popmotion.easingTypesMod.Easing
import typings.popmotion.typesMod.Animation
import typings.popmotion.typesMod.KeyframeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyframesMod {
  
  @JSImport("popmotion/lib/animations/generators/keyframes", "convertOffsetToTimes")
  @js.native
  def convertOffsetToTimes(offset: js.Array[Double], duration: Double): js.Array[Double] = js.native
  
  @JSImport("popmotion/lib/animations/generators/keyframes", "defaultEasing")
  @js.native
  def defaultEasing(values: js.Array[_]): js.Array[Easing] = js.native
  @JSImport("popmotion/lib/animations/generators/keyframes", "defaultEasing")
  @js.native
  def defaultEasing(values: js.Array[_], easing: Easing): js.Array[Easing] = js.native
  
  @JSImport("popmotion/lib/animations/generators/keyframes", "defaultOffset")
  @js.native
  def defaultOffset(values: js.Array[_]): js.Array[Double] = js.native
  
  @JSImport("popmotion/lib/animations/generators/keyframes", "keyframes")
  @js.native
  def keyframes[V](hasFromToEaseOffsetDuration: KeyframeOptions[Double]): Animation[Double | String] = js.native
}
