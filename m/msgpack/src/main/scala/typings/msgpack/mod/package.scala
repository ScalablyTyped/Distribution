package typings.msgpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MsgPackDownloadCallback = js.Function3[
    /* data */ js.Any, 
    /* option */ typings.msgpack.mod.MsgPackDownloadOption, 
    /* result */ typings.msgpack.mod.MsgPackCallbackResult, 
    scala.Unit
  ]
  type MsgPackUploadCallback = js.Function3[
    /* data */ java.lang.String, 
    /* option */ typings.msgpack.mod.MsgPackUploadOption, 
    /* result */ typings.msgpack.mod.MsgPackCallbackResult, 
    scala.Unit
  ]
}
