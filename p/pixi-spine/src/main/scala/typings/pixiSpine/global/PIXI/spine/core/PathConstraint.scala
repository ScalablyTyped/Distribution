package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.PathConstraint")
@js.native
class PathConstraint protected ()
  extends typings.pixiSpine.PIXI.spine.core.PathConstraint {
  def this(
    data: typings.pixiSpine.PIXI.spine.core.PathConstraintData,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton
  ) = this()
}
object PathConstraint {
  
  @JSGlobal("PIXI.spine.core.PathConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.PathConstraint.AFTER")
  @js.native
  def AFTER: Double = js.native
  @scala.inline
  def AFTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AFTER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.PathConstraint.BEFORE")
  @js.native
  def BEFORE: Double = js.native
  @scala.inline
  def BEFORE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEFORE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.PathConstraint.NONE")
  @js.native
  def NONE: Double = js.native
  @scala.inline
  def NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.PathConstraint.epsilon")
  @js.native
  def epsilon: Double = js.native
  @scala.inline
  def epsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("epsilon")(x.asInstanceOf[js.Any])
}
