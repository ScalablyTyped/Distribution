package typings.pizzip.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arraybuffer extends js.Object {
  /**
    * true if PizZip can read and generate ArrayBuffer, false otherwise.
    */
  var arraybuffer: Boolean = js.native
  /**
    * true if PizZip can read and generate Blob, false otherwise.
    */
  var blob: Boolean = js.native
  /**
    * true if PizZip can read and generate nodejs Buffer, false otherwise.
    */
  var nodebuffer: Boolean = js.native
  /**
    * true if PizZip can read and generate Uint8Array, false otherwise.
    */
  var uint8array: Boolean = js.native
}

object Arraybuffer {
  @scala.inline
  def apply(arraybuffer: Boolean, blob: Boolean, nodebuffer: Boolean, uint8array: Boolean): Arraybuffer = {
    val __obj = js.Dynamic.literal(arraybuffer = arraybuffer.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], nodebuffer = nodebuffer.asInstanceOf[js.Any], uint8array = uint8array.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arraybuffer]
  }
  @scala.inline
  implicit class ArraybufferOps[Self <: Arraybuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArraybuffer(value: Boolean): Self = this.set("arraybuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlob(value: Boolean): Self = this.set("blob", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodebuffer(value: Boolean): Self = this.set("nodebuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setUint8array(value: Boolean): Self = this.set("uint8array", value.asInstanceOf[js.Any])
  }
  
}

