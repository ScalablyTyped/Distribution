package typings.orchestrator.orchestratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.orchestrator.orchestratorStrings.start
  - typings.orchestrator.orchestratorStrings.stop
  - typings.orchestrator.orchestratorStrings.err
  - typings.orchestrator.orchestratorStrings.task_start
  - typings.orchestrator.orchestratorStrings.task_stop
  - typings.orchestrator.orchestratorStrings.task_err
  - typings.orchestrator.orchestratorStrings.task_not_found
  - typings.orchestrator.orchestratorStrings.task_recursion
*/
trait EventNames extends js.Object

object EventNames {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def err: typings.orchestrator.orchestratorStrings.err = this.cast("err")
  @scala.inline
  def start: typings.orchestrator.orchestratorStrings.start = this.cast("start")
  @scala.inline
  def stop: typings.orchestrator.orchestratorStrings.stop = this.cast("stop")
  @scala.inline
  def task_err: typings.orchestrator.orchestratorStrings.task_err = this.cast("task_err")
  @scala.inline
  def task_not_found: typings.orchestrator.orchestratorStrings.task_not_found = this.cast("task_not_found")
  @scala.inline
  def task_recursion: typings.orchestrator.orchestratorStrings.task_recursion = this.cast("task_recursion")
  @scala.inline
  def task_start: typings.orchestrator.orchestratorStrings.task_start = this.cast("task_start")
  @scala.inline
  def task_stop: typings.orchestrator.orchestratorStrings.task_stop = this.cast("task_stop")
}

