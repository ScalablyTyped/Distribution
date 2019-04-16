package typings
package mobxDashTaskLib.mobxDashTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- stdLib.PropertyDecorator because var conflicts: length. Inlined  */ @js.native
trait TaskCreator[K /* <: java.lang.String */]
  extends stdLib.MethodDecorator {
  def apply(options: stdLib.Pick[TaskOptions[WithoutPromise[_]], K]): stdLib.PropertyDecorator | stdLib.MethodDecorator = js.native
  def apply[R, A /* <: js.Array[_] */](func: TaskFunc[R, A]): TaskStatusAware[WithoutPromise[R], A] = js.native
  def apply[R, A /* <: js.Array[_] */](func: TaskFunc[R, A], options: stdLib.Pick[TaskOptions[WithoutPromise[R]], K]): TaskStatusAware[WithoutPromise[R], A] = js.native
}

