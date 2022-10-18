package typings.mercadopago

import typings.mercadopago.anon.Id
import typings.mercadopago.anon.IdString
import typings.mercadopago.anon.OmitPhoneextension
import typings.mercadopago.anon.Type
import typings.mercadopago.mercadopagoStrings.all_
import typings.mercadopago.mercadopagoStrings.approved
import typings.mercadopago.mercadopagoStrings.custom
import typings.mercadopago.mercadopagoStrings.facebook_ad
import typings.mercadopago.mercadopagoStrings.google_ad
import typings.mercadopago.mercadopagoStrings.me2
import typings.mercadopago.mercadopagoStrings.not_specified
import typings.mercadopago.sharedAddressMod.CompleteAddress
import typings.mercadopago.sharedAddressMod.SimpleAddress
import typings.mercadopago.sharedCurrencyMod.Currency
import typings.mercadopago.sharedPayerIdentificationMod.Identification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsPreferencesCreatePayloadDotmodelMod {
  
  trait CreatePreferencePayload extends StObject {
    
    /** Informações adicionais. */
    var additional_info: js.UndefOr[String] = js.undefined
    
    /**
      * No caso de estar especificado o comprador será redirecionado para o seu site imediatamente após a compra.
      * approved = The redirection takes place only for approved payments.
      * all = The redirection takes place only for approved payments, forward compatibility only if we change the default behavior
      */
    var auto_return: js.UndefOr[approved | all_] = js.undefined
    
    /** Url de retorno ao site do vendedor. */
    var back_urls: js.UndefOr[PreferenceBackUrl] = js.undefined
    
    /** Quando definido como true, o pagamento só pode ter os status approved ou rejected. Caso contrário, o status in_process é adicionado. */
    var binary_mode: js.UndefOr[Boolean] = js.undefined
    
    /** Data (ISO_8601) de expiração de meios de pagamento em dinheiro. */
    var date_of_expiration: js.UndefOr[String] = js.undefined
    
    /** Configuração de preço diferencial para esta preferência. */
    var differential_pricing: js.UndefOr[Id] = js.undefined
    
    /** Data (ISO_8601) a partir da qual a preferência estará ativa. */
    var expiration_date_from: js.UndefOr[String] = js.undefined
    
    /** Data (ISO_8601) em que a preferência expira. */
    var expiration_date_to: js.UndefOr[String] = js.undefined
    
    /** Preferência que determina se uma preferência expira. */
    var expires: js.UndefOr[Boolean] = js.undefined
    
    /** Referência que pode sincronizar com seu sistema de pagamentos. */
    var external_reference: js.UndefOr[String] = js.undefined
    
    /** Informações sobre o item. */
    var items: js.UndefOr[js.Array[PreferenceItem]] = js.undefined
    
    /** Origem do pagamento. Valor por defeito: NENHUM */
    var marketplace: js.UndefOr[String] = js.undefined
    
    /** Comissão de Mercado cobrada pelo proprietário do aplicativo. Valor por default: 0 em moeda local */
    var marketplace_fee: js.UndefOr[Double] = js.undefined
    
    /** URL para a qual você gostaria de receber notificações de pagamentos. */
    var notification_url: js.UndefOr[String] = js.undefined
    
    /** Informações sobre o comprador. */
    var payer: js.UndefOr[PreferencePayer] = js.undefined
    
    /** Métodos de pagamento a ser excluídos do fluxo de pagamento. */
    var payment_methods: js.UndefOr[PreferencePaymentMethods] = js.undefined
    
    /** Quando for indicado o valor wallet_purchase, o Checkout aceitará pagamentos exclusivamente de usuários cadastrados no Mercado Pago, com cartão e saldo em conta. */
    var purpose: js.UndefOr[String] = js.undefined
    
    /** Informações de envio. */
    var shipments: js.UndefOr[PreferenceShipment] = js.undefined
    
    /** Como aparecerá o pagamento no extrato do cartão (ex: o MERCADOPAGO). */
    var statement_descriptor: js.UndefOr[String] = js.undefined
    
    /** Definição de impostos diferenciados. Disponível apenas para o Mercado Livre Colombia. */
    var taxes: js.UndefOr[js.Array[Type]] = js.undefined
    
    /** Tracks que serão executados durante a interação do usuário no fluxo de Pagamento. */
    var tracks: js.UndefOr[js.Array[PreferenceTrack]] = js.undefined
  }
  object CreatePreferencePayload {
    
    inline def apply(): CreatePreferencePayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatePreferencePayload]
    }
    
    extension [Self <: CreatePreferencePayload](x: Self) {
      
      inline def setAdditional_info(value: String): Self = StObject.set(x, "additional_info", value.asInstanceOf[js.Any])
      
      inline def setAdditional_infoUndefined: Self = StObject.set(x, "additional_info", js.undefined)
      
      inline def setAuto_return(value: approved | all_): Self = StObject.set(x, "auto_return", value.asInstanceOf[js.Any])
      
      inline def setAuto_returnUndefined: Self = StObject.set(x, "auto_return", js.undefined)
      
      inline def setBack_urls(value: PreferenceBackUrl): Self = StObject.set(x, "back_urls", value.asInstanceOf[js.Any])
      
      inline def setBack_urlsUndefined: Self = StObject.set(x, "back_urls", js.undefined)
      
      inline def setBinary_mode(value: Boolean): Self = StObject.set(x, "binary_mode", value.asInstanceOf[js.Any])
      
      inline def setBinary_modeUndefined: Self = StObject.set(x, "binary_mode", js.undefined)
      
      inline def setDate_of_expiration(value: String): Self = StObject.set(x, "date_of_expiration", value.asInstanceOf[js.Any])
      
      inline def setDate_of_expirationUndefined: Self = StObject.set(x, "date_of_expiration", js.undefined)
      
      inline def setDifferential_pricing(value: Id): Self = StObject.set(x, "differential_pricing", value.asInstanceOf[js.Any])
      
      inline def setDifferential_pricingUndefined: Self = StObject.set(x, "differential_pricing", js.undefined)
      
      inline def setExpiration_date_from(value: String): Self = StObject.set(x, "expiration_date_from", value.asInstanceOf[js.Any])
      
      inline def setExpiration_date_fromUndefined: Self = StObject.set(x, "expiration_date_from", js.undefined)
      
      inline def setExpiration_date_to(value: String): Self = StObject.set(x, "expiration_date_to", value.asInstanceOf[js.Any])
      
      inline def setExpiration_date_toUndefined: Self = StObject.set(x, "expiration_date_to", js.undefined)
      
      inline def setExpires(value: Boolean): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setExternal_reference(value: String): Self = StObject.set(x, "external_reference", value.asInstanceOf[js.Any])
      
      inline def setExternal_referenceUndefined: Self = StObject.set(x, "external_reference", js.undefined)
      
      inline def setItems(value: js.Array[PreferenceItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: PreferenceItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMarketplace(value: String): Self = StObject.set(x, "marketplace", value.asInstanceOf[js.Any])
      
      inline def setMarketplaceUndefined: Self = StObject.set(x, "marketplace", js.undefined)
      
      inline def setMarketplace_fee(value: Double): Self = StObject.set(x, "marketplace_fee", value.asInstanceOf[js.Any])
      
      inline def setMarketplace_feeUndefined: Self = StObject.set(x, "marketplace_fee", js.undefined)
      
      inline def setNotification_url(value: String): Self = StObject.set(x, "notification_url", value.asInstanceOf[js.Any])
      
      inline def setNotification_urlUndefined: Self = StObject.set(x, "notification_url", js.undefined)
      
      inline def setPayer(value: PreferencePayer): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
      
      inline def setPayerUndefined: Self = StObject.set(x, "payer", js.undefined)
      
      inline def setPayment_methods(value: PreferencePaymentMethods): Self = StObject.set(x, "payment_methods", value.asInstanceOf[js.Any])
      
      inline def setPayment_methodsUndefined: Self = StObject.set(x, "payment_methods", js.undefined)
      
      inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
      
      inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
      
      inline def setShipments(value: PreferenceShipment): Self = StObject.set(x, "shipments", value.asInstanceOf[js.Any])
      
      inline def setShipmentsUndefined: Self = StObject.set(x, "shipments", js.undefined)
      
      inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      inline def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
      
      inline def setTaxes(value: js.Array[Type]): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
      
      inline def setTaxesUndefined: Self = StObject.set(x, "taxes", js.undefined)
      
      inline def setTaxesVarargs(value: Type*): Self = StObject.set(x, "taxes", js.Array(value*))
      
      inline def setTracks(value: js.Array[PreferenceTrack]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
      
      inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
      
      inline def setTracksVarargs(value: PreferenceTrack*): Self = StObject.set(x, "tracks", js.Array(value*))
    }
  }
  
  trait PreferenceBackUrl extends StObject {
    
    /** URL de retorno ante o pagamento cancelado. */
    var failure: js.UndefOr[String] = js.undefined
    
    /** URL de retorno ante o pagamento pendente. */
    var pending: js.UndefOr[String] = js.undefined
    
    /** URL de retorno ante o pagamento aprovado. */
    var success: js.UndefOr[String] = js.undefined
  }
  object PreferenceBackUrl {
    
    inline def apply(): PreferenceBackUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreferenceBackUrl]
    }
    
    extension [Self <: PreferenceBackUrl](x: Self) {
      
      inline def setFailure(value: String): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
      
      inline def setPending(value: String): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  trait PreferenceItem extends StObject {
    
    /** Identificador da categoria do item. */
    var category_id: js.UndefOr[String] = js.undefined
    
    /** Identificador de moeda em formato ISO_4217. */
    var currency_id: js.UndefOr[Currency] = js.undefined
    
    /** Descrição do artigo. */
    var description: js.UndefOr[String] = js.undefined
    
    /** Indentificador do item. */
    var id: js.UndefOr[String] = js.undefined
    
    /** URL da imagem do anúncio. */
    var picture_url: js.UndefOr[String] = js.undefined
    
    /** Quantidade de itens. */
    var quantity: js.UndefOr[Double] = js.undefined
    
    /** Título do item, é apresentado o fluxo de pagamento. */
    var title: js.UndefOr[String] = js.undefined
    
    /** Preço unitário. */
    var unit_price: js.UndefOr[Double] = js.undefined
  }
  object PreferenceItem {
    
    inline def apply(): PreferenceItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreferenceItem]
    }
    
    extension [Self <: PreferenceItem](x: Self) {
      
      inline def setCategory_id(value: String): Self = StObject.set(x, "category_id", value.asInstanceOf[js.Any])
      
      inline def setCategory_idUndefined: Self = StObject.set(x, "category_id", js.undefined)
      
      inline def setCurrency_id(value: Currency): Self = StObject.set(x, "currency_id", value.asInstanceOf[js.Any])
      
      inline def setCurrency_idUndefined: Self = StObject.set(x, "currency_id", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
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
  
  trait PreferencePayer extends StObject {
    
    /** Endereço do comprador. */
    var address: js.UndefOr[SimpleAddress] = js.undefined
    
    /** Data (ISO 8601) de registro. */
    var date_created: js.UndefOr[String] = js.undefined
    
    /** Endereço de e-mail do comprador. */
    var email: js.UndefOr[String] = js.undefined
    
    /** Identificação pessoal. */
    var identification: js.UndefOr[Identification] = js.undefined
    
    /** Nome do comprador. */
    var name: js.UndefOr[String] = js.undefined
    
    /** Telefone do comprador. */
    var phone: js.UndefOr[OmitPhoneextension] = js.undefined
    
    /** Apelido do comprador. */
    var surname: js.UndefOr[String] = js.undefined
  }
  object PreferencePayer {
    
    inline def apply(): PreferencePayer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreferencePayer]
    }
    
    extension [Self <: PreferencePayer](x: Self) {
      
      inline def setAddress(value: SimpleAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setIdentification(value: Identification): Self = StObject.set(x, "identification", value.asInstanceOf[js.Any])
      
      inline def setIdentificationUndefined: Self = StObject.set(x, "identification", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPhone(value: OmitPhoneextension): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      inline def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
      
      inline def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
    }
  }
  
  trait PreferencePaymentMethods extends StObject {
    
    /** Preferência de cotas. */
    var default_installments: js.UndefOr[Double] = js.undefined
    
    /** Meio de pagamento preferido. */
    var default_payment_method_id: js.UndefOr[String] = js.undefined
    
    /** Métodos de pagamento não são permitidos no fluxo de pagamento (à exceção de account_money). */
    var excluded_payment_methods: js.UndefOr[js.Array[IdString]] = js.undefined
    
    /** Tipos de pagamento não são permitidos no fluxo de pagamento. */
    var excluded_payment_types: js.UndefOr[js.Array[IdString]] = js.undefined
    
    /** Número Máximo de cotas. */
    var installments: js.UndefOr[Double] = js.undefined
  }
  object PreferencePaymentMethods {
    
    inline def apply(): PreferencePaymentMethods = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreferencePaymentMethods]
    }
    
    extension [Self <: PreferencePaymentMethods](x: Self) {
      
      inline def setDefault_installments(value: Double): Self = StObject.set(x, "default_installments", value.asInstanceOf[js.Any])
      
      inline def setDefault_installmentsUndefined: Self = StObject.set(x, "default_installments", js.undefined)
      
      inline def setDefault_payment_method_id(value: String): Self = StObject.set(x, "default_payment_method_id", value.asInstanceOf[js.Any])
      
      inline def setDefault_payment_method_idUndefined: Self = StObject.set(x, "default_payment_method_id", js.undefined)
      
      inline def setExcluded_payment_methods(value: js.Array[IdString]): Self = StObject.set(x, "excluded_payment_methods", value.asInstanceOf[js.Any])
      
      inline def setExcluded_payment_methodsUndefined: Self = StObject.set(x, "excluded_payment_methods", js.undefined)
      
      inline def setExcluded_payment_methodsVarargs(value: IdString*): Self = StObject.set(x, "excluded_payment_methods", js.Array(value*))
      
      inline def setExcluded_payment_types(value: js.Array[IdString]): Self = StObject.set(x, "excluded_payment_types", value.asInstanceOf[js.Any])
      
      inline def setExcluded_payment_typesUndefined: Self = StObject.set(x, "excluded_payment_types", js.undefined)
      
      inline def setExcluded_payment_typesVarargs(value: IdString*): Self = StObject.set(x, "excluded_payment_types", js.Array(value*))
      
      inline def setInstallments(value: Double): Self = StObject.set(x, "installments", value.asInstanceOf[js.Any])
      
      inline def setInstallmentsUndefined: Self = StObject.set(x, "installments", js.undefined)
    }
  }
  
  trait PreferenceShipment extends StObject {
    
    /** Custo do transporte (mode:custom somente). */
    var cost: js.UndefOr[Double] = js.undefined
    
    /** Escolha um método de envio padrão no _checkout_(mode:me2 somente). */
    var default_shipping_method: js.UndefOr[Double] = js.undefined
    
    /** Tamanho do pacote em cm x cm x cm, gr (mode:me2 somente) */
    var dimensions: js.UndefOr[String] = js.undefined
    
    /** Oferecer um método de frete grátis (mode:me2 somente). */
    var free_methods: js.UndefOr[js.Array[Id]] = js.undefined
    
    /** Preferência de frete grátis para mode:custom. */
    var free_shipping: js.UndefOr[Boolean] = js.undefined
    
    /** Preferência de remoção de pacotes em agência(mode:me2 somente). */
    var local_pickup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * custom = Custom shipping.
      * me2 = Mercado Envíos.
      * not_specified = Shipping mode not specified.
      */
    var mode: js.UndefOr[custom | me2 | not_specified] = js.undefined
    
    /** Endereço de envio. */
    var receiver_address: js.UndefOr[CompleteAddress] = js.undefined
  }
  object PreferenceShipment {
    
    inline def apply(): PreferenceShipment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreferenceShipment]
    }
    
    extension [Self <: PreferenceShipment](x: Self) {
      
      inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
      
      inline def setDefault_shipping_method(value: Double): Self = StObject.set(x, "default_shipping_method", value.asInstanceOf[js.Any])
      
      inline def setDefault_shipping_methodUndefined: Self = StObject.set(x, "default_shipping_method", js.undefined)
      
      inline def setDimensions(value: String): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      inline def setFree_methods(value: js.Array[Id]): Self = StObject.set(x, "free_methods", value.asInstanceOf[js.Any])
      
      inline def setFree_methodsUndefined: Self = StObject.set(x, "free_methods", js.undefined)
      
      inline def setFree_methodsVarargs(value: Id*): Self = StObject.set(x, "free_methods", js.Array(value*))
      
      inline def setFree_shipping(value: Boolean): Self = StObject.set(x, "free_shipping", value.asInstanceOf[js.Any])
      
      inline def setFree_shippingUndefined: Self = StObject.set(x, "free_shipping", js.undefined)
      
      inline def setLocal_pickup(value: Boolean): Self = StObject.set(x, "local_pickup", value.asInstanceOf[js.Any])
      
      inline def setLocal_pickupUndefined: Self = StObject.set(x, "local_pickup", js.undefined)
      
      inline def setMode(value: custom | me2 | not_specified): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setReceiver_address(value: CompleteAddress): Self = StObject.set(x, "receiver_address", value.asInstanceOf[js.Any])
      
      inline def setReceiver_addressUndefined: Self = StObject.set(x, "receiver_address", js.undefined)
    }
  }
  
  trait PreferenceTrack extends StObject {
    
    /**
      * Tipo de rastreio. Especifique a qual ferramenta os valores pertencem.
      * google_ad = Configure uma tag de acompanhamento de conversões do Google Ads no GTM. Valores necessários: conversion_id e conversion_label.
      * facebook_ad = Permite configurar um pixel do Facebook. Valores necessários: pixel_id.
      */
    var `type`: google_ad | facebook_ad
    
    var values: Any
  }
  object PreferenceTrack {
    
    inline def apply(`type`: google_ad | facebook_ad, values: Any): PreferenceTrack = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreferenceTrack]
    }
    
    extension [Self <: PreferenceTrack](x: Self) {
      
      inline def setType(value: google_ad | facebook_ad): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
