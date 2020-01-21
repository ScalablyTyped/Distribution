package typings.onfleetNodeOnfleet.workersMod

import typings.onfleetNodeOnfleet.AnonEntries
import typings.onfleetNodeOnfleet.AnonTasks
import typings.onfleetNodeOnfleet.AnonWorkers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worker extends js.Object {
  def create(worker: CreateWorkerProps): js.Promise[OnfleetWorker] = js.native
  def deleteOne(id: String): js.Promise[Unit] = js.native
  def get(): js.Promise[js.Array[OnfleetWorker]] = js.native
  def get(id: String): js.Promise[OnfleetWorker] = js.native
  def get(id: String, query: GetWorkerQueryProps): js.Promise[OnfleetWorker] = js.native
  def getByLocation(location: GetWorkerByLocationProps): js.Promise[AnonWorkers] = js.native
  def getSchedule(id: String): js.Promise[AnonEntries] = js.native
  def insertTask(id: String, obj: AnonTasks): js.Promise[OnfleetWorker] = js.native
  def setSchedule(id: String, schedule: WorkerSchedule): js.Promise[AnonEntries] = js.native
  def update(id: String, worker: UpdateWorkerProps): js.Promise[OnfleetWorker] = js.native
}

