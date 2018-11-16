package typings
package msgpackLib.msgpackMod.msgpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsgPackStatic extends js.Object {
  var worker: java.lang.String = js.native
  def download(url: java.lang.String, option: MsgPackDownloadOption, callback: MsgPackDownloadCallback): scala.Unit = js.native
  /**
       * @param data string or ByteArray.
       * @param toString return string value if true.
       *
       * @return string or ByteArray or false. pack failed if false.
       */
  def pack(data: js.Any): js.Any = js.native
  /**
       * @param data string or ByteArray.
       * @param toString return string value if true.
       *
       * @return string or ByteArray or false. pack failed if false.
       */
  def pack(data: js.Any, toString: scala.Boolean): js.Any = js.native
  /**
       * @param data string or ByteArray.
       *
       * @return string or ByteArray or undefined. unpack failed if undefined.
       */
  def unpack(data: js.Any): js.Any = js.native
  def upload(url: java.lang.String, option: MsgPackUploadOption, callback: MsgPackUploadCallback): scala.Unit = js.native
}

