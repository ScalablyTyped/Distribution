package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Broadcast extends js.Object {
  var broadcastUrls: BroadcastUrlsResponse
  var id: String
  var status: String
}

object Broadcast {
  @scala.inline
  def apply(broadcastUrls: BroadcastUrlsResponse, id: String, status: String): Broadcast = {
    val __obj = js.Dynamic.literal(broadcastUrls = broadcastUrls.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broadcast]
  }
}

