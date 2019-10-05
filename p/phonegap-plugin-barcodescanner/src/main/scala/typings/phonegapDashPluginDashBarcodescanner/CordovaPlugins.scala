package typings.phonegapDashPluginDashBarcodescanner

import typings.phonegapDashPluginDashBarcodescanner.phonegapBarcode.BarcodeScanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var barcodeScanner: BarcodeScanner
}

object CordovaPlugins {
  @scala.inline
  def apply(barcodeScanner: BarcodeScanner): CordovaPlugins = {
    val __obj = js.Dynamic.literal(barcodeScanner = barcodeScanner)
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

