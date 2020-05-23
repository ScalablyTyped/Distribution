package typings.mobxTask.taskMod

import typings.mobxTask.mobxTaskStrings.args
import typings.mobxTask.mobxTaskStrings.error
import typings.mobxTask.mobxTaskStrings.result
import typings.mobxTask.mobxTaskStrings.state
import typings.mobxTask.mobxTaskStrings.swallow
import typings.std.MethodDecorator
import typings.std.Pick
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- js.Function because Already inherited
- typings.std.PropertyDecorator because var conflicts: length. Inlined  */ @js.native
trait TaskCreator[K /* <: /* keyof mobx-task.mobx-task/lib/task.TaskOptions<any, any> */ state | error | result | args | swallow */] extends MethodDecorator {
  def apply(options: Pick[TaskOptions[_, _], K]): PropertyDecorator = js.native
  /**
    * Calls the actual task function.
    */
  def apply[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R]): Task_[A, R] = js.native
  def apply[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R], options: Pick[TaskOptions[A, R], K]): Task_[A, R] = js.native
}

