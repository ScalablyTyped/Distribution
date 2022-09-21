package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsNumbers.`10`
import typings.paypalPaypalJs.paypalPaypalJsNumbers.`11`
import typings.paypalPaypalJs.paypalPaypalJsNumbers.`12`
import typings.paypalPaypalJs.paypalPaypalJsNumbers.`13`
import typings.paypalPaypalJs.paypalPaypalJsNumbers.`14`
import typings.paypalPaypalJs.paypalPaypalJsNumbers.`15`
import typings.paypalPaypalJs.paypalPaypalJsNumbers.`16`
import typings.paypalPaypalJs.paypalPaypalJsStrings.black
import typings.paypalPaypalJs.paypalPaypalJsStrings.center
import typings.paypalPaypalJs.paypalPaypalJsStrings.grayscale
import typings.paypalPaypalJs.paypalPaypalJsStrings.left
import typings.paypalPaypalJs.paypalPaypalJsStrings.monochrome
import typings.paypalPaypalJs.paypalPaypalJsStrings.right
import typings.paypalPaypalJs.paypalPaypalJsStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: js.UndefOr[left | center | right] = js.undefined
  
  var color: js.UndefOr[black | white | monochrome | grayscale] = js.undefined
  
  var size: js.UndefOr[`10` | `11` | `12` | `13` | `14` | `15` | `16`] = js.undefined
}
object Align {
  
  inline def apply(): Align = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Align]
  }
  
  extension [Self <: Align](x: Self) {
    
    inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColor(value: black | white | monochrome | grayscale): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: `10` | `11` | `12` | `13` | `14` | `15` | `16`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
