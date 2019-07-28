package typings.msgpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object msgpackMod {
  type MsgPackDownloadCallback = js.Function3[
    /* data */ js.Any, 
    /* option */ MsgPackDownloadOption, 
    /* result */ MsgPackCallbackResult, 
    Unit
  ]
  type MsgPackUploadCallback = js.Function3[
    /* data */ String, 
    /* option */ MsgPackUploadOption, 
    /* result */ MsgPackCallbackResult, 
    Unit
  ]
}
