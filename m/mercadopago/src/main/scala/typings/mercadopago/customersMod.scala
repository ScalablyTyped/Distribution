package typings.mercadopago

import typings.mercadopago.cardsMod.MercadoPagoCard
import typings.mercadopago.createPayloadModelMod.CreateCustomerPayload
import typings.mercadopago.defaultConfigurationModelMod.DefaultConfigurationOmitQs
import typings.mercadopago.mercadopagoResposeMod.ExecOptions
import typings.mercadopago.mercadopagoResposeMod.MercadoPagoResponse
import typings.mercadopago.searchConfigurationModelMod.CustomerSearchConfiguration
import typings.mercadopago.typesMod.CallbackFunction
import typings.mercadopago.updatePayloadModelMod.UpdateCustomerPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customersMod {
  
  type CustomerCreateResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, CreateCustomerPayload]]
  
  type CustomerDeleteResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, Any]]
  
  type CustomerGetResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, Any]]
  
  type CustomerSearchResponse = MercadoPagoResponse[ExecOptions[CustomerSearchConfiguration, Any]]
  
  type CustomerUpdateResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, UpdateCustomerPayload]]
  
  @js.native
  trait MercadoPagoCustomer extends StObject {
    
    var cards: MercadoPagoCard = js.native
    
    def create(payload: CreateCustomerPayload): js.Promise[CustomerCreateResponse] = js.native
    def create(payload: CreateCustomerPayload, configuration: Unit, callback: CallbackFunction): js.Promise[CustomerCreateResponse] = js.native
    def create(payload: CreateCustomerPayload, configuration: DefaultConfigurationOmitQs): js.Promise[CustomerCreateResponse] = js.native
    def create(
      payload: CreateCustomerPayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[CustomerCreateResponse] = js.native
    
    /** Alias for `get` method. */
    def findById(id: String): js.Promise[CustomerGetResponse] = js.native
    def findById(id: String, configuration: Unit, callback: CallbackFunction): js.Promise[CustomerGetResponse] = js.native
    def findById(id: String, configuration: DefaultConfigurationOmitQs): js.Promise[CustomerGetResponse] = js.native
    def findById(id: String, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[CustomerGetResponse] = js.native
    
    def get(id: String): js.Promise[CustomerGetResponse] = js.native
    def get(id: String, configuration: Unit, callback: CallbackFunction): js.Promise[CustomerGetResponse] = js.native
    def get(id: String, configuration: DefaultConfigurationOmitQs): js.Promise[CustomerGetResponse] = js.native
    def get(id: String, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[CustomerGetResponse] = js.native
    
    def remove(id: String): js.Promise[CustomerDeleteResponse] = js.native
    def remove(id: String, configuration: Unit, callback: CallbackFunction): js.Promise[CustomerDeleteResponse] = js.native
    def remove(id: String, configuration: DefaultConfigurationOmitQs): js.Promise[CustomerDeleteResponse] = js.native
    def remove(id: String, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[CustomerDeleteResponse] = js.native
    
    /** Alias for `create` method. */
    def save(payload: CreateCustomerPayload): js.Promise[CustomerCreateResponse] = js.native
    def save(payload: CreateCustomerPayload, configuration: Unit, callback: CallbackFunction): js.Promise[CustomerCreateResponse] = js.native
    def save(payload: CreateCustomerPayload, configuration: DefaultConfigurationOmitQs): js.Promise[CustomerCreateResponse] = js.native
    def save(
      payload: CreateCustomerPayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[CustomerCreateResponse] = js.native
    
    def search(configuration: CustomerSearchConfiguration): js.Promise[CustomerSearchResponse] = js.native
    def search(configuration: CustomerSearchConfiguration, callback: CallbackFunction): js.Promise[CustomerSearchResponse] = js.native
    
    def update(payload: UpdateCustomerPayload): js.Promise[CustomerUpdateResponse] = js.native
    def update(payload: UpdateCustomerPayload, configuration: Unit, callback: CallbackFunction): js.Promise[CustomerUpdateResponse] = js.native
    def update(payload: UpdateCustomerPayload, configuration: DefaultConfigurationOmitQs): js.Promise[CustomerUpdateResponse] = js.native
    def update(
      payload: UpdateCustomerPayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[CustomerUpdateResponse] = js.native
  }
}
