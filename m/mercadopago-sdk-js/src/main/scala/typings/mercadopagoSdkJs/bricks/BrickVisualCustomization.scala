package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrickVisualCustomization extends StObject {
  
  var borderRadius: js.UndefOr[String] = js.undefined
  
  var buttonBackground: js.UndefOr[WalletButtonBackground] = js.undefined
  
  var buttonHeight: js.UndefOr[String] = js.undefined
  
  var defaultPaymentOption: js.UndefOr[PaymentOptions] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var hideFormTitle: js.UndefOr[Boolean] = js.undefined
  
  var hideNewCardForm: js.UndefOr[Boolean] = js.undefined
  
  var hidePaymentButton: js.UndefOr[Boolean] = js.undefined
  
  var hideRedirectionPanel: js.UndefOr[Boolean] = js.undefined
  
  var hideStatusDetails: js.UndefOr[Boolean] = js.undefined
  
  var hideTransactionDate: js.UndefOr[Boolean] = js.undefined
  
  var hideValueProp: js.UndefOr[Boolean] = js.undefined
  
  var hideValuePropsFrom: js.UndefOr[PaymentOptionsBooleanOnly] = js.undefined
  
  var horizontalPadding: js.UndefOr[String] = js.undefined
  
  var preserveSavedCardsOrder: js.UndefOr[Boolean] = js.undefined
  
  var showExternalReference: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[BricksStyle] = js.undefined
  
  var texts: js.UndefOr[CustomizableTexts] = js.undefined
  
  var valuePropColor: js.UndefOr[WalletButtonValuePropColor] = js.undefined
  
  var verticalPadding: js.UndefOr[String] = js.undefined
}
object BrickVisualCustomization {
  
  inline def apply(): BrickVisualCustomization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrickVisualCustomization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrickVisualCustomization] (val x: Self) extends AnyVal {
    
    inline def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setButtonBackground(value: WalletButtonBackground): Self = StObject.set(x, "buttonBackground", value.asInstanceOf[js.Any])
    
    inline def setButtonBackgroundUndefined: Self = StObject.set(x, "buttonBackground", js.undefined)
    
    inline def setButtonHeight(value: String): Self = StObject.set(x, "buttonHeight", value.asInstanceOf[js.Any])
    
    inline def setButtonHeightUndefined: Self = StObject.set(x, "buttonHeight", js.undefined)
    
    inline def setDefaultPaymentOption(value: PaymentOptions): Self = StObject.set(x, "defaultPaymentOption", value.asInstanceOf[js.Any])
    
    inline def setDefaultPaymentOptionUndefined: Self = StObject.set(x, "defaultPaymentOption", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHideFormTitle(value: Boolean): Self = StObject.set(x, "hideFormTitle", value.asInstanceOf[js.Any])
    
    inline def setHideFormTitleUndefined: Self = StObject.set(x, "hideFormTitle", js.undefined)
    
    inline def setHideNewCardForm(value: Boolean): Self = StObject.set(x, "hideNewCardForm", value.asInstanceOf[js.Any])
    
    inline def setHideNewCardFormUndefined: Self = StObject.set(x, "hideNewCardForm", js.undefined)
    
    inline def setHidePaymentButton(value: Boolean): Self = StObject.set(x, "hidePaymentButton", value.asInstanceOf[js.Any])
    
    inline def setHidePaymentButtonUndefined: Self = StObject.set(x, "hidePaymentButton", js.undefined)
    
    inline def setHideRedirectionPanel(value: Boolean): Self = StObject.set(x, "hideRedirectionPanel", value.asInstanceOf[js.Any])
    
    inline def setHideRedirectionPanelUndefined: Self = StObject.set(x, "hideRedirectionPanel", js.undefined)
    
    inline def setHideStatusDetails(value: Boolean): Self = StObject.set(x, "hideStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setHideStatusDetailsUndefined: Self = StObject.set(x, "hideStatusDetails", js.undefined)
    
    inline def setHideTransactionDate(value: Boolean): Self = StObject.set(x, "hideTransactionDate", value.asInstanceOf[js.Any])
    
    inline def setHideTransactionDateUndefined: Self = StObject.set(x, "hideTransactionDate", js.undefined)
    
    inline def setHideValueProp(value: Boolean): Self = StObject.set(x, "hideValueProp", value.asInstanceOf[js.Any])
    
    inline def setHideValuePropUndefined: Self = StObject.set(x, "hideValueProp", js.undefined)
    
    inline def setHideValuePropsFrom(value: PaymentOptionsBooleanOnly): Self = StObject.set(x, "hideValuePropsFrom", value.asInstanceOf[js.Any])
    
    inline def setHideValuePropsFromUndefined: Self = StObject.set(x, "hideValuePropsFrom", js.undefined)
    
    inline def setHorizontalPadding(value: String): Self = StObject.set(x, "horizontalPadding", value.asInstanceOf[js.Any])
    
    inline def setHorizontalPaddingUndefined: Self = StObject.set(x, "horizontalPadding", js.undefined)
    
    inline def setPreserveSavedCardsOrder(value: Boolean): Self = StObject.set(x, "preserveSavedCardsOrder", value.asInstanceOf[js.Any])
    
    inline def setPreserveSavedCardsOrderUndefined: Self = StObject.set(x, "preserveSavedCardsOrder", js.undefined)
    
    inline def setShowExternalReference(value: Boolean): Self = StObject.set(x, "showExternalReference", value.asInstanceOf[js.Any])
    
    inline def setShowExternalReferenceUndefined: Self = StObject.set(x, "showExternalReference", js.undefined)
    
    inline def setStyle(value: BricksStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTexts(value: CustomizableTexts): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setValuePropColor(value: WalletButtonValuePropColor): Self = StObject.set(x, "valuePropColor", value.asInstanceOf[js.Any])
    
    inline def setValuePropColorUndefined: Self = StObject.set(x, "valuePropColor", js.undefined)
    
    inline def setVerticalPadding(value: String): Self = StObject.set(x, "verticalPadding", value.asInstanceOf[js.Any])
    
    inline def setVerticalPaddingUndefined: Self = StObject.set(x, "verticalPadding", js.undefined)
  }
}
