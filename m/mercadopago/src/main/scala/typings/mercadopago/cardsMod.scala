package typings.mercadopago

import typings.mercadopago.createPayloadMod.CreateCardPayload
import typings.mercadopago.defaultConfigurationModelMod.DefaultConfigurationOmitQs
import typings.mercadopago.mercadopagoResposeMod.ExecOptions
import typings.mercadopago.mercadopagoResposeMod.MercadoPagoResponse
import typings.mercadopago.typesMod.CallbackFunction
import typings.mercadopago.updatePayloadMod.UpdateCardPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardsMod {
  
  type CardCreateResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, CreateCardPayload]]
  
  type CardDeleteResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, Any]]
  
  type CardGetResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, Any]]
  
  type CardUpdateResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, UpdateCardPayload]]
  
  @js.native
  trait MercadoPagoCard extends StObject {
    
    def all(customerId: String): js.Promise[CardGetResponse] = js.native
    def all(customerId: String, configuration: Unit, callback: CallbackFunction): js.Promise[CardGetResponse] = js.native
    def all(customerId: String, configuration: DefaultConfigurationOmitQs): js.Promise[CardGetResponse] = js.native
    def all(customerId: String, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[CardGetResponse] = js.native
    
    def create(payload: CreateCardPayload): js.Promise[CardCreateResponse] = js.native
    def create(payload: CreateCardPayload, configuration: Unit, callback: CallbackFunction): js.Promise[CardCreateResponse] = js.native
    def create(payload: CreateCardPayload, configuration: DefaultConfigurationOmitQs): js.Promise[CardCreateResponse] = js.native
    def create(payload: CreateCardPayload, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[CardCreateResponse] = js.native
    
    def delete(id: String): js.Promise[CardDeleteResponse] = js.native
    def delete(id: String, configuration: Unit, callback: CallbackFunction): js.Promise[CardDeleteResponse] = js.native
    def delete(id: String, configuration: DefaultConfigurationOmitQs): js.Promise[CardDeleteResponse] = js.native
    def delete(id: String, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[CardDeleteResponse] = js.native
    def delete(id: Double): js.Promise[CardDeleteResponse] = js.native
    def delete(id: Double, configuration: Unit, callback: CallbackFunction): js.Promise[CardDeleteResponse] = js.native
    def delete(id: Double, configuration: DefaultConfigurationOmitQs): js.Promise[CardDeleteResponse] = js.native
    def delete(id: Double, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[CardDeleteResponse] = js.native
    
    def findById(customerId: String, id: String): js.Promise[CardGetResponse] = js.native
    def findById(customerId: String, id: String, configuration: Unit, callback: CallbackFunction): js.Promise[CardGetResponse] = js.native
    def findById(customerId: String, id: String, configuration: DefaultConfigurationOmitQs): js.Promise[CardGetResponse] = js.native
    def findById(
      customerId: String,
      id: String,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[CardGetResponse] = js.native
    /** Alias for `get` method. */
    def findById(customerId: String, id: Double): js.Promise[CardGetResponse] = js.native
    def findById(customerId: String, id: Double, configuration: Unit, callback: CallbackFunction): js.Promise[CardGetResponse] = js.native
    def findById(customerId: String, id: Double, configuration: DefaultConfigurationOmitQs): js.Promise[CardGetResponse] = js.native
    def findById(
      customerId: String,
      id: Double,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[CardGetResponse] = js.native
    
    def get(customerId: String, id: String): js.Promise[CardGetResponse] = js.native
    def get(customerId: String, id: String, configuration: Unit, callback: CallbackFunction): js.Promise[CardGetResponse] = js.native
    def get(customerId: String, id: String, configuration: DefaultConfigurationOmitQs): js.Promise[CardGetResponse] = js.native
    def get(
      customerId: String,
      id: String,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[CardGetResponse] = js.native
    def get(customerId: String, id: Double): js.Promise[CardGetResponse] = js.native
    def get(customerId: String, id: Double, configuration: Unit, callback: CallbackFunction): js.Promise[CardGetResponse] = js.native
    def get(customerId: String, id: Double, configuration: DefaultConfigurationOmitQs): js.Promise[CardGetResponse] = js.native
    def get(
      customerId: String,
      id: Double,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[CardGetResponse] = js.native
    
    /** Alias for `create` method. */
    def save(payload: CreateCardPayload): js.Promise[CardCreateResponse] = js.native
    def save(payload: CreateCardPayload, configuration: Unit, callback: CallbackFunction): js.Promise[CardCreateResponse] = js.native
    def save(payload: CreateCardPayload, configuration: DefaultConfigurationOmitQs): js.Promise[CardCreateResponse] = js.native
    def save(payload: CreateCardPayload, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[CardCreateResponse] = js.native
    
    def update(payload: UpdateCardPayload): js.Promise[CardUpdateResponse] = js.native
    def update(payload: UpdateCardPayload, configuration: Unit, callback: CallbackFunction): js.Promise[CardUpdateResponse] = js.native
    def update(payload: UpdateCardPayload, configuration: DefaultConfigurationOmitQs): js.Promise[CardUpdateResponse] = js.native
    def update(payload: UpdateCardPayload, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[CardUpdateResponse] = js.native
  }
}
