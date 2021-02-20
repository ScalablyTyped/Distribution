package typings.phonegapPluginBarcodescanner

import typings.phonegapPluginBarcodescanner.phonegapBarcode.BarcodeScanner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPlugins extends StObject {
  
  var barcodeScanner: BarcodeScanner = js.native
}
object CordovaPlugins {
  
  @scala.inline
  def apply(barcodeScanner: BarcodeScanner): CordovaPlugins = {
    val __obj = js.Dynamic.literal(barcodeScanner = barcodeScanner.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  @scala.inline
  implicit class CordovaPluginsMutableBuilder[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarcodeScanner(value: BarcodeScanner): Self = StObject.set(x, "barcodeScanner", value.asInstanceOf[js.Any])
  }
}
