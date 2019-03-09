package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorBeacon extends js.Object {
  def sendBeacon(url: java.lang.String): scala.Boolean = js.native
  def sendBeacon(
    url: java.lang.String,
    data: Blob | stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer | FormData | java.lang.String
  ): scala.Boolean = js.native
}

