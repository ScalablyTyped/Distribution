package typings
package phonegapDashPluginDashBarcodescannerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var barcodeScanner: phonegapDashPluginDashBarcodescannerLib.phonegapBarcodeNs.BarcodeScanner
}

object CordovaPlugins {
  @scala.inline
  def apply(barcodeScanner: phonegapDashPluginDashBarcodescannerLib.phonegapBarcodeNs.BarcodeScanner): CordovaPlugins = {
    val __obj = js.Dynamic.literal(barcodeScanner = barcodeScanner)
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

