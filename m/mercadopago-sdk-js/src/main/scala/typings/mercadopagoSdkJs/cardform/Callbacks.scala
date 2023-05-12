package typings.mercadopagoSdkJs.cardform

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callbacks extends StObject {
  
  var onBinChange: js.UndefOr[OnBinChange] = js.undefined
  
  var onCardTokenReceived: js.UndefOr[OnCardTokenReceived] = js.undefined
  
  var onError: js.UndefOr[OnError] = js.undefined
  
  var onFetching: js.UndefOr[OnFetching] = js.undefined
  
  var onFormMounted: js.UndefOr[OnFormMounted] = js.undefined
  
  var onFormUnmounted: js.UndefOr[OnFormUnmounted] = js.undefined
  
  var onIdentificationTypesReceived: js.UndefOr[OnIdentificationTypesReceived] = js.undefined
  
  var onInstallmentsReceived: js.UndefOr[OnInstallmentsReceived] = js.undefined
  
  var onIssuersReceived: js.UndefOr[OnIssuersReceived] = js.undefined
  
  var onPaymentMethodsReceived: js.UndefOr[OnPaymentMethodsReceived] = js.undefined
  
  var onReady: js.UndefOr[OnReady] = js.undefined
  
  var onSubmit: js.UndefOr[OnSubmit] = js.undefined
  
  var onValidityChange: js.UndefOr[OnValidityChange] = js.undefined
}
object Callbacks {
  
  inline def apply(): Callbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Callbacks] (val x: Self) extends AnyVal {
    
    inline def setOnBinChange(value: /* bin */ String => Unit): Self = StObject.set(x, "onBinChange", js.Any.fromFunction1(value))
    
    inline def setOnBinChangeUndefined: Self = StObject.set(x, "onBinChange", js.undefined)
    
    inline def setOnCardTokenReceived(
      value: (/* error */ js.UndefOr[Error], /* response */ js.UndefOr[CardTokenResponseCardForm]) => Unit
    ): Self = StObject.set(x, "onCardTokenReceived", js.Any.fromFunction2(value))
    
    inline def setOnCardTokenReceivedUndefined: Self = StObject.set(x, "onCardTokenReceived", js.undefined)
    
    inline def setOnError(value: (/* error */ js.UndefOr[js.Array[Error]], /* event */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFetching(value: /* name */ String => FechingCallback): Self = StObject.set(x, "onFetching", js.Any.fromFunction1(value))
    
    inline def setOnFetchingUndefined: Self = StObject.set(x, "onFetching", js.undefined)
    
    inline def setOnFormMounted(value: /* error */ js.UndefOr[Error] => Unit): Self = StObject.set(x, "onFormMounted", js.Any.fromFunction1(value))
    
    inline def setOnFormMountedUndefined: Self = StObject.set(x, "onFormMounted", js.undefined)
    
    inline def setOnFormUnmounted(value: /* error */ js.UndefOr[Error] => Unit): Self = StObject.set(x, "onFormUnmounted", js.Any.fromFunction1(value))
    
    inline def setOnFormUnmountedUndefined: Self = StObject.set(x, "onFormUnmounted", js.undefined)
    
    inline def setOnIdentificationTypesReceived(
      value: (/* error */ js.UndefOr[Error], /* response */ js.UndefOr[js.Array[IdentificationTypesResponseCardForm]]) => Unit
    ): Self = StObject.set(x, "onIdentificationTypesReceived", js.Any.fromFunction2(value))
    
    inline def setOnIdentificationTypesReceivedUndefined: Self = StObject.set(x, "onIdentificationTypesReceived", js.undefined)
    
    inline def setOnInstallmentsReceived(
      value: (/* error */ js.UndefOr[Error], /* response */ js.UndefOr[InstallmentsResponseCardForm]) => Unit
    ): Self = StObject.set(x, "onInstallmentsReceived", js.Any.fromFunction2(value))
    
    inline def setOnInstallmentsReceivedUndefined: Self = StObject.set(x, "onInstallmentsReceived", js.undefined)
    
    inline def setOnIssuersReceived(
      value: (/* error */ js.UndefOr[Error], /* response */ js.UndefOr[js.Array[IssuersResponseCardForm]]) => Unit
    ): Self = StObject.set(x, "onIssuersReceived", js.Any.fromFunction2(value))
    
    inline def setOnIssuersReceivedUndefined: Self = StObject.set(x, "onIssuersReceived", js.undefined)
    
    inline def setOnPaymentMethodsReceived(
      value: (/* error */ js.UndefOr[Error], /* response */ js.UndefOr[js.Array[PaymentMethodsResponseCardForm]]) => Unit
    ): Self = StObject.set(x, "onPaymentMethodsReceived", js.Any.fromFunction2(value))
    
    inline def setOnPaymentMethodsReceivedUndefined: Self = StObject.set(x, "onPaymentMethodsReceived", js.undefined)
    
    inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setOnSubmit(value: /* event */ Event => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnValidityChange(value: (/* error */ js.UndefOr[js.Array[Error]], /* field */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onValidityChange", js.Any.fromFunction2(value))
    
    inline def setOnValidityChangeUndefined: Self = StObject.set(x, "onValidityChange", js.undefined)
  }
}
