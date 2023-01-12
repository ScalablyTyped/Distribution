package typings.paypalPaypalJs.typesComponentsHostedFieldsMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayPalHostedFieldsComponentOptions extends StObject {
  
  def createOrder(): js.Promise[String]
  
  var fields: js.UndefOr[Record[String, Any]] = js.undefined
  
  var installments: js.UndefOr[Installments] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* err */ Record[String, Any], Unit]] = js.undefined
  
  var styles: js.UndefOr[Record[String, Any]] = js.undefined
}
object PayPalHostedFieldsComponentOptions {
  
  inline def apply(createOrder: () => js.Promise[String]): PayPalHostedFieldsComponentOptions = {
    val __obj = js.Dynamic.literal(createOrder = js.Any.fromFunction0(createOrder))
    __obj.asInstanceOf[PayPalHostedFieldsComponentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayPalHostedFieldsComponentOptions] (val x: Self) extends AnyVal {
    
    inline def setCreateOrder(value: () => js.Promise[String]): Self = StObject.set(x, "createOrder", js.Any.fromFunction0(value))
    
    inline def setFields(value: Record[String, Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setInstallments(value: Installments): Self = StObject.set(x, "installments", value.asInstanceOf[js.Any])
    
    inline def setInstallmentsUndefined: Self = StObject.set(x, "installments", js.undefined)
    
    inline def setOnError(value: /* err */ Record[String, Any] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setStyles(value: Record[String, Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
