package typings.mobxTask

import typings.mobxTask.taskGroupMod.QueryableMethods
import typings.mobxTask.taskMod.TaskStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mobxTaskStrings {
  @js.native
  sealed trait error extends QueryableMethods
  
  @js.native
  sealed trait `match` extends QueryableMethods
  
  @js.native
  sealed trait pending
    extends QueryableMethods
       with TaskStatus
  
  @js.native
  sealed trait rejected
    extends QueryableMethods
       with TaskStatus
  
  @js.native
  sealed trait resolved
    extends QueryableMethods
       with TaskStatus
  
  @js.native
  sealed trait result extends QueryableMethods
  
  @js.native
  sealed trait state extends QueryableMethods
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def `match`: `match` = "match".asInstanceOf[`match`]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  @scala.inline
  def resolved: resolved = "resolved".asInstanceOf[resolved]
  @scala.inline
  def result: result = "result".asInstanceOf[result]
  @scala.inline
  def state: state = "state".asInstanceOf[state]
}

