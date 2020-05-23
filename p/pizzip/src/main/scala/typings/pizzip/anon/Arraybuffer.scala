package typings.pizzip.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arraybuffer extends js.Object {
  /**
    * true if PizZip can read and generate ArrayBuffer, false otherwise.
    */
  var arraybuffer: Boolean
  /**
    * true if PizZip can read and generate Blob, false otherwise.
    */
  var blob: Boolean
  /**
    * true if PizZip can read and generate nodejs Buffer, false otherwise.
    */
  var nodebuffer: Boolean
  /**
    * true if PizZip can read and generate Uint8Array, false otherwise.
    */
  var uint8array: Boolean
}

object Arraybuffer {
  @scala.inline
  def apply(arraybuffer: Boolean, blob: Boolean, nodebuffer: Boolean, uint8array: Boolean): Arraybuffer = {
    val __obj = js.Dynamic.literal(arraybuffer = arraybuffer.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], nodebuffer = nodebuffer.asInstanceOf[js.Any], uint8array = uint8array.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arraybuffer]
  }
}

