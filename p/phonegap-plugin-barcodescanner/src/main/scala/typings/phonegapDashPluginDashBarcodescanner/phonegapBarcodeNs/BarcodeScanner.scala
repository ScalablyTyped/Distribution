package typings.phonegapDashPluginDashBarcodescanner.phonegapBarcodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarcodeScanner extends js.Object {
  var Encode: EncodingType = js.native
  def encode(encodingType: EncodingType, data: String, success: js.Function1[/* result */ js.Any, _]): Unit = js.native
  def encode(
    encodingType: EncodingType,
    data: String,
    success: js.Function1[/* result */ js.Any, _],
    failure: js.Function1[/* err */ js.Any, _]
  ): Unit = js.native
  def scan(success: js.Function1[/* result */ BarcodeScanResult, _]): Unit = js.native
  def scan(
    success: js.Function1[/* result */ BarcodeScanResult, _],
    failure: js.Function1[/* err */ js.Any, _]
  ): Unit = js.native
  def scan(
    success: js.Function1[/* result */ BarcodeScanResult, _],
    failure: js.Function1[/* err */ js.Any, _],
    opts: BarcodeScanOptions
  ): Unit = js.native
}

