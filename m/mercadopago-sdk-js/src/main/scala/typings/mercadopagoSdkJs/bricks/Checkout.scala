package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkout extends StObject {
  
  var theme: CheckoutThemes
}
object Checkout {
  
  inline def apply(theme: CheckoutThemes): Checkout = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checkout] (val x: Self) extends AnyVal {
    
    inline def setTheme(value: CheckoutThemes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
