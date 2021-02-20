package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.PathConstraint")
@js.native
class PathConstraint protected ()
  extends typings.phaser.spine.PathConstraint {
  def this(data: typings.phaser.spine.PathConstraintData, skeleton: typings.phaser.spine.Skeleton) = this()
}
object PathConstraint {
  
  @JSGlobal("spine.PathConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.PathConstraint.AFTER")
  @js.native
  def AFTER: Double = js.native
  @scala.inline
  def AFTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AFTER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.PathConstraint.BEFORE")
  @js.native
  def BEFORE: Double = js.native
  @scala.inline
  def BEFORE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEFORE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.PathConstraint.NONE")
  @js.native
  def NONE: Double = js.native
  @scala.inline
  def NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.PathConstraint.epsilon")
  @js.native
  def epsilon: Double = js.native
  @scala.inline
  def epsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("epsilon")(x.asInstanceOf[js.Any])
}
