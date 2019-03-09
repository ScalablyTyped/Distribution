package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesCbcParams extends Algorithm {
  var iv: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
}

object AesCbcParams {
  @scala.inline
  def apply(
    iv: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer,
    name: java.lang.String
  ): AesCbcParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[AesCbcParams]
  }
}

