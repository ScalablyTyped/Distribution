package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsStrings.EXPRESS_CHECKOUT
import typings.paypalPaypalJs.paypalPaypalJsStrings.WEBSITE_PAYMENTS_STANDARD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Productcode extends StObject {
  
  var product_code: js.UndefOr[EXPRESS_CHECKOUT | WEBSITE_PAYMENTS_STANDARD] = js.undefined
}
object Productcode {
  
  inline def apply(): Productcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Productcode]
  }
  
  extension [Self <: Productcode](x: Self) {
    
    inline def setProduct_code(value: EXPRESS_CHECKOUT | WEBSITE_PAYMENTS_STANDARD): Self = StObject.set(x, "product_code", value.asInstanceOf[js.Any])
    
    inline def setProduct_codeUndefined: Self = StObject.set(x, "product_code", js.undefined)
  }
}
