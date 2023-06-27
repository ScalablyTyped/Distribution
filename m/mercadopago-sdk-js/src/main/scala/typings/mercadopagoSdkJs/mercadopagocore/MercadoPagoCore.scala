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

@js.native
trait MercadoPagoCore extends StObject {
  
  def bricks(): Bricks = js.native
  def bricks(style: BricksStyle): Bricks = js.native
  
  def cardForm(options: CardFormOptions): CardForm = js.native
  
  def createCardToken(cardTokenParams: CardTokenParams): js.Promise[CardTokenResponse] = js.native
  
  var fields: Fields = js.native
  
  def getIdentificationTypes(): js.Promise[js.Array[IdentificationTypesResponse]] = js.native
  
  def getInstallments(installmentsParams: InstallmentsParams): js.Promise[js.Array[InstallmentsResponse]] = js.native
  
  def getIssuers(issuersParams: IssuersParams): js.Promise[js.Array[IssuersResponse]] = js.native
  
  def getPaymentMethods(paymentMethodsParams: PaymentMethodsParams): js.Promise[PaymentMethodsResponse] = js.native
  
  def updateCardToken(CardTokenUpdateParams: CardTokenUpdateParams): js.Promise[CardTokenResponse] = js.native
}
