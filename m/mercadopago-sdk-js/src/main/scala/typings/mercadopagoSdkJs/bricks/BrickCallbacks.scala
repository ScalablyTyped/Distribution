package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrickCallbacks extends StObject {
  
  var onBinChange: js.UndefOr[js.Function1[/* bin */ String, Unit]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ BrickError, Unit]] = js.native
  
  var onReady: js.UndefOr[js.Function0[Unit]] = js.native
  
  def onSubmit(formData: CardFormData): js.Promise[Unit] = js.native
  def onSubmit(formData: CardFormData, param2: AdditionalCardFormData): js.Promise[Unit] = js.native
  def onSubmit(formData: CardFormData, param2: AdditionalPaymentFormData): js.Promise[Unit] = js.native
  def onSubmit(formData: PaymentFormData): js.Promise[Unit] = js.native
  def onSubmit(formData: PaymentFormData, param2: AdditionalCardFormData): js.Promise[Unit] = js.native
  def onSubmit(formData: PaymentFormData, param2: AdditionalPaymentFormData): js.Promise[Unit] = js.native
}
