package typings.mercadopago

import typings.mercadopago.anon.OmitPhoneextension
import typings.mercadopago.mercadopagoStrings.association
import typings.mercadopago.mercadopagoStrings.customer
import typings.mercadopago.mercadopagoStrings.guest
import typings.mercadopago.mercadopagoStrings.individual
import typings.mercadopago.mercadopagoStrings.mercadolibre
import typings.mercadopago.mercadopagoStrings.registered
import typings.mercadopago.sharedAddressMod.Address
import typings.mercadopago.sharedAddressMod.SimpleAddress
import typings.mercadopago.sharedItemMod.Item
import typings.mercadopago.sharedPayerIdentificationMod.Identification
import typings.mercadopago.sharedPhoneMod.Phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsPaymentCreatePayloadDotmodelMod {
  
  trait AdditionalInfo extends StObject {
    
    /** IP do qual provém o request (apenas para transferência bancária). */
    var ip_address: js.UndefOr[String] = js.undefined
    
    /** Lista de itens a pagar. */
    var items: js.UndefOr[js.Array[PaymentItem]] = js.undefined
    
    /** Informação do comprador. */
    var payer: js.UndefOr[PayerAdditionalInfo] = js.undefined
    
    /** Data de cadastro do comprador em seu site. */
    var registration_date: js.UndefOr[String] = js.undefined
    
    /** Informações de envio. */
    var shipments: js.UndefOr[Shipments] = js.undefined
  }
  object AdditionalInfo {
    
    inline def apply(): AdditionalInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdditionalInfo] (val x: Self) extends AnyVal {
      
      inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      inline def setIp_addressUndefined: Self = StObject.set(x, "ip_address", js.undefined)
      
      inline def setItems(value: js.Array[PaymentItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: PaymentItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setPayer(value: PayerAdditionalInfo): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
      
      inline def setPayerUndefined: Self = StObject.set(x, "payer", js.undefined)
      
      inline def setRegistration_date(value: String): Self = StObject.set(x, "registration_date", value.asInstanceOf[js.Any])
      
      inline def setRegistration_dateUndefined: Self = StObject.set(x, "registration_date", js.undefined)
      
      inline def setShipments(value: Shipments): Self = StObject.set(x, "shipments", value.asInstanceOf[js.Any])
      
      inline def setShipmentsUndefined: Self = StObject.set(x, "shipments", js.undefined)
    }
  }
  
  trait CreatePaymentPayload extends StObject {
    
    /** Informações que podem melhorar a análise de prevenção de fraude e a taxa de conversão. Trata de enviar-nos toda a informação possível. */
    var additional_info: js.UndefOr[AdditionalInfo] = js.undefined
    
    /** Comissão coletadas pelo mercado ou pelo Mercado Pago. */
    var application_fee: js.UndefOr[Double] = js.undefined
    
    /** Quando estiver ativado, o pagamento só pode ser aprovado ou rejeitado. De não estar ativado, para além deste estado, o pagamento pode ser pendente (in_process). */
    var binary_mode: js.UndefOr[Boolean] = js.undefined
    
    /** URL para a qual o Mercado Pago faz o redirecionamento final (apenas para transferência bancária). */
    var callback_url: js.UndefOr[String] = js.undefined
    
    /** Identificador da campanha de desconto. */
    var campaign_id: js.UndefOr[Double] = js.undefined
    
    /** Determina se o pagamento deve ser capturado(true, default value), ou apenas reservado(false). */
    var capture: js.UndefOr[Boolean] = js.undefined
    
    /** Valor do cupom de desconto. */
    var coupon_amount: js.UndefOr[Double] = js.undefined
    
    /** Campanha de desconto com um código específico. */
    var coupon_code: js.UndefOr[String] = js.undefined
    
    /** Data (ISO 8601) de expiração do pagamento. */
    var date_of_expiration: js.UndefOr[String] = js.undefined
    
    /** Razão de pagamento ou título do item. */
    var description: js.UndefOr[String] = js.undefined
    
    /** Id do esquema de absorção do custo financeiro. */
    var differential_pricing_id: js.UndefOr[Double] = js.undefined
    
    /** Identificação fornecida pelo vendedor em seu sistema. */
    var external_reference: js.UndefOr[String] = js.undefined
    
    /** Quantidade selecionada de cotas. (Obrigatório) */
    var installments: Double
    
    /** Id do emitente do meio de pagamento. */
    var issuer_id: js.UndefOr[String] = js.undefined
    
    /** JSON válido que pode ser adicionado ao pagamento para salvar atributos adicionais do comprador. */
    var metadata: js.UndefOr[Any] = js.undefined
    
    /** URL para qual Mercado Pago enviará notificações associadas a mudanças no status do pagamento. */
    var notification_url: js.UndefOr[String] = js.undefined
    
    /** Identificador de ordem. */
    var order: js.UndefOr[PaymentOrder] = js.undefined
    
    /** Informações sobre o pagador associado. */
    var payer: PaymentPayer
    
    /** Meio de pagamento escolhido para fazer o pagamento. */
    var payment_method_id: String
    
    /** Como aparecerá o pagamento no extrato do cartão (ex: o MERCADOPAGO). */
    var statement_descriptor: js.UndefOr[String] = js.undefined
    
    /** Identificador de token card. (Obrigatório para cartão de crédito) */
    var token: js.UndefOr[String] = js.undefined
    
    /** Custo do produto. */
    var transaction_amount: Double
  }
  object CreatePaymentPayload {
    
    inline def apply(installments: Double, payer: PaymentPayer, payment_method_id: String, transaction_amount: Double): CreatePaymentPayload = {
      val __obj = js.Dynamic.literal(installments = installments.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], payment_method_id = payment_method_id.asInstanceOf[js.Any], transaction_amount = transaction_amount.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreatePaymentPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreatePaymentPayload] (val x: Self) extends AnyVal {
      
      inline def setAdditional_info(value: AdditionalInfo): Self = StObject.set(x, "additional_info", value.asInstanceOf[js.Any])
      
      inline def setAdditional_infoUndefined: Self = StObject.set(x, "additional_info", js.undefined)
      
      inline def setApplication_fee(value: Double): Self = StObject.set(x, "application_fee", value.asInstanceOf[js.Any])
      
      inline def setApplication_feeUndefined: Self = StObject.set(x, "application_fee", js.undefined)
      
      inline def setBinary_mode(value: Boolean): Self = StObject.set(x, "binary_mode", value.asInstanceOf[js.Any])
      
      inline def setBinary_modeUndefined: Self = StObject.set(x, "binary_mode", js.undefined)
      
      inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
      
      inline def setCallback_urlUndefined: Self = StObject.set(x, "callback_url", js.undefined)
      
      inline def setCampaign_id(value: Double): Self = StObject.set(x, "campaign_id", value.asInstanceOf[js.Any])
      
      inline def setCampaign_idUndefined: Self = StObject.set(x, "campaign_id", js.undefined)
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setCoupon_amount(value: Double): Self = StObject.set(x, "coupon_amount", value.asInstanceOf[js.Any])
      
      inline def setCoupon_amountUndefined: Self = StObject.set(x, "coupon_amount", js.undefined)
      
      inline def setCoupon_code(value: String): Self = StObject.set(x, "coupon_code", value.asInstanceOf[js.Any])
      
      inline def setCoupon_codeUndefined: Self = StObject.set(x, "coupon_code", js.undefined)
      
      inline def setDate_of_expiration(value: String): Self = StObject.set(x, "date_of_expiration", value.asInstanceOf[js.Any])
      
      inline def setDate_of_expirationUndefined: Self = StObject.set(x, "date_of_expiration", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDifferential_pricing_id(value: Double): Self = StObject.set(x, "differential_pricing_id", value.asInstanceOf[js.Any])
      
      inline def setDifferential_pricing_idUndefined: Self = StObject.set(x, "differential_pricing_id", js.undefined)
      
      inline def setExternal_reference(value: String): Self = StObject.set(x, "external_reference", value.asInstanceOf[js.Any])
      
      inline def setExternal_referenceUndefined: Self = StObject.set(x, "external_reference", js.undefined)
      
      inline def setInstallments(value: Double): Self = StObject.set(x, "installments", value.asInstanceOf[js.Any])
      
      inline def setIssuer_id(value: String): Self = StObject.set(x, "issuer_id", value.asInstanceOf[js.Any])
      
      inline def setIssuer_idUndefined: Self = StObject.set(x, "issuer_id", js.undefined)
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setNotification_url(value: String): Self = StObject.set(x, "notification_url", value.asInstanceOf[js.Any])
      
      inline def setNotification_urlUndefined: Self = StObject.set(x, "notification_url", js.undefined)
      
      inline def setOrder(value: PaymentOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPayer(value: PaymentPayer): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
      
      inline def setPayment_method_id(value: String): Self = StObject.set(x, "payment_method_id", value.asInstanceOf[js.Any])
      
      inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      inline def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setTransaction_amount(value: Double): Self = StObject.set(x, "transaction_amount", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Pick<mercadopago.mercadopago/models/payment/create-payload.model.PaymentPayer, 'first_name' | 'last_name'> */
  trait PayerAdditionalInfo extends StObject {
    
    /** Endereço do pagador. */
    var address: js.UndefOr[SimpleAddress] = js.undefined
    
    var first_name: js.UndefOr[String] = js.undefined
    
    var last_name: js.UndefOr[String] = js.undefined
    
    /** Telefone do pagador associado. */
    var phone: js.UndefOr[OmitPhoneextension] = js.undefined
  }
  object PayerAdditionalInfo {
    
    inline def apply(): PayerAdditionalInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayerAdditionalInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PayerAdditionalInfo] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: SimpleAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
      
      inline def setPhone(value: OmitPhoneextension): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    }
  }
  
  trait PaymentItem
    extends StObject
       with Item {
    
    /** Código de anúncio. */
    var id: js.UndefOr[String] = js.undefined
  }
  object PaymentItem {
    
    inline def apply(): PaymentItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaymentItem] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait PaymentOrder extends StObject {
    
    var id: Double
    
    var `type`: mercadolibre | typings.mercadopago.mercadopagoStrings.mercadopago
  }
  object PaymentOrder {
    
    inline def apply(id: Double, `type`: mercadolibre | typings.mercadopago.mercadopagoStrings.mercadopago): PaymentOrder = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentOrder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaymentOrder] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: mercadolibre | typings.mercadopago.mercadopagoStrings.mercadopago): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaymentPayer extends StObject {
    
    var email: String
    
    /** Quando estiver ativado, o pagamento só pode ser aprovado ou rejeitado. De não estar ativado, para além deste estado, o pagamento pode ser pendente (in_process). */
    var entity_type: js.UndefOr[individual | association] = js.undefined
    
    /** Nome do pagador associado. */
    var first_name: js.UndefOr[String] = js.undefined
    
    /** Identificação do pagador associado. */
    var id: js.UndefOr[String] = js.undefined
    
    /** Identificação pessoal. */
    var identification: js.UndefOr[Identification] = js.undefined
    
    var last_name: js.UndefOr[String] = js.undefined
    
    /** Telefone do pagador associado. */
    var phone: js.UndefOr[Phone] = js.undefined
    
    /** Tipo de identificação do pagador associado (se necessário o pagador é um cliente). */
    var `type`: js.UndefOr[customer | registered | guest] = js.undefined
  }
  object PaymentPayer {
    
    inline def apply(email: String): PaymentPayer = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentPayer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaymentPayer] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEntity_type(value: individual | association): Self = StObject.set(x, "entity_type", value.asInstanceOf[js.Any])
      
      inline def setEntity_typeUndefined: Self = StObject.set(x, "entity_type", js.undefined)
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIdentification(value: Identification): Self = StObject.set(x, "identification", value.asInstanceOf[js.Any])
      
      inline def setIdentificationUndefined: Self = StObject.set(x, "identification", js.undefined)
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
      
      inline def setPhone(value: Phone): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      inline def setType(value: customer | registered | guest): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Shipments
    extends StObject
       with Address {
    
    /** Endereço do comprador. */
    var receiver_address: js.UndefOr[String] = js.undefined
  }
  object Shipments {
    
    inline def apply(): Shipments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shipments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Shipments] (val x: Self) extends AnyVal {
      
      inline def setReceiver_address(value: String): Self = StObject.set(x, "receiver_address", value.asInstanceOf[js.Any])
      
      inline def setReceiver_addressUndefined: Self = StObject.set(x, "receiver_address", js.undefined)
    }
  }
}
