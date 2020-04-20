package typings.phonegapPluginBarcodescanner

import typings.phonegapPluginBarcodescanner.phonegapBarcode.BarcodeScanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var barcodeScanner: BarcodeScanner
}

object CordovaPlugins {
  @scala.inline
  def apply(barcodeScanner: BarcodeScanner): CordovaPlugins = {
    val __obj = js.Dynamic.literal(barcodeScanner = barcodeScanner.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
}

