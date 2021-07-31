package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.IkConstraint")
@js.native
class IkConstraint protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.IkConstraint {
  def this(
    data: typings.pixiSpine.PIXI.spine.core.IkConstraintData,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton
  ) = this()
  
  /* CompleteClass */
  var active: Boolean = js.native
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(): Unit = js.native
  
  /* CompleteClass */
  override def apply1(
    bone: typings.pixiSpine.PIXI.spine.core.Bone,
    targetX: Double,
    targetY: Double,
    compress: Boolean,
    stretch: Boolean,
    uniform: Boolean,
    alpha: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def apply2(
    parent: typings.pixiSpine.PIXI.spine.core.Bone,
    child: typings.pixiSpine.PIXI.spine.core.Bone,
    targetX: Double,
    targetY: Double,
    bendDir: Double,
    stretch: Boolean,
    softness: Double,
    alpha: Double
  ): Unit = js.native
  
  /* CompleteClass */
  var bendDirection: Double = js.native
  
  /* CompleteClass */
  var bones: js.Array[typings.pixiSpine.PIXI.spine.core.Bone] = js.native
  
  /* CompleteClass */
  var compress: Boolean = js.native
  
  /* CompleteClass */
  var data: typings.pixiSpine.PIXI.spine.core.IkConstraintData = js.native
  
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  /* CompleteClass */
  var mix: Double = js.native
  
  /* CompleteClass */
  var softness: Double = js.native
  
  /* CompleteClass */
  var stretch: Boolean = js.native
  
  /* CompleteClass */
  var target: typings.pixiSpine.PIXI.spine.core.Bone = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}
