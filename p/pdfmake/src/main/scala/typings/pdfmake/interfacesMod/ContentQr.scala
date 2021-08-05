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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentQr
  extends StObject
     with ContentBase
     with _Content {
  
  var eccLevel: js.UndefOr[L | M | Q | H] = js.undefined
  
  var fit: js.UndefOr[Double] = js.undefined
  
  var foreground: js.UndefOr[String] = js.undefined
  
  var mask: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[numeric | alphanumeric | octet] = js.undefined
  
  var qr: String
  
  var version: js.UndefOr[Double] = js.undefined
}
object ContentQr {
  
  inline def apply(qr: String): ContentQr = {
    val __obj = js.Dynamic.literal(qr = qr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentQr]
  }
  
  extension [Self <: ContentQr](x: Self) {
    
    inline def setEccLevel(value: L | M | Q | H): Self = StObject.set(x, "eccLevel", value.asInstanceOf[js.Any])
    
    inline def setEccLevelUndefined: Self = StObject.set(x, "eccLevel", js.undefined)
    
    inline def setFit(value: Double): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setMode(value: numeric | alphanumeric | octet): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setQr(value: String): Self = StObject.set(x, "qr", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
