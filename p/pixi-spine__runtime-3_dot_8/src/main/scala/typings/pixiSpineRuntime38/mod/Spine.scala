package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.SpineBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "Spine")
@js.native
open class Spine protected () extends SpineBase[Skeleton, SkeletonData, AnimationState, AnimationStateData] {
  def this(spineData: SkeletonData) = this()
  
  def createSkeleton(spineData: SkeletonData): Unit = js.native
}
