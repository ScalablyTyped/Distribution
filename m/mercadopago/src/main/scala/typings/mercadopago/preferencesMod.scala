package typings.mercadopago

import typings.mercadopago.defaultConfigurationModelMod.DefaultConfigurationOmitQs
import typings.mercadopago.mercadopagoResposeMod.ExecOptions
import typings.mercadopago.mercadopagoResposeMod.MercadoPagoResponse
import typings.mercadopago.preferencesCreatePayloadModelMod.CreatePreferencePayload
import typings.mercadopago.preferencesUpdatePayloadModelMod.UpdatePreferencePayload
import typings.mercadopago.typesMod.CallbackFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preferencesMod {
  
  @js.native
  trait MercadoPagoPreference extends StObject {
    
    def create(payload: CreatePreferencePayload): js.Promise[PreferenceCreateResponse] = js.native
    def create(payload: CreatePreferencePayload, configuration: Unit, callback: CallbackFunction): js.Promise[PreferenceCreateResponse] = js.native
    def create(payload: CreatePreferencePayload, configuration: DefaultConfigurationOmitQs): js.Promise[PreferenceCreateResponse] = js.native
    def create(
      payload: CreatePreferencePayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[PreferenceCreateResponse] = js.native
    
    /** Alias for `get` method. */
    def findById(id: String): js.Promise[PreferenceGetResponse] = js.native
    def findById(id: String, configuration: Unit, callback: CallbackFunction): js.Promise[PreferenceGetResponse] = js.native
    def findById(id: String, configuration: DefaultConfigurationOmitQs): js.Promise[PreferenceGetResponse] = js.native
    def findById(id: String, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[PreferenceGetResponse] = js.native
    
    def get(id: String): js.Promise[PreferenceGetResponse] = js.native
    def get(id: String, configuration: Unit, callback: CallbackFunction): js.Promise[PreferenceGetResponse] = js.native
    def get(id: String, configuration: DefaultConfigurationOmitQs): js.Promise[PreferenceGetResponse] = js.native
    def get(id: String, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[PreferenceGetResponse] = js.native
    
    /** Alias for `create` method. */
    def save(payload: CreatePreferencePayload): js.Promise[PreferenceCreateResponse] = js.native
    def save(payload: CreatePreferencePayload, configuration: Unit, callback: CallbackFunction): js.Promise[PreferenceCreateResponse] = js.native
    def save(payload: CreatePreferencePayload, configuration: DefaultConfigurationOmitQs): js.Promise[PreferenceCreateResponse] = js.native
    def save(
      payload: CreatePreferencePayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[PreferenceCreateResponse] = js.native
    
    def update(payload: UpdatePreferencePayload): js.Promise[PreferenceUpdateResponse] = js.native
    def update(payload: UpdatePreferencePayload, configuration: Unit, callback: CallbackFunction): js.Promise[PreferenceUpdateResponse] = js.native
    def update(payload: UpdatePreferencePayload, configuration: DefaultConfigurationOmitQs): js.Promise[PreferenceUpdateResponse] = js.native
    def update(
      payload: UpdatePreferencePayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[PreferenceUpdateResponse] = js.native
  }
  
  type PreferenceCreateResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, CreatePreferencePayload]]
  
  type PreferenceGetResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, Any]]
  
  type PreferenceUpdateResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, UpdatePreferencePayload]]
}
