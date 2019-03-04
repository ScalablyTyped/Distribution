package typings
package phonegapDashPluginDashBarcodescannerLib.phonegapBarcodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeScanResult extends js.Object {
  var cancelled: scala.Boolean
  var format: java.lang.String
  var text: java.lang.String
}

object BarcodeScanResult {
  @scala.inline
  def apply(cancelled: scala.Boolean, format: java.lang.String, text: java.lang.String): BarcodeScanResult = {
    val __obj = js.Dynamic.literal(cancelled = cancelled, format = format, text = text)
  
    __obj.asInstanceOf[BarcodeScanResult]
  }
}

