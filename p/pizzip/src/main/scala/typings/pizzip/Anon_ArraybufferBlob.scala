package typings.pizzip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArraybufferBlob extends js.Object {
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

object Anon_ArraybufferBlob {
  @scala.inline
  def apply(arraybuffer: Boolean, blob: Boolean, nodebuffer: Boolean, uint8array: Boolean): Anon_ArraybufferBlob = {
    val __obj = js.Dynamic.literal(arraybuffer = arraybuffer, blob = blob, nodebuffer = nodebuffer, uint8array = uint8array)
  
    __obj.asInstanceOf[Anon_ArraybufferBlob]
  }
}

