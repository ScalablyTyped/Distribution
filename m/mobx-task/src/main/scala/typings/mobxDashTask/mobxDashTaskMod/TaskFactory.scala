package typings.mobxDashTask.mobxDashTaskMod

import typings.mobxDashTask.mobxDashTaskStrings.state
import typings.std.Exclude
import typings.std.MethodDecorator
import typings.std.Pick
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskFactory extends TaskCreator[String] {
  @JSName("rejected")
  var rejected_Original: TaskCreator[Exclude[String, state]] = js.native
  @JSName("resolved")
  var resolved_Original: TaskCreator[Exclude[String, state]] = js.native
  def rejected[R, A /* <: js.Array[_] */](func: TaskFunc[R, A]): TaskStatusAware[WithoutPromise[R], A] = js.native
  @JSName("rejected")
  def rejected_state(options: Pick[TaskOptions[WithoutPromise[_]], Exclude[String, state]]): PropertyDecorator = js.native
  @JSName("rejected")
  def rejected_state[R, A /* <: js.Array[_] */](func: TaskFunc[R, A], options: Pick[TaskOptions[WithoutPromise[R]], Exclude[String, state]]): TaskStatusAware[WithoutPromise[R], A] = js.native
  @JSName("rejected")
  def rejected_state_MethodDecorator(options: Pick[TaskOptions[WithoutPromise[_]], Exclude[String, state]]): MethodDecorator = js.native
  def resolved[R, A /* <: js.Array[_] */](func: TaskFunc[R, A]): TaskStatusAware[WithoutPromise[R], A] = js.native
  @JSName("resolved")
  def resolved_state(options: Pick[TaskOptions[WithoutPromise[_]], Exclude[String, state]]): PropertyDecorator = js.native
  @JSName("resolved")
  def resolved_state[R, A /* <: js.Array[_] */](func: TaskFunc[R, A], options: Pick[TaskOptions[WithoutPromise[R]], Exclude[String, state]]): TaskStatusAware[WithoutPromise[R], A] = js.native
  @JSName("resolved")
  def resolved_state_MethodDecorator(options: Pick[TaskOptions[WithoutPromise[_]], Exclude[String, state]]): MethodDecorator = js.native
}

