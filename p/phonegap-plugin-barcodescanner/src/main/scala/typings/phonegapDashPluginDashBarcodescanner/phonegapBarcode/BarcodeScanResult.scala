package typings.phonegapDashPluginDashBarcodescanner.phonegapBarcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeScanResult extends js.Object {
  var cancelled: Boolean
  var format: String
  var text: String
}

object BarcodeScanResult {
  @scala.inline
  def apply(cancelled: Boolean, format: String, text: String): BarcodeScanResult = {
    val __obj = js.Dynamic.literal(cancelled = cancelled, format = format, text = text)
  
    __obj.asInstanceOf[BarcodeScanResult]
  }
}

