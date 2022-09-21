package typings.mercadopago

import typings.mercadopago.mercadopagoStrings.ARS
import typings.mercadopago.mercadopagoStrings.BRL
import typings.mercadopago.mercadopagoStrings.CLP
import typings.mercadopago.mercadopagoStrings.COP
import typings.mercadopago.mercadopagoStrings.MXN
import typings.mercadopago.mercadopagoStrings.PEN
import typings.mercadopago.mercadopagoStrings.UYU
import typings.mercadopago.merchantOrdersCreatePayloadMod.MerchantOrderPayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object merchantOrdersUpdatePayloadMod {
  
  /* Inlined parent std.Omit<mercadopago.mercadopago/models/merchantOrders/create-payload.MerchantOrderItem, 'id'> */
  trait UpdateMerchantOrderItem extends StObject {
    
    var category_id: js.UndefOr[String] = js.undefined
    
    var currency_id: js.UndefOr[ARS | BRL | CLP | MXN | COP | PEN | UYU] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    /** / ** Id do anúncio. */
    var id: String
    
    var picture_url: js.UndefOr[String] = js.undefined
    
    var quantity: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var unit_price: js.UndefOr[Double] = js.undefined
  }
  object UpdateMerchantOrderItem {
    
    inline def apply(id: String): UpdateMerchantOrderItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateMerchantOrderItem]
    }
    
    extension [Self <: UpdateMerchantOrderItem](x: Self) {
      
      inline def setCategory_id(value: String): Self = StObject.set(x, "category_id", value.asInstanceOf[js.Any])
      
      inline def setCategory_idUndefined: Self = StObject.set(x, "category_id", js.undefined)
      
      inline def setCurrency_id(value: ARS | BRL | CLP | MXN | COP | PEN | UYU): Self = StObject.set(x, "currency_id", value.asInstanceOf[js.Any])
      
      inline def setCurrency_idUndefined: Self = StObject.set(x, "currency_id", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPicture_url(value: String): Self = StObject.set(x, "picture_url", value.asInstanceOf[js.Any])
      
      inline def setPicture_urlUndefined: Self = StObject.set(x, "picture_url", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUnit_price(value: Double): Self = StObject.set(x, "unit_price", value.asInstanceOf[js.Any])
      
      inline def setUnit_priceUndefined: Self = StObject.set(x, "unit_price", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<mercadopago.mercadopago/models/merchantOrders/create-payload.CreateMerchantOrderPayload, 'items'> */
  trait UpdateMerchantOrderPayload extends StObject {
    
    var additional_info: js.UndefOr[String] = js.undefined
    
    var application_id: js.UndefOr[String] = js.undefined
    
    var external_reference: js.UndefOr[String] = js.undefined
    
    var id: Double | String
    
    var items: js.UndefOr[js.Array[UpdateMerchantOrderItem]] = js.undefined
    
    var marketplace: js.UndefOr[String] = js.undefined
    
    var notification_url: js.UndefOr[String] = js.undefined
    
    var payer: js.UndefOr[MerchantOrderPayer] = js.undefined
    
    var preference_id: js.UndefOr[String] = js.undefined
    
    var site_id: js.UndefOr[String] = js.undefined
    
    var sponsor_id: js.UndefOr[Double] = js.undefined
  }
  object UpdateMerchantOrderPayload {
    
    inline def apply(id: Double | String): UpdateMerchantOrderPayload = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateMerchantOrderPayload]
    }
    
    extension [Self <: UpdateMerchantOrderPayload](x: Self) {
      
      inline def setAdditional_info(value: String): Self = StObject.set(x, "additional_info", value.asInstanceOf[js.Any])
      
      inline def setAdditional_infoUndefined: Self = StObject.set(x, "additional_info", js.undefined)
      
      inline def setApplication_id(value: String): Self = StObject.set(x, "application_id", value.asInstanceOf[js.Any])
      
      inline def setApplication_idUndefined: Self = StObject.set(x, "application_id", js.undefined)
      
      inline def setExternal_reference(value: String): Self = StObject.set(x, "external_reference", value.asInstanceOf[js.Any])
      
      inline def setExternal_referenceUndefined: Self = StObject.set(x, "external_reference", js.undefined)
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[UpdateMerchantOrderItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: UpdateMerchantOrderItem*): Self = StObject.set(x, "items", js.Array(value*))
      
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
}
