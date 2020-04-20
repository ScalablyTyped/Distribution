package typings.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunningFileConverts extends js.Object {
  var id: String
  var last_update: String
  var link: String
  var linkextid: String
  var name: String
  var progress: Double
  var retries: String
  var status: String
}

object RunningFileConverts {
  @scala.inline
  def apply(
    id: String,
    last_update: String,
    link: String,
    linkextid: String,
    name: String,
    progress: Double,
    retries: String,
    status: String
  ): RunningFileConverts = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], last_update = last_update.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkextid = linkextid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunningFileConverts]
  }
}

