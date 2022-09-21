package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsStrings.black
import typings.paypalPaypalJs.paypalPaypalJsStrings.blue
import typings.paypalPaypalJs.paypalPaypalJsStrings.buynow
import typings.paypalPaypalJs.paypalPaypalJsStrings.checkout
import typings.paypalPaypalJs.paypalPaypalJsStrings.donate
import typings.paypalPaypalJs.paypalPaypalJsStrings.gold
import typings.paypalPaypalJs.paypalPaypalJsStrings.horizontal
import typings.paypalPaypalJs.paypalPaypalJsStrings.installment
import typings.paypalPaypalJs.paypalPaypalJsStrings.pay
import typings.paypalPaypalJs.paypalPaypalJsStrings.paypal__
import typings.paypalPaypalJs.paypalPaypalJsStrings.pill
import typings.paypalPaypalJs.paypalPaypalJsStrings.rect
import typings.paypalPaypalJs.paypalPaypalJsStrings.silver
import typings.paypalPaypalJs.paypalPaypalJsStrings.subscribe
import typings.paypalPaypalJs.paypalPaypalJsStrings.vertical
import typings.paypalPaypalJs.paypalPaypalJsStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: js.UndefOr[gold | blue | silver | white | black] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var label: js.UndefOr[paypal__ | checkout | buynow | pay | installment | subscribe | donate] = js.undefined
  
  var layout: js.UndefOr[vertical | horizontal] = js.undefined
  
  var shape: js.UndefOr[rect | pill] = js.undefined
  
  var tagline: js.UndefOr[Boolean] = js.undefined
}
object Color {
  
  inline def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: gold | blue | silver | white | black): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLabel(value: paypal__ | checkout | buynow | pay | installment | subscribe | donate): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLayout(value: vertical | horizontal): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setShape(value: rect | pill): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setTagline(value: Boolean): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
    
    inline def setTaglineUndefined: Self = StObject.set(x, "tagline", js.undefined)
  }
}
