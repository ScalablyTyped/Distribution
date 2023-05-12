package typings.mercadopagoSdkJs.cardform

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardForm extends StObject {
  
  def createCardToken(): js.Promise[js.UndefOr[CardTokenResponseCardForm]]
  
  def getCardFormData(): CardFormData
  
  def mount(): Unit
  
  def submit(): Unit
  
  def unmount(): Unit
  
  def update(field: String, properties: UpdatableProperties): Unit
}
object CardForm {
  
  inline def apply(
    createCardToken: () => js.Promise[js.UndefOr[CardTokenResponseCardForm]],
    getCardFormData: () => CardFormData,
    mount: () => Unit,
    submit: () => Unit,
    unmount: () => Unit,
    update: (String, UpdatableProperties) => Unit
  ): CardForm = {
    val __obj = js.Dynamic.literal(createCardToken = js.Any.fromFunction0(createCardToken), getCardFormData = js.Any.fromFunction0(getCardFormData), mount = js.Any.fromFunction0(mount), submit = js.Any.fromFunction0(submit), unmount = js.Any.fromFunction0(unmount), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[CardForm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardForm] (val x: Self) extends AnyVal {
    
    inline def setCreateCardToken(value: () => js.Promise[js.UndefOr[CardTokenResponseCardForm]]): Self = StObject.set(x, "createCardToken", js.Any.fromFunction0(value))
    
    inline def setGetCardFormData(value: () => CardFormData): Self = StObject.set(x, "getCardFormData", js.Any.fromFunction0(value))
    
    inline def setMount(value: () => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction0(value))
    
    inline def setSubmit(value: () => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
    
    inline def setUnmount(value: () => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: (String, UpdatableProperties) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
