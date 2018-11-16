package typings
package orchestratorLib.orchestratorMod.OrchestratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Start running the tasks
     */
@js.native
trait StartMethod extends js.Object {
  // TODO: TypeScript 2.1.5 cannot express varargs followed by callback as a last argument...
  def apply(task1: Strings, task2: Strings): orchestratorLib.orchestratorMod.Orchestrator = js.native
  // TODO: TypeScript 2.1.5 cannot express varargs followed by callback as a last argument...
  def apply(task1: Strings, task2: Strings, cb: js.Function1[/* error */ js.UndefOr[js.Any], _]): orchestratorLib.orchestratorMod.Orchestrator = js.native
  def apply(task1: Strings, task2: Strings, task3: Strings): orchestratorLib.orchestratorMod.Orchestrator = js.native
  def apply(
    task1: Strings,
    task2: Strings,
    task3: Strings,
    cb: js.Function1[/* error */ js.UndefOr[js.Any], _]
  ): orchestratorLib.orchestratorMod.Orchestrator = js.native
  def apply(task1: Strings, task2: Strings, task3: Strings, task4: Strings): orchestratorLib.orchestratorMod.Orchestrator = js.native
  def apply(
    task1: Strings,
    task2: Strings,
    task3: Strings,
    task4: Strings,
    cb: js.Function1[/* error */ js.UndefOr[js.Any], _]
  ): orchestratorLib.orchestratorMod.Orchestrator = js.native
  def apply(task1: Strings, task2: Strings, task3: Strings, task4: Strings, task5: Strings): orchestratorLib.orchestratorMod.Orchestrator = js.native
  def apply(
    task1: Strings,
    task2: Strings,
    task3: Strings,
    task4: Strings,
    task5: Strings,
    cb: js.Function1[/* error */ js.UndefOr[js.Any], _]
  ): orchestratorLib.orchestratorMod.Orchestrator = js.native
  def apply(task1: Strings, task2: Strings, task3: Strings, task4: Strings, task5: Strings, task6: Strings): orchestratorLib.orchestratorMod.Orchestrator = js.native
  def apply(
    task1: Strings,
    task2: Strings,
    task3: Strings,
    task4: Strings,
    task5: Strings,
    task6: Strings,
    cb: js.Function1[/* error */ js.UndefOr[js.Any], _]
  ): orchestratorLib.orchestratorMod.Orchestrator = js.native
  /** Start running the tasks
           * @param tasks Tasks to be executed. You may pass any number of tasks as individual arguments.
           * @param cb Callback to call after run completed.
           */
  def apply(tasks: Strings*): orchestratorLib.orchestratorMod.Orchestrator = js.native
  /** Start running the tasks
           * @param tasks Tasks to be executed. You may pass any number of tasks as individual arguments.
           * @param cb Callback to call after run completed.
           */
  def apply(tasks: Strings): orchestratorLib.orchestratorMod.Orchestrator = js.native
  /** Start running the tasks
           * @param tasks Tasks to be executed. You may pass any number of tasks as individual arguments.
           * @param cb Callback to call after run completed.
           */
  def apply(tasks: Strings, cb: js.Function1[/* error */ js.UndefOr[js.Any], _]): orchestratorLib.orchestratorMod.Orchestrator = js.native
}

