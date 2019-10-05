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
    val __obj = js.Dynamic.literal(title = title, url = url, workerId = workerId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkerInfo]
  }
}

