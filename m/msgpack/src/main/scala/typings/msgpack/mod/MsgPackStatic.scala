package typings.msgpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MsgPackStatic extends js.Object {
  
  def download(url: String, option: MsgPackDownloadOption, callback: MsgPackDownloadCallback): Unit = js.native
  
  /**
    * @param data string or ByteArray.
    * @param toString return string value if true.
    *
    * @return string or ByteArray or false. pack failed if false.
    */
  def pack(data: js.Any): js.Any = js.native
  def pack(data: js.Any, toString: Boolean): js.Any = js.native
  
  /**
    * @param data string or ByteArray.
    *
    * @return string or ByteArray or undefined. unpack failed if undefined.
    */
  def unpack(data: js.Any): js.Any = js.native
  
  def upload(url: String, option: MsgPackUploadOption, callback: MsgPackUploadCallback): Unit = js.native
  
  var worker: String = js.native
}
