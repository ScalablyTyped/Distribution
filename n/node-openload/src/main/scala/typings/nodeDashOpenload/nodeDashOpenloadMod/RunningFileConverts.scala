package typings.nodeDashOpenload.nodeDashOpenloadMod

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
    val __obj = js.Dynamic.literal(id = id, last_update = last_update, link = link, linkextid = linkextid, name = name, progress = progress, retries = retries, status = status)
  
    __obj.asInstanceOf[RunningFileConverts]
  }
}

