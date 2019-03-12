package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerDataPushSink extends js.Object {
  def OnServerDataPush(RequestID: scala.Double, JsonDataContent: java.lang.String): scala.Unit
}

object IServerDataPushSink {
  @scala.inline
  def apply(OnServerDataPush: (scala.Double, java.lang.String) => scala.Unit): IServerDataPushSink = {
    val __obj = js.Dynamic.literal(OnServerDataPush = js.Any.fromFunction2(OnServerDataPush))
  
    __obj.asInstanceOf[IServerDataPushSink]
  }
}

