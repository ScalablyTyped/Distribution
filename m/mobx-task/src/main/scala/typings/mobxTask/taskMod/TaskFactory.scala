package typings.mobxTask.taskMod

import typings.mobxTask.mobxTaskStrings.args
import typings.mobxTask.mobxTaskStrings.error
import typings.mobxTask.mobxTaskStrings.result
import typings.mobxTask.mobxTaskStrings.state
import typings.mobxTask.mobxTaskStrings.swallow
import typings.std.Exclude
import typings.std.MethodDecorator
import typings.std.Pick
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskFactory extends TaskCreator[state | error | result | args | swallow] {
  /**
    * Creates a task in the `rejected` state.
    */
  @JSName("rejected")
  var rejected_Original: TaskCreator[Exclude[state | error | result | args | swallow, state]] = js.native
  /**
    * Creates a task in the `resolved` state.
    */
  @JSName("resolved")
  var resolved_Original: TaskCreator[Exclude[state | error | result | args | swallow, state]] = js.native
  /**
    * Calls the actual task function.
    */
  /**
    * Creates a task in the `rejected` state.
    */
  def rejected[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R]): Task_[A, R] = js.native
  /**
    * Creates a task in the `rejected` state.
    */
  @JSName("rejected")
  def rejected_state(options: Pick[TaskOptions[_, _], Exclude[state | error | result | args | swallow, state]]): PropertyDecorator = js.native
  @JSName("rejected")
  def rejected_state[A /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ A, R],
    options: Pick[TaskOptions[A, R], Exclude[state | error | result | args | swallow, state]]
  ): Task_[A, R] = js.native
  /**
    * Creates a task in the `rejected` state.
    */
  @JSName("rejected")
  def rejected_state_MethodDecorator(options: Pick[TaskOptions[_, _], Exclude[state | error | result | args | swallow, state]]): MethodDecorator = js.native
  /**
    * Calls the actual task function.
    */
  /**
    * Creates a task in the `resolved` state.
    */
  def resolved[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R]): Task_[A, R] = js.native
  /**
    * Creates a task in the `resolved` state.
    */
  @JSName("resolved")
  def resolved_state(options: Pick[TaskOptions[_, _], Exclude[state | error | result | args | swallow, state]]): PropertyDecorator = js.native
  @JSName("resolved")
  def resolved_state[A /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ A, R],
    options: Pick[TaskOptions[A, R], Exclude[state | error | result | args | swallow, state]]
  ): Task_[A, R] = js.native
  /**
    * Creates a task in the `resolved` state.
    */
  @JSName("resolved")
  def resolved_state_MethodDecorator(options: Pick[TaskOptions[_, _], Exclude[state | error | result | args | swallow, state]]): MethodDecorator = js.native
}

