package typings
package mobxDashTaskLib.mobxDashTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskFactory
  extends TaskCreator[java.lang.String] {
  @JSName("rejected")
  var rejected_Original: TaskCreator[stdLib.Exclude[java.lang.String, mobxDashTaskLib.mobxDashTaskLibStrings.state]] = js.native
  @JSName("resolved")
  var resolved_Original: TaskCreator[stdLib.Exclude[java.lang.String, mobxDashTaskLib.mobxDashTaskLibStrings.state]] = js.native
  def rejected[R, A /* <: js.Array[_] */](func: TaskFunc[R, A]): TaskStatusAware[WithoutPromise[R], A] = js.native
  @JSName("rejected")
  def rejected_state(
    options: stdLib.Pick[
      TaskOptions[WithoutPromise[_]], 
      stdLib.Exclude[java.lang.String, mobxDashTaskLib.mobxDashTaskLibStrings.state]
    ]
  ): stdLib.PropertyDecorator = js.native
  @JSName("rejected")
  def rejected_state[R, A /* <: js.Array[_] */](
    func: TaskFunc[R, A],
    options: stdLib.Pick[
      TaskOptions[WithoutPromise[R]], 
      stdLib.Exclude[java.lang.String, mobxDashTaskLib.mobxDashTaskLibStrings.state]
    ]
  ): TaskStatusAware[WithoutPromise[R], A] = js.native
  @JSName("rejected")
  def rejected_state_MethodDecorator(
    options: stdLib.Pick[
      TaskOptions[WithoutPromise[_]], 
      stdLib.Exclude[java.lang.String, mobxDashTaskLib.mobxDashTaskLibStrings.state]
    ]
  ): stdLib.MethodDecorator = js.native
  def resolved[R, A /* <: js.Array[_] */](func: TaskFunc[R, A]): TaskStatusAware[WithoutPromise[R], A] = js.native
  @JSName("resolved")
  def resolved_state(
    options: stdLib.Pick[
      TaskOptions[WithoutPromise[_]], 
      stdLib.Exclude[java.lang.String, mobxDashTaskLib.mobxDashTaskLibStrings.state]
    ]
  ): stdLib.PropertyDecorator = js.native
  @JSName("resolved")
  def resolved_state[R, A /* <: js.Array[_] */](
    func: TaskFunc[R, A],
    options: stdLib.Pick[
      TaskOptions[WithoutPromise[R]], 
      stdLib.Exclude[java.lang.String, mobxDashTaskLib.mobxDashTaskLibStrings.state]
    ]
  ): TaskStatusAware[WithoutPromise[R], A] = js.native
  @JSName("resolved")
  def resolved_state_MethodDecorator(
    options: stdLib.Pick[
      TaskOptions[WithoutPromise[_]], 
      stdLib.Exclude[java.lang.String, mobxDashTaskLib.mobxDashTaskLibStrings.state]
    ]
  ): stdLib.MethodDecorator = js.native
}

