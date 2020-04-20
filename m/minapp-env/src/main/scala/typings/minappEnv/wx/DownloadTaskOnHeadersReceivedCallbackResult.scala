package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadTaskOnHeadersReceivedCallbackResult extends js.Object {
  /** 开发者服务器返回的 HTTP Response Header */
  var header: js.Object
}

object DownloadTaskOnHeadersReceivedCallbackResult {
  @scala.inline
  def apply(header: js.Object): DownloadTaskOnHeadersReceivedCallbackResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadTaskOnHeadersReceivedCallbackResult]
  }
}

