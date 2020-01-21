package typings.onfleetNodeOnfleet.tasksMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  def autoAssign(tasks: js.Array[OnfleetTask]): js.Promise[_] = js.native
   // TODO need to confirm response
  def batchCreate(tasks: js.Array[CreateTaskProps]): js.Promise[js.Array[OnfleetTask]] = js.native
  def clone(id: String): js.Promise[OnfleetTask] = js.native
  def create(task: CreateTaskProps): js.Promise[OnfleetTask] = js.native
  def deleteOne(id: String): js.Promise[Double] = js.native
  def forceComplete(id: String): js.Promise[Unit] = js.native
  def get(): js.Promise[js.Array[OnfleetTask]] = js.native
  def get(queryOrId: String): js.Promise[OnfleetTask] = js.native
  def get(queryOrId: String, queryKey: TaskQueryKey): js.Promise[OnfleetTask] = js.native
  def get(queryParams: TaskQueryParam): js.Promise[js.Array[OnfleetTask]] = js.native
  def update(id: String, task: Partial[CreateTaskProps]): js.Promise[UpdateTaskResult] = js.native
}

