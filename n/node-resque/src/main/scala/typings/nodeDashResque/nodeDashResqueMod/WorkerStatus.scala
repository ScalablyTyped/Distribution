package typings.nodeDashResque.nodeDashResqueMod

import typings.nodeDashResque.Anon_Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerStatus extends js.Object {
  var payload: Anon_Args
  var queue: String
  var run_at: String
  var worker: String
}

object WorkerStatus {
  @scala.inline
  def apply(payload: Anon_Args, queue: String, run_at: String, worker: String): WorkerStatus = {
    val __obj = js.Dynamic.literal(payload = payload, queue = queue, run_at = run_at, worker = worker)
  
    __obj.asInstanceOf[WorkerStatus]
  }
}

