package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.H
import typings.pdfmake.pdfmakeStrings.L
import typings.pdfmake.pdfmakeStrings.M
import typings.pdfmake.pdfmakeStrings.Q
import typings.pdfmake.pdfmakeStrings.alphanumeric
import typings.pdfmake.pdfmakeStrings.numeric
import typings.pdfmake.pdfmakeStrings.octet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentQr
  extends ContentBase
     with _Content {
  
  var eccLevel: js.UndefOr[L | M | Q | H] = js.native
  
  var fit: js.UndefOr[Double] = js.native
  
  var foreground: js.UndefOr[String] = js.native
  
  var mask: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[numeric | alphanumeric | octet] = js.native
  
  var qr: String = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object ContentQr {
  
  @scala.inline
  def apply(qr: String): ContentQr = {
    val __obj = js.Dynamic.literal(qr = qr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentQr]
  }
  
  @scala.inline
  implicit class ContentQrMutableBuilder[Self <: ContentQr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEccLevel(value: L | M | Q | H): Self = StObject.set(x, "eccLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEccLevelUndefined: Self = StObject.set(x, "eccLevel", js.undefined)
    
    @scala.inline
    def setFit(value: Double): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    @scala.inline
    def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
    
    @scala.inline
    def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setMode(value: numeric | alphanumeric | octet): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setQr(value: String): Self = StObject.set(x, "qr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
