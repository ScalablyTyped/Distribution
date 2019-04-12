package typings
package mobxDashTaskLib.mobxDashTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskFactory extends js.Object {
  def apply[R, A /* <: js.Array[_] */](func: TaskFunc[R, A]): TaskStatusAware[WithoutPromise[R], A] = js.native
  def apply[R, A /* <: js.Array[_] */](func: TaskFunc[R, A], options: TaskOptions[WithoutPromise[R]]): TaskStatusAware[WithoutPromise[R], A] = js.native
  def rejected[R, A /* <: js.Array[_] */](func: TaskFunc[R, A]): TaskStatusAware[WithoutPromise[R], A] = js.native
  @JSName("rejected")
  def rejected_state[R, A /* <: js.Array[_] */](
    func: TaskFunc[R, A],
    options: Omit[TaskOptions[WithoutPromise[R]], mobxDashTaskLib.mobxDashTaskLibStrings.state]
  ): TaskStatusAware[WithoutPromise[R], A] = js.native
  def resolved[R, A /* <: js.Array[_] */](func: TaskFunc[R, A]): TaskStatusAware[WithoutPromise[R], A] = js.native
  @JSName("resolved")
  def resolved_state[R, A /* <: js.Array[_] */](
    func: TaskFunc[R, A],
    options: Omit[TaskOptions[WithoutPromise[R]], mobxDashTaskLib.mobxDashTaskLibStrings.state]
  ): TaskStatusAware[WithoutPromise[R], A] = js.native
}

