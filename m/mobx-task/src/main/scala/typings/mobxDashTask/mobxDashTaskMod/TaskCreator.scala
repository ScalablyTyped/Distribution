package typings.mobxDashTask.mobxDashTaskMod

import typings.std.MethodDecorator
import typings.std.Pick
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- js.Function because Already inherited
- typings.std.PropertyDecorator because var conflicts: length. Inlined  */ @js.native
trait TaskCreator[K /* <: String */] extends MethodDecorator {
  def apply(options: Pick[TaskOptions[WithoutPromise[_]], K]): PropertyDecorator = js.native
  def apply[R, A /* <: js.Array[_] */](func: TaskFunc[R, A]): TaskStatusAware[WithoutPromise[R], A] = js.native
  def apply[R, A /* <: js.Array[_] */](func: TaskFunc[R, A], options: Pick[TaskOptions[WithoutPromise[R]], K]): TaskStatusAware[WithoutPromise[R], A] = js.native
}

