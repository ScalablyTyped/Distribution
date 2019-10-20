package typings.atOnfleetNodeDashOnfleet.resourcesWorkersMod

import typings.atOnfleetNodeDashOnfleet.Anon_Entries
import typings.atOnfleetNodeDashOnfleet.Anon_Tasks
import typings.atOnfleetNodeDashOnfleet.Anon_Workers
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
  def getByLocation(location: GetWorkerByLocationProps): js.Promise[Anon_Workers] = js.native
  def getSchedule(id: String): js.Promise[Anon_Entries] = js.native
  def insertTask(id: String, obj: Anon_Tasks): js.Promise[OnfleetWorker] = js.native
  def setSchedule(id: String, schedule: WorkerSchedule): js.Promise[Anon_Entries] = js.native
  def update(id: String, worker: UpdateWorkerProps): js.Promise[OnfleetWorker] = js.native
}

