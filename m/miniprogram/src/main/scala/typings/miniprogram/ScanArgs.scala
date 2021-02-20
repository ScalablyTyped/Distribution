package typings.miniprogram

import typings.miniprogram.anon.BarCode
import typings.miniprogram.miniprogramStrings.bar
import typings.miniprogram.miniprogramStrings.qr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanArgs extends AsyncCallback[BarCode] {
  
  /**
    * Hide album entry or not. If it is false, there will be an entry
    * for user to select a picture from the album as the scanned picture.
    * Otherwise, user will use camera to scan the content directly. By default, its value is false.
    */
  var hideAlbum: js.UndefOr[Boolean] = js.native
  
  /**
    * Type for scanning (qr by default):
    * 1. qr: two-dimensional QR scanning frame.
    * 2. bar: Linear barcode scanning frame.
    */
  var `type`: js.UndefOr[qr | bar] = js.native
}
object ScanArgs {
  
  @scala.inline
  def apply(): ScanArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanArgs]
  }
  
  @scala.inline
  implicit class ScanArgsMutableBuilder[Self <: ScanArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideAlbum(value: Boolean): Self = StObject.set(x, "hideAlbum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideAlbumUndefined: Self = StObject.set(x, "hideAlbum", js.undefined)
    
    @scala.inline
    def setType(value: qr | bar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
