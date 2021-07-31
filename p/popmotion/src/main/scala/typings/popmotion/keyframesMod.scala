package typings.popmotion

import typings.popmotion.easingTypesMod.Easing
import typings.popmotion.typesMod.Animation
import typings.popmotion.typesMod.KeyframeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyframesMod {
  
  @JSImport("popmotion/lib/animations/generators/keyframes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertOffsetToTimes(offset: js.Array[Double], duration: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertOffsetToTimes")(offset.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def defaultEasing(values: js.Array[js.Any]): js.Array[Easing] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultEasing")(values.asInstanceOf[js.Any]).asInstanceOf[js.Array[Easing]]
  @scala.inline
  def defaultEasing(values: js.Array[js.Any], easing: Easing): js.Array[Easing] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultEasing")(values.asInstanceOf[js.Any], easing.asInstanceOf[js.Any])).asInstanceOf[js.Array[Easing]]
  
  @scala.inline
  def defaultOffset(values: js.Array[js.Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOffset")(values.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def keyframes[V](hasFromToEaseOffsetDuration: KeyframeOptions[Double]): Animation[Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(hasFromToEaseOffsetDuration.asInstanceOf[js.Any]).asInstanceOf[Animation[Double | String]]
}
