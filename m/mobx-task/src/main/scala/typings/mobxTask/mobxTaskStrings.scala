package typings.mobxTask

import typings.mobxTask.taskGroupMod.QueryableMethods
import typings.mobxTask.taskMod.TaskStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobxTaskStrings {
  
  @js.native
  sealed trait args extends StObject
  @scala.inline
  def args: args = "args".asInstanceOf[args]
  
  @js.native
  sealed trait error extends QueryableMethods
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait `match` extends QueryableMethods
  @scala.inline
  def `match`: `match` = "match".asInstanceOf[`match`]
  
  @js.native
  sealed trait pending
    extends QueryableMethods
       with TaskStatus
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait rejected
    extends QueryableMethods
       with TaskStatus
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait resolved
    extends QueryableMethods
       with TaskStatus
  @scala.inline
  def resolved: resolved = "resolved".asInstanceOf[resolved]
  
  @js.native
  sealed trait result extends QueryableMethods
  @scala.inline
  def result: result = "result".asInstanceOf[result]
  
  @js.native
  sealed trait state extends QueryableMethods
  @scala.inline
  def state: state = "state".asInstanceOf[state]
  
  @js.native
  sealed trait swallow extends StObject
  @scala.inline
  def swallow: swallow = "swallow".asInstanceOf[swallow]
}
