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
  
  def callback: callback = "callback".asInstanceOf[callback]
  def `catch`: `catch` = "catch".asInstanceOf[`catch`]
  def err: err = "err".asInstanceOf[err]
  def promise: promise = "promise".asInstanceOf[promise]
  def start: start = "start".asInstanceOf[start]
  def stop: stop = "stop".asInstanceOf[stop]
  def stream: stream = "stream".asInstanceOf[stream]
  def sync: sync = "sync".asInstanceOf[sync]
  def task_err: task_err = "task_err".asInstanceOf[task_err]
  def task_not_found: task_not_found = "task_not_found".asInstanceOf[task_not_found]
  def task_recursion: task_recursion = "task_recursion".asInstanceOf[task_recursion]
  def task_start: task_start = "task_start".asInstanceOf[task_start]
  def task_stop: task_stop = "task_stop".asInstanceOf[task_stop]
}

