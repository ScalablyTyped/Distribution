package typings.mobxDashTask

import typings.mobxDashTask.mobxDashTaskMod.TaskState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mobxDashTaskStrings {
  @js.native
  sealed trait pending extends TaskState
  
  @js.native
  sealed trait rejected extends TaskState
  
  @js.native
  sealed trait resolved extends TaskState
  
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

