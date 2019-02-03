package typings
package orchestratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object orchestratorLibStrings {
  @js.native
  sealed trait callback extends js.Object
  
  @js.native
  sealed trait `catch` extends js.Object
  
  @js.native
  sealed trait err extends js.Object
  
  @js.native
  sealed trait promise extends js.Object
  
  @js.native
  sealed trait start extends js.Object
  
  @js.native
  sealed trait stop extends js.Object
  
  @js.native
  sealed trait stream extends js.Object
  
  @js.native
  sealed trait sync extends js.Object
  
  @js.native
  sealed trait task_err extends js.Object
  
  @js.native
  sealed trait task_not_found extends js.Object
  
  @js.native
  sealed trait task_recursion extends js.Object
  
  @js.native
  sealed trait task_start extends js.Object
  
  @js.native
  sealed trait task_stop extends js.Object
  
  @scala.inline
  def callback: callback = "callback".asInstanceOf[callback]
  @scala.inline
  def `catch`: `catch` = "catch".asInstanceOf[`catch`]
  @scala.inline
  def err: err = "err".asInstanceOf[err]
  @scala.inline
  def promise: promise = "promise".asInstanceOf[promise]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
  @scala.inline
  def task_err: task_err = "task_err".asInstanceOf[task_err]
  @scala.inline
  def task_not_found: task_not_found = "task_not_found".asInstanceOf[task_not_found]
  @scala.inline
  def task_recursion: task_recursion = "task_recursion".asInstanceOf[task_recursion]
  @scala.inline
  def task_start: task_start = "task_start".asInstanceOf[task_start]
  @scala.inline
  def task_stop: task_stop = "task_stop".asInstanceOf[task_stop]
}

