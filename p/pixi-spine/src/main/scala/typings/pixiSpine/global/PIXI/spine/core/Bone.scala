package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.Bone")
@js.native
class Bone protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.Bone {
  def this(
    data: typings.pixiSpine.PIXI.spine.core.BoneData,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    parent: typings.pixiSpine.PIXI.spine.core.Bone
  ) = this()
  
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}
object Bone {
  
  @JSGlobal("PIXI.spine.core.Bone")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Bone.yDown")
  @js.native
  def yDown: Boolean = js.native
  inline def yDown_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yDown")(x.asInstanceOf[js.Any])
}
