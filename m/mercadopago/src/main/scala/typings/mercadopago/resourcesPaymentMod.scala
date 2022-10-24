package typings.mercadopago

import typings.mercadopago.anon.Amount
import typings.mercadopago.modelsDefaultConfigurationDotmodelMod.DefaultConfigurationOmitQs
import typings.mercadopago.modelsDefaultConfigurationDotmodelMod.SearchConfiguration
import typings.mercadopago.modelsPaymentCapturePartialPayloadDotmodelMod.CapturePartialPaymentPayload
import typings.mercadopago.modelsPaymentCreatePayloadDotmodelMod.CreatePaymentPayload
import typings.mercadopago.modelsPaymentUpdatePayloadDotmodelMod.UpdatePaymentPayload
import typings.mercadopago.sharedTypesMod.CallbackFunction
import typings.mercadopago.utilsMercadopagoResposeMod.ExecOptions
import typings.mercadopago.utilsMercadopagoResposeMod.MercadoPagoResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcesPaymentMod {
  
  @js.native
  trait MercadoPagoPayment extends StObject {
    
    /** Cancel payment */
    def cancel(id: Double): js.Promise[PaymentUpdateResponse] = js.native
    def cancel(id: Double, configuration: Unit, callback: CallbackFunction): js.Promise[PaymentUpdateResponse] = js.native
    def cancel(id: Double, configuration: DefaultConfigurationOmitQs): js.Promise[PaymentUpdateResponse] = js.native
    def cancel(id: Double, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[PaymentUpdateResponse] = js.native
    
    def capture(id: Double): js.Promise[PaymentUpdateResponse] = js.native
    def capture(id: Double, configuration: Unit, callback: CallbackFunction): js.Promise[PaymentUpdateResponse] = js.native
    def capture(id: Double, configuration: DefaultConfigurationOmitQs): js.Promise[PaymentUpdateResponse] = js.native
    def capture(id: Double, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[PaymentUpdateResponse] = js.native
    
    def capturePartial(payload: CapturePartialPaymentPayload): js.Promise[PaymentUpdateResponse] = js.native
    def capturePartial(payload: CapturePartialPaymentPayload, configuration: Unit, callback: CallbackFunction): js.Promise[PaymentUpdateResponse] = js.native
    def capturePartial(payload: CapturePartialPaymentPayload, configuration: DefaultConfigurationOmitQs): js.Promise[PaymentUpdateResponse] = js.native
    def capturePartial(
      payload: CapturePartialPaymentPayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[PaymentUpdateResponse] = js.native
    
    def create(payload: CreatePaymentPayload): js.Promise[PaymentCreateResponse] = js.native
    def create(payload: CreatePaymentPayload, configuration: Unit, callback: CallbackFunction): js.Promise[PaymentCreateResponse] = js.native
    def create(payload: CreatePaymentPayload, configuration: DefaultConfigurationOmitQs): js.Promise[PaymentCreateResponse] = js.native
    def create(
      payload: CreatePaymentPayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[PaymentCreateResponse] = js.native
    
    /** Alias for `get` method. */
    def findById(id: Double): js.Promise[PaymentGetResponse] = js.native
    def findById(id: Double, configuration: Unit, callback: CallbackFunction): js.Promise[PaymentGetResponse] = js.native
    def findById(id: Double, configuration: DefaultConfigurationOmitQs): js.Promise[PaymentGetResponse] = js.native
    def findById(id: Double, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[PaymentGetResponse] = js.native
    
    def get(id: Double): js.Promise[PaymentGetResponse] = js.native
    def get(id: Double, configuration: Unit, callback: CallbackFunction): js.Promise[PaymentGetResponse] = js.native
    def get(id: Double, configuration: DefaultConfigurationOmitQs): js.Promise[PaymentGetResponse] = js.native
    def get(id: Double, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[PaymentGetResponse] = js.native
    
    // Complete and partial refund
    def refund(id: Double): js.Promise[PaymentUpdateResponse] = js.native
    
    def refundPartial(param0: Amount): js.Promise[PaymentUpdateResponse] = js.native
    
    /** Alias for `create` method. */
    def save(payload: CreatePaymentPayload): js.Promise[PaymentCreateResponse] = js.native
    def save(payload: CreatePaymentPayload, configuration: Unit, callback: CallbackFunction): js.Promise[PaymentCreateResponse] = js.native
    def save(payload: CreatePaymentPayload, configuration: DefaultConfigurationOmitQs): js.Promise[PaymentCreateResponse] = js.native
    def save(
      payload: CreatePaymentPayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[PaymentCreateResponse] = js.native
    
    def search(configuration: SearchConfiguration[Any]): js.Promise[PaymentSearchResponse] = js.native
    def search(configuration: SearchConfiguration[Any], callback: CallbackFunction): js.Promise[PaymentSearchResponse] = js.native
    
    def update(payload: UpdatePaymentPayload): js.Promise[PaymentUpdateResponse] = js.native
    def update(payload: UpdatePaymentPayload, configuration: Unit, callback: CallbackFunction): js.Promise[PaymentUpdateResponse] = js.native
    def update(payload: UpdatePaymentPayload, configuration: DefaultConfigurationOmitQs): js.Promise[PaymentUpdateResponse] = js.native
    def update(
      payload: UpdatePaymentPayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[PaymentUpdateResponse] = js.native
  }
  
  type PaymentCreateResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, CreatePaymentPayload]]
  
  type PaymentGetResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, Any]]
  
  type PaymentSearchResponse = MercadoPagoResponse[ExecOptions[SearchConfiguration[Any], Any]]
  
  type PaymentUpdateResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, CreatePaymentPayload]]
}
