package typings
package mobxDashTaskLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mobxDashTaskLibStrings {
  @js.native
  sealed trait pending
    extends mobxDashTaskLib.mobxDashTaskMod.TaskState
  
  @js.native
  sealed trait rejected
    extends mobxDashTaskLib.mobxDashTaskMod.TaskState
  
  @js.native
  sealed trait resolved
    extends mobxDashTaskLib.mobxDashTaskMod.TaskState
  
  @js.native
  sealed trait state extends js.Object
  
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  @scala.inline
  def resolved: resolved = "resolved".asInstanceOf[resolved]
  @scala.inline
  def state: state = "state".asInstanceOf[state]
}

