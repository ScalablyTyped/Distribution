package typings.mercadopagoSdkJs

import typings.mercadopagoSdkJs.bricks.Bricks
import typings.mercadopagoSdkJs.bricks.BricksStyle
import typings.mercadopagoSdkJs.cardform.CardForm
import typings.mercadopagoSdkJs.cardform.CardFormOptions
import typings.mercadopagoSdkJs.fields.Fields
import typings.mercadopagoSdkJs.mercadopago.MercadoPago
import typings.mercadopagoSdkJs.mercadopagocore.CardTokenParams
import typings.mercadopagoSdkJs.mercadopagocore.CardTokenUpdateParams
import typings.mercadopagoSdkJs.mercadopagocore.IdentificationTypesResponse
import typings.mercadopagoSdkJs.mercadopagocore.InstallmentsParams
import typings.mercadopagoSdkJs.mercadopagocore.InstallmentsResponse
import typings.mercadopagoSdkJs.mercadopagocore.IssuersParams
import typings.mercadopagoSdkJs.mercadopagocore.IssuersResponse
import typings.mercadopagoSdkJs.mercadopagocore.MercadoPagoCore
import typings.mercadopagoSdkJs.mercadopagocore.Options
import typings.mercadopagoSdkJs.mercadopagocore.PaymentMethodsParams
import typings.mercadopagoSdkJs.mercadopagocore.PaymentMethodsResponse
import typings.mercadopagoSdkJs.shared.CardTokenResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("MercadoPago")
  @js.native
  open class MercadoPago_ protected ()
    extends StObject
       with MercadoPagoCore {
    def this(publicKey: String, options: Options) = this()
    
    /* CompleteClass */
    override def bricks(style: BricksStyle): Bricks = js.native
    
    /* CompleteClass */
    override def cardForm(options: CardFormOptions): CardForm = js.native
    
    /* CompleteClass */
    override def createCardToken(cardTokenParams: CardTokenParams): js.Promise[CardTokenResponse] = js.native
    
    /* CompleteClass */
    var fields: Fields = js.native
    
    /* CompleteClass */
    override def getIdentificationTypes(): js.Promise[js.Array[IdentificationTypesResponse]] = js.native
    
    /* CompleteClass */
    override def getInstallments(installmentsParams: InstallmentsParams): js.Promise[js.Array[InstallmentsResponse]] = js.native
    
    /* CompleteClass */
    override def getIssuers(issuersParams: IssuersParams): js.Promise[js.Array[IssuersResponse]] = js.native
    
    /* CompleteClass */
    override def getPaymentMethods(paymentMethodsParams: PaymentMethodsParams): js.Promise[PaymentMethodsResponse] = js.native
    
    /* CompleteClass */
    override def updateCardToken(CardTokenUpdateParams: CardTokenUpdateParams): js.Promise[CardTokenResponse] = js.native
  }
  
  @JSGlobal("MercadoPago")
  @js.native
  def MercadoPago_ : MercadoPago = js.native
  
  inline def MercadoPago__=(x: MercadoPago): Unit = js.Dynamic.global.updateDynamic("MercadoPago")(x.asInstanceOf[js.Any])
  
  object bricks {
    
    @JSGlobal("bricks.PaymentOption")
    @js.native
    object PaymentOption extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.mercadopagoSdkJs.bricks.PaymentOption & String] = js.native
      
      /* "bankTransferForm" */ val BANK_TRANSFER_FORM: typings.mercadopagoSdkJs.bricks.PaymentOption.BANK_TRANSFER_FORM & String = js.native
      
      /* "creditCardForm" */ val CREDIT_CARD_FORM: typings.mercadopagoSdkJs.bricks.PaymentOption.CREDIT_CARD_FORM & String = js.native
      
      /* "debitCardForm" */ val DEBIT_CARD_FORM: typings.mercadopagoSdkJs.bricks.PaymentOption.DEBIT_CARD_FORM & String = js.native
      
      /* "walletForm" */ val MERCADO_PAGO_FORM: typings.mercadopagoSdkJs.bricks.PaymentOption.MERCADO_PAGO_FORM & String = js.native
      
      /* "creditForm" */ val ONBOARDING_CREDITS_FORM: typings.mercadopagoSdkJs.bricks.PaymentOption.ONBOARDING_CREDITS_FORM & String = js.native
      
      /* "savedCardForm" */ val SAVED_CARD_FORM: typings.mercadopagoSdkJs.bricks.PaymentOption.SAVED_CARD_FORM & String = js.native
      
      /* "ticketForm" */ val TICKET_FORM: typings.mercadopagoSdkJs.bricks.PaymentOption.TICKET_FORM & String = js.native
    }
    
    @JSGlobal("bricks.PaymentType")
    @js.native
    object PaymentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.mercadopagoSdkJs.bricks.PaymentType & String] = js.native
      
      /* "atm" */ val ATM: typings.mercadopagoSdkJs.bricks.PaymentType.ATM & String = js.native
      
      /* "atm_online" */ val ATM_ONLINE: typings.mercadopagoSdkJs.bricks.PaymentType.ATM_ONLINE & String = js.native
      
      /* "bank_transfer" */ val BANK_TRANSFER: typings.mercadopagoSdkJs.bricks.PaymentType.BANK_TRANSFER & String = js.native
      
      /* "credit_card" */ val CREDIT_CARD: typings.mercadopagoSdkJs.bricks.PaymentType.CREDIT_CARD & String = js.native
      
      /* "debit_card" */ val DEBIT_CARD: typings.mercadopagoSdkJs.bricks.PaymentType.DEBIT_CARD & String = js.native
      
      /* "ticket" */ val ICKET: typings.mercadopagoSdkJs.bricks.PaymentType.ICKET & String = js.native
      
      /* "" */ val NONE: typings.mercadopagoSdkJs.bricks.PaymentType.NONE & String = js.native
      
      /* "onboarding_credits" */ val ONBOARDING_CREDITS: typings.mercadopagoSdkJs.bricks.PaymentType.ONBOARDING_CREDITS & String = js.native
      
      /* "wallet_purchase" */ val WALLET_PURCHASE: typings.mercadopagoSdkJs.bricks.PaymentType.WALLET_PURCHASE & String = js.native
    }
    
    @JSGlobal("bricks.WalletButtonAction")
    @js.native
    object WalletButtonAction extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.mercadopagoSdkJs.bricks.WalletButtonAction & String] = js.native
      
      /* "buy" */ val BUY: typings.mercadopagoSdkJs.bricks.WalletButtonAction.BUY & String = js.native
      
      /* "pay" */ val PAY: typings.mercadopagoSdkJs.bricks.WalletButtonAction.PAY & String = js.native
    }
    
    @JSGlobal("bricks.WalletButtonBackground")
    @js.native
    object WalletButtonBackground extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.mercadopagoSdkJs.bricks.WalletButtonBackground & String] = js.native
      
      /* "black" */ val BLACK: typings.mercadopagoSdkJs.bricks.WalletButtonBackground.BLACK & String = js.native
      
      /* "blue" */ val BLUE: typings.mercadopagoSdkJs.bricks.WalletButtonBackground.BLUE & String = js.native
      
      /* "default" */ val MERCADO_PAGO_COLOR: typings.mercadopagoSdkJs.bricks.WalletButtonBackground.MERCADO_PAGO_COLOR & String = js.native
      
      /* "white" */ val WHITE: typings.mercadopagoSdkJs.bricks.WalletButtonBackground.WHITE & String = js.native
    }
    
    @JSGlobal("bricks.WalletButtonRedirectMode")
    @js.native
    object WalletButtonRedirectMode extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.mercadopagoSdkJs.bricks.WalletButtonRedirectMode & String] = js.native
      
      /* "blank" */ val BLANK: typings.mercadopagoSdkJs.bricks.WalletButtonRedirectMode.BLANK & String = js.native
      
      /* "modal" */ val MODAL: typings.mercadopagoSdkJs.bricks.WalletButtonRedirectMode.MODAL & String = js.native
      
      /* "self" */ val SELF: typings.mercadopagoSdkJs.bricks.WalletButtonRedirectMode.SELF & String = js.native
    }
    
    @JSGlobal("bricks.WalletButtonValueProp")
    @js.native
    object WalletButtonValueProp extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.mercadopagoSdkJs.bricks.WalletButtonValueProp & String] = js.native
      
      /* "convenience" */ val CONVENIENCE: typings.mercadopagoSdkJs.bricks.WalletButtonValueProp.CONVENIENCE & String = js.native
      
      /* "practicality" */ val PRACTICALITY: typings.mercadopagoSdkJs.bricks.WalletButtonValueProp.PRACTICALITY & String = js.native
      
      /* "security_details" */ val SECURITY_DETAILS: typings.mercadopagoSdkJs.bricks.WalletButtonValueProp.SECURITY_DETAILS & String = js.native
      
      /* "security_safety" */ val SECURITY_SAFETY: typings.mercadopagoSdkJs.bricks.WalletButtonValueProp.SECURITY_SAFETY & String = js.native
    }
    
    @JSGlobal("bricks.WalletButtonValuePropColor")
    @js.native
    object WalletButtonValuePropColor extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.mercadopagoSdkJs.bricks.WalletButtonValuePropColor & String] = js.native
      
      /* "grey" */ val GREY: typings.mercadopagoSdkJs.bricks.WalletButtonValuePropColor.GREY & String = js.native
      
      /* "white" */ val WHITE: typings.mercadopagoSdkJs.bricks.WalletButtonValuePropColor.WHITE & String = js.native
    }
  }
  
  object mercadopagocore {
    
    @JSGlobal("mercadopagocore.Locale")
    @js.native
    object Locale extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.mercadopagoSdkJs.mercadopagocore.Locale & String] = js.native
      
      /* "en-US" */ val EN_US: typings.mercadopagoSdkJs.mercadopagocore.Locale.EN_US & String = js.native
      
      /* "es-AR" */ val ES_AR: typings.mercadopagoSdkJs.mercadopagocore.Locale.ES_AR & String = js.native
      
      /* "es-CL" */ val ES_CL: typings.mercadopagoSdkJs.mercadopagocore.Locale.ES_CL & String = js.native
      
      /* "es-CO" */ val ES_CO: typings.mercadopagoSdkJs.mercadopagocore.Locale.ES_CO & String = js.native
      
      /* "es-MX" */ val ES_MX: typings.mercadopagoSdkJs.mercadopagocore.Locale.ES_MX & String = js.native
      
      /* "es-PE" */ val ES_PE: typings.mercadopagoSdkJs.mercadopagocore.Locale.ES_PE & String = js.native
      
      /* "es-UY" */ val ES_UY: typings.mercadopagoSdkJs.mercadopagocore.Locale.ES_UY & String = js.native
      
      /* "es-VE" */ val ES_VE: typings.mercadopagoSdkJs.mercadopagocore.Locale.ES_VE & String = js.native
      
      /* "pt-BR" */ val PT_BR: typings.mercadopagoSdkJs.mercadopagocore.Locale.PT_BR & String = js.native
    }
  }
}
