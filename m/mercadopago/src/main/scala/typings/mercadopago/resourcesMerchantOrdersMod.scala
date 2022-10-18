package typings.mercadopago

import typings.mercadopago.modelsDefaultConfigurationDotmodelMod.DefaultConfigurationOmitQs
import typings.mercadopago.modelsMerchantOrdersCreatePayloadMod.CreateMerchantOrderPayload
import typings.mercadopago.modelsMerchantOrdersUpdatePayloadMod.UpdateMerchantOrderPayload
import typings.mercadopago.sharedTypesMod.CallbackFunction
import typings.mercadopago.utilsMercadopagoResposeMod.ExecOptions
import typings.mercadopago.utilsMercadopagoResposeMod.MercadoPagoResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcesMerchantOrdersMod {
  
  @js.native
  trait MercadoPagoMerchantOrder extends StObject {
    
    def create(payload: CreateMerchantOrderPayload): js.Promise[MerchantOrderCreateResponse] = js.native
    def create(payload: CreateMerchantOrderPayload, configuration: Unit, callback: CallbackFunction): js.Promise[MerchantOrderCreateResponse] = js.native
    def create(payload: CreateMerchantOrderPayload, configuration: DefaultConfigurationOmitQs): js.Promise[MerchantOrderCreateResponse] = js.native
    def create(
      payload: CreateMerchantOrderPayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[MerchantOrderCreateResponse] = js.native
    
    def findById(id: String): js.Promise[MerchantOrderGetResponse] = js.native
    def findById(id: String, configuration: Unit, callback: CallbackFunction): js.Promise[MerchantOrderGetResponse] = js.native
    def findById(id: String, configuration: DefaultConfigurationOmitQs): js.Promise[MerchantOrderGetResponse] = js.native
    def findById(id: String, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[MerchantOrderGetResponse] = js.native
    /** Alias for `get` method. */
    def findById(id: Double): js.Promise[MerchantOrderGetResponse] = js.native
    def findById(id: Double, configuration: Unit, callback: CallbackFunction): js.Promise[MerchantOrderGetResponse] = js.native
    def findById(id: Double, configuration: DefaultConfigurationOmitQs): js.Promise[MerchantOrderGetResponse] = js.native
    def findById(id: Double, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[MerchantOrderGetResponse] = js.native
    
    def get(id: String): js.Promise[MerchantOrderGetResponse] = js.native
    def get(id: String, configuration: Unit, callback: CallbackFunction): js.Promise[MerchantOrderGetResponse] = js.native
    def get(id: String, configuration: DefaultConfigurationOmitQs): js.Promise[MerchantOrderGetResponse] = js.native
    def get(id: String, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[MerchantOrderGetResponse] = js.native
    def get(id: Double): js.Promise[MerchantOrderGetResponse] = js.native
    def get(id: Double, configuration: Unit, callback: CallbackFunction): js.Promise[MerchantOrderGetResponse] = js.native
    def get(id: Double, configuration: DefaultConfigurationOmitQs): js.Promise[MerchantOrderGetResponse] = js.native
    def get(id: Double, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[MerchantOrderGetResponse] = js.native
    
    /** Alias for `create` method. */
    def save(payload: CreateMerchantOrderPayload): js.Promise[MerchantOrderCreateResponse] = js.native
    def save(payload: CreateMerchantOrderPayload, configuration: Unit, callback: CallbackFunction): js.Promise[MerchantOrderCreateResponse] = js.native
    def save(payload: CreateMerchantOrderPayload, configuration: DefaultConfigurationOmitQs): js.Promise[MerchantOrderCreateResponse] = js.native
    def save(
      payload: CreateMerchantOrderPayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[MerchantOrderCreateResponse] = js.native
    
    def update(payload: UpdateMerchantOrderPayload): js.Promise[MerchantOrderUpdateResponse] = js.native
    def update(payload: UpdateMerchantOrderPayload, configuration: Unit, callback: CallbackFunction): js.Promise[MerchantOrderUpdateResponse] = js.native
    def update(payload: UpdateMerchantOrderPayload, configuration: DefaultConfigurationOmitQs): js.Promise[MerchantOrderUpdateResponse] = js.native
    def update(
      payload: UpdateMerchantOrderPayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[MerchantOrderUpdateResponse] = js.native
  }
  
  type MerchantOrderCreateResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, CreateMerchantOrderPayload]]
  
  type MerchantOrderGetResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, Any]]
  
  type MerchantOrderUpdateResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, UpdateMerchantOrderPayload]]
}
