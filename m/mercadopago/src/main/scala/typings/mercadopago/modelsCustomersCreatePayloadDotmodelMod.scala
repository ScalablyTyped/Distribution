package typings.mercadopago

import typings.mercadopago.anon.OmitPhoneextension
import typings.mercadopago.sharedAddressMod.SimpleAddressId
import typings.mercadopago.sharedPayerIdentificationMod.Identification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsCustomersCreatePayloadDotmodelMod {
  
  trait CreateCustomerPayload extends StObject {
    
    /** Informação sobre o endereço padrão do cliente. */
    var address: js.UndefOr[SimpleAddressId] = js.undefined
    
    /** Data (ISO_8601) de registo do cliente. */
    var date_registered: js.UndefOr[String] = js.undefined
    
    /** Endereço por defeito do cliente. */
    var default_address: js.UndefOr[String] = js.undefined
    
    /** Cartão padrão do cliente. */
    var default_card: js.UndefOr[String] = js.undefined
    
    /** Descrição do cliente. */
    var description: js.UndefOr[String] = js.undefined
    
    /** Email do cliente */
    var email: js.UndefOr[String] = js.undefined
    
    /** Nome do cliente. */
    var first_name: js.UndefOr[String] = js.undefined
    
    /** Informações sobre a identificação do cliente. */
    var identification: js.UndefOr[Identification] = js.undefined
    
    /** Sobrenome do cliente. */
    var last_name: js.UndefOr[String] = js.undefined
    
    /** Metadata do cliente */
    var metadata: js.UndefOr[Any] = js.undefined
    
    /** Telefone do cliente. */
    var phone: js.UndefOr[OmitPhoneextension] = js.undefined
  }
  object CreateCustomerPayload {
    
    inline def apply(): CreateCustomerPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateCustomerPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateCustomerPayload] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: SimpleAddressId): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setDate_registered(value: String): Self = StObject.set(x, "date_registered", value.asInstanceOf[js.Any])
      
      inline def setDate_registeredUndefined: Self = StObject.set(x, "date_registered", js.undefined)
      
      inline def setDefault_address(value: String): Self = StObject.set(x, "default_address", value.asInstanceOf[js.Any])
      
      inline def setDefault_addressUndefined: Self = StObject.set(x, "default_address", js.undefined)
      
      inline def setDefault_card(value: String): Self = StObject.set(x, "default_card", value.asInstanceOf[js.Any])
      
      inline def setDefault_cardUndefined: Self = StObject.set(x, "default_card", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
      
      inline def setIdentification(value: Identification): Self = StObject.set(x, "identification", value.asInstanceOf[js.Any])
      
      inline def setIdentificationUndefined: Self = StObject.set(x, "identification", js.undefined)
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPhone(value: OmitPhoneextension): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    }
  }
}
