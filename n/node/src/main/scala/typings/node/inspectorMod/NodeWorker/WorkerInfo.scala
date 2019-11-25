package typings.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerInfo extends js.Object {
  var title: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
  var workerId: WorkerID
}

object WorkerInfo {
  @scala.inline
  def apply(title: java.lang.String, `type`: java.lang.String, url: java.lang.String, workerId: WorkerID): WorkerInfo = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerInfo]
  }
}

