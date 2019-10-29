package typings.mobxDashTask.libTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskMethods[A /* <: js.Array[_] */, R] extends js.Object {
  /**
    * Pattern-matches on the task status.
    * @param props
    */
  def `match`[PT, ET, RT](props: TaskMatchProps[PT, ET, RT, A, R]): PT | ET | RT
  /**
    * Resets the state.
    */
  def reset(): Unit
  /**
    * Sets the state.
    */
  def setState(props: TaskOptions[A, R]): Unit
  /**
    * Wraps the task by invoking `func` with the inner task function, which returns the wrapped function
    * and converts that to a task.
    *
    * @param func
    */
  def wrap[NA /* <: js.Array[_] */, NR](func: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[/* args */ NA, NR]]): Task[NA, NR]
}

object TaskMethods {
  @scala.inline
  def apply[A /* <: js.Array[_] */, R](
    `match`: TaskMatchProps[js.Any, js.Any, js.Any, A, R] => js.Any | js.Any | js.Any,
    reset: () => Unit,
    setState: TaskOptions[A, R] => Unit,
    wrap: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[js.Any, js.Any]] => Task[js.Any, js.Any]
  ): TaskMethods[A, R] = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), setState = js.Any.fromFunction1(setState), wrap = js.Any.fromFunction1(wrap))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[TaskMethods[A, R]]
  }
}

