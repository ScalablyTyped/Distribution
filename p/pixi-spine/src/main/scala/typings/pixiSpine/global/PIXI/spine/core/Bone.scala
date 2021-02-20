package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.Bone")
@js.native
class Bone protected ()
  extends typings.pixiSpine.PIXI.spine.core.Bone {
  def this(
    data: typings.pixiSpine.PIXI.spine.core.BoneData,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    parent: typings.pixiSpine.PIXI.spine.core.Bone
  ) = this()
}
object Bone {
  
  @JSGlobal("PIXI.spine.core.Bone")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Bone.yDown")
  @js.native
  def yDown: Boolean = js.native
  @scala.inline
  def yDown_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yDown")(x.asInstanceOf[js.Any])
}
