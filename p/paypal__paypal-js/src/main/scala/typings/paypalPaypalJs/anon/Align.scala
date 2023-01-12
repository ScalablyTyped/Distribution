package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsInts.`10`
import typings.paypalPaypalJs.paypalPaypalJsInts.`11`
import typings.paypalPaypalJs.paypalPaypalJsInts.`12`
import typings.paypalPaypalJs.paypalPaypalJsInts.`13`
import typings.paypalPaypalJs.paypalPaypalJsInts.`14`
import typings.paypalPaypalJs.paypalPaypalJsInts.`15`
import typings.paypalPaypalJs.paypalPaypalJsInts.`16`
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColor(value: black | white | monochrome | grayscale): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: `10` | `11` | `12` | `13` | `14` | `15` | `16`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
