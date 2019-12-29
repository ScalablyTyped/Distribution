package typings.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerInfo extends js.Object {
  var title: String
  var `type`: String
  var url: String
  var workerId: WorkerID
}

object WorkerInfo {
  @scala.inline
  def apply(title: String, `type`: String, url: String, workerId: WorkerID): WorkerInfo = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerInfo]
  }
}

