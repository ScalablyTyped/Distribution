package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadTaskOnHeadersReceivedCallbackResult extends js.Object {
  /** 开发者服务器返回的 HTTP Response Header */
  var header: js.Object
}

object UploadTaskOnHeadersReceivedCallbackResult {
  @scala.inline
  def apply(header: js.Object): UploadTaskOnHeadersReceivedCallbackResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadTaskOnHeadersReceivedCallbackResult]
  }
}

