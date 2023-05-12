package typings.mercadopagoSdkJs.mercadopagocore

import typings.mercadopagoSdkJs.bricks.Bricks
import typings.mercadopagoSdkJs.bricks.BricksStyle
import typings.mercadopagoSdkJs.cardform.CardForm
import typings.mercadopagoSdkJs.cardform.CardFormOptions
import typings.mercadopagoSdkJs.fields.Fields
import typings.mercadopagoSdkJs.shared.CardTokenResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MercadoPagoCore extends StObject {
  
  def bricks(style: BricksStyle): Bricks
  
  def cardForm(options: CardFormOptions): CardForm
  
  def createCardToken(cardTokenParams: CardTokenParams): js.Promise[CardTokenResponse]
  
  var fields: Fields
  
  def getIdentificationTypes(): js.Promise[js.Array[IdentificationTypesResponse]]
  
  def getInstallments(installmentsParams: InstallmentsParams): js.Promise[js.Array[InstallmentsResponse]]
  
  def getIssuers(issuersParams: IssuersParams): js.Promise[js.Array[IssuersResponse]]
  
  def getPaymentMethods(paymentMethodsParams: PaymentMethodsParams): js.Promise[PaymentMethodsResponse]
  
  def updateCardToken(CardTokenUpdateParams: CardTokenUpdateParams): js.Promise[CardTokenResponse]
}
object MercadoPagoCore {
  
  inline def apply(
    bricks: BricksStyle => Bricks,
    cardForm: CardFormOptions => CardForm,
    createCardToken: CardTokenParams => js.Promise[CardTokenResponse],
    fields: Fields,
    getIdentificationTypes: () => js.Promise[js.Array[IdentificationTypesResponse]],
    getInstallments: InstallmentsParams => js.Promise[js.Array[InstallmentsResponse]],
    getIssuers: IssuersParams => js.Promise[js.Array[IssuersResponse]],
    getPaymentMethods: PaymentMethodsParams => js.Promise[PaymentMethodsResponse],
    updateCardToken: CardTokenUpdateParams => js.Promise[CardTokenResponse]
  ): MercadoPagoCore = {
    val __obj = js.Dynamic.literal(bricks = js.Any.fromFunction1(bricks), cardForm = js.Any.fromFunction1(cardForm), createCardToken = js.Any.fromFunction1(createCardToken), fields = fields.asInstanceOf[js.Any], getIdentificationTypes = js.Any.fromFunction0(getIdentificationTypes), getInstallments = js.Any.fromFunction1(getInstallments), getIssuers = js.Any.fromFunction1(getIssuers), getPaymentMethods = js.Any.fromFunction1(getPaymentMethods), updateCardToken = js.Any.fromFunction1(updateCardToken))
    __obj.asInstanceOf[MercadoPagoCore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MercadoPagoCore] (val x: Self) extends AnyVal {
    
    inline def setBricks(value: BricksStyle => Bricks): Self = StObject.set(x, "bricks", js.Any.fromFunction1(value))
    
    inline def setCardForm(value: CardFormOptions => CardForm): Self = StObject.set(x, "cardForm", js.Any.fromFunction1(value))
    
    inline def setCreateCardToken(value: CardTokenParams => js.Promise[CardTokenResponse]): Self = StObject.set(x, "createCardToken", js.Any.fromFunction1(value))
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setGetIdentificationTypes(value: () => js.Promise[js.Array[IdentificationTypesResponse]]): Self = StObject.set(x, "getIdentificationTypes", js.Any.fromFunction0(value))
    
    inline def setGetInstallments(value: InstallmentsParams => js.Promise[js.Array[InstallmentsResponse]]): Self = StObject.set(x, "getInstallments", js.Any.fromFunction1(value))
    
    inline def setGetIssuers(value: IssuersParams => js.Promise[js.Array[IssuersResponse]]): Self = StObject.set(x, "getIssuers", js.Any.fromFunction1(value))
    
    inline def setGetPaymentMethods(value: PaymentMethodsParams => js.Promise[PaymentMethodsResponse]): Self = StObject.set(x, "getPaymentMethods", js.Any.fromFunction1(value))
    
    inline def setUpdateCardToken(value: CardTokenUpdateParams => js.Promise[CardTokenResponse]): Self = StObject.set(x, "updateCardToken", js.Any.fromFunction1(value))
  }
}
