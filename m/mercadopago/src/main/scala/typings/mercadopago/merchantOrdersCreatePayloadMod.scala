package typings.mercadopago

import typings.mercadopago.itemMod.Item
import typings.mercadopago.mercadopagoStrings.ARS
import typings.mercadopago.mercadopagoStrings.BRL
import typings.mercadopago.mercadopagoStrings.CLP
import typings.mercadopago.mercadopagoStrings.COP
import typings.mercadopago.mercadopagoStrings.MXN
import typings.mercadopago.mercadopagoStrings.PEN
import typings.mercadopago.mercadopagoStrings.UYU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object merchantOrdersCreatePayloadMod {
  
  trait CreateMerchantOrderPayload extends StObject {
    
    /** Informações adicionais do pagamento. */
    var additional_info: js.UndefOr[String] = js.undefined
    
    /** Id do aplicativo. */
    var application_id: js.UndefOr[String] = js.undefined
    
    /** Referência que pode sincronizar com seu sistema de pagamentos. */
    var external_reference: js.UndefOr[String] = js.undefined
    
    /** Informação do item. */
    var items: js.UndefOr[js.Array[MerchantOrderItem]] = js.undefined
    
    /** Origem do pagamento. Valor padrão: 'NONE' */
    var marketplace: js.UndefOr[String] = js.undefined
    
    /** URL em que você gostaria de receber uma notificação de status de pagamento. */
    var notification_url: js.UndefOr[String] = js.undefined
    
    /** Informação do comprador. */
    var payer: js.UndefOr[MerchantOrderPayer] = js.undefined
    
    /** Identificação da preferência de pagamento associados à ordem. */
    var preference_id: js.UndefOr[String] = js.undefined
    
    /** Identificador do país a que pertence a ordem. */
    var site_id: js.UndefOr[String] = js.undefined
    
    /** Sponsor ID in Mercado Pago. */
    var sponsor_id: js.UndefOr[Double] = js.undefined
  }
  object CreateMerchantOrderPayload {
    
    inline def apply(): CreateMerchantOrderPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateMerchantOrderPayload]
    }
    
    extension [Self <: CreateMerchantOrderPayload](x: Self) {
      
      inline def setAdditional_info(value: String): Self = StObject.set(x, "additional_info", value.asInstanceOf[js.Any])
      
      inline def setAdditional_infoUndefined: Self = StObject.set(x, "additional_info", js.undefined)
      
      inline def setApplication_id(value: String): Self = StObject.set(x, "application_id", value.asInstanceOf[js.Any])
      
      inline def setApplication_idUndefined: Self = StObject.set(x, "application_id", js.undefined)
      
      inline def setExternal_reference(value: String): Self = StObject.set(x, "external_reference", value.asInstanceOf[js.Any])
      
      inline def setExternal_referenceUndefined: Self = StObject.set(x, "external_reference", js.undefined)
      
      inline def setItems(value: js.Array[MerchantOrderItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: MerchantOrderItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMarketplace(value: String): Self = StObject.set(x, "marketplace", value.asInstanceOf[js.Any])
      
      inline def setMarketplaceUndefined: Self = StObject.set(x, "marketplace", js.undefined)
      
      inline def setNotification_url(value: String): Self = StObject.set(x, "notification_url", value.asInstanceOf[js.Any])
      
      inline def setNotification_urlUndefined: Self = StObject.set(x, "notification_url", js.undefined)
      
      inline def setPayer(value: MerchantOrderPayer): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
      
      inline def setPayerUndefined: Self = StObject.set(x, "payer", js.undefined)
      
      inline def setPreference_id(value: String): Self = StObject.set(x, "preference_id", value.asInstanceOf[js.Any])
      
      inline def setPreference_idUndefined: Self = StObject.set(x, "preference_id", js.undefined)
      
      inline def setSite_id(value: String): Self = StObject.set(x, "site_id", value.asInstanceOf[js.Any])
      
      inline def setSite_idUndefined: Self = StObject.set(x, "site_id", js.undefined)
      
      inline def setSponsor_id(value: Double): Self = StObject.set(x, "sponsor_id", value.asInstanceOf[js.Any])
      
      inline def setSponsor_idUndefined: Self = StObject.set(x, "sponsor_id", js.undefined)
    }
  }
  
  trait MerchantOrderItem
    extends StObject
       with Item {
    
    /** Identificador da moeda utilizada no preço do item. */
    var currency_id: js.UndefOr[ARS | BRL | CLP | MXN | COP | PEN | UYU] = js.undefined
    
    /** Id do anúncio. */
    var id: js.UndefOr[Double] = js.undefined
  }
  object MerchantOrderItem {
    
    inline def apply(): MerchantOrderItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MerchantOrderItem]
    }
    
    extension [Self <: MerchantOrderItem](x: Self) {
      
      inline def setCurrency_id(value: ARS | BRL | CLP | MXN | COP | PEN | UYU): Self = StObject.set(x, "currency_id", value.asInstanceOf[js.Any])
      
      inline def setCurrency_idUndefined: Self = StObject.set(x, "currency_id", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait MerchantOrderPayer extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    var nickname: js.UndefOr[String] = js.undefined
  }
  object MerchantOrderPayer {
    
    inline def apply(): MerchantOrderPayer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MerchantOrderPayer]
    }
    
    extension [Self <: MerchantOrderPayer](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
      
      inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    }
  }
}
