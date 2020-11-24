package typings.phonegapPluginBarcodescanner.phonegapBarcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    failure: js.UndefOr[scala.Nothing],
    opts: BarcodeScanOptions
  ): Unit = js.native
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
