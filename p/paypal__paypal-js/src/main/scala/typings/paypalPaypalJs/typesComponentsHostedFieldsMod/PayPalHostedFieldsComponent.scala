package typings.paypalPaypalJs.typesComponentsHostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayPalHostedFieldsComponent extends StObject {
  
  def isEligible(): Boolean
  
  def render(options: PayPalHostedFieldsComponentOptions): js.Promise[HostedFieldsHandler]
}
object PayPalHostedFieldsComponent {
  
  inline def apply(
    isEligible: () => Boolean,
    render: PayPalHostedFieldsComponentOptions => js.Promise[HostedFieldsHandler]
  ): PayPalHostedFieldsComponent = {
    val __obj = js.Dynamic.literal(isEligible = js.Any.fromFunction0(isEligible), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[PayPalHostedFieldsComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayPalHostedFieldsComponent] (val x: Self) extends AnyVal {
    
    inline def setIsEligible(value: () => Boolean): Self = StObject.set(x, "isEligible", js.Any.fromFunction0(value))
    
    inline def setRender(value: PayPalHostedFieldsComponentOptions => js.Promise[HostedFieldsHandler]): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
