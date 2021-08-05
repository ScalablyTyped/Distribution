package typings.phonegapPluginBarcodescanner

import typings.phonegapPluginBarcodescanner.phonegapBarcode.BarcodeScanner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  var barcodeScanner: BarcodeScanner
}
object CordovaPlugins {
  
  inline def apply(barcodeScanner: BarcodeScanner): CordovaPlugins = {
    val __obj = js.Dynamic.literal(barcodeScanner = barcodeScanner.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  extension [Self <: CordovaPlugins](x: Self) {
    
    inline def setBarcodeScanner(value: BarcodeScanner): Self = StObject.set(x, "barcodeScanner", value.asInstanceOf[js.Any])
  }
}
