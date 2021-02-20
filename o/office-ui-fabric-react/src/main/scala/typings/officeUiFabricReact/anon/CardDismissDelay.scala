package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.hoverCardTypesMod.HoverCardType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardDismissDelay extends StObject {
  
  var cardDismissDelay: Double = js.native
  
  var cardOpenDelay: Double = js.native
  
  var expandedCardOpenDelay: Double = js.native
  
  var instantOpenOnClick: Boolean = js.native
  
  var openHotKey: Double = js.native
  
  var setInitialFocus: Boolean = js.native
  
  var `type`: HoverCardType = js.native
}
object CardDismissDelay {
  
  @scala.inline
  def apply(
    cardDismissDelay: Double,
    cardOpenDelay: Double,
    expandedCardOpenDelay: Double,
    instantOpenOnClick: Boolean,
    openHotKey: Double,
    setInitialFocus: Boolean,
    `type`: HoverCardType
  ): CardDismissDelay = {
    val __obj = js.Dynamic.literal(cardDismissDelay = cardDismissDelay.asInstanceOf[js.Any], cardOpenDelay = cardOpenDelay.asInstanceOf[js.Any], expandedCardOpenDelay = expandedCardOpenDelay.asInstanceOf[js.Any], instantOpenOnClick = instantOpenOnClick.asInstanceOf[js.Any], openHotKey = openHotKey.asInstanceOf[js.Any], setInitialFocus = setInitialFocus.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardDismissDelay]
  }
  
  @scala.inline
  implicit class CardDismissDelayMutableBuilder[Self <: CardDismissDelay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardDismissDelay(value: Double): Self = StObject.set(x, "cardDismissDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardOpenDelay(value: Double): Self = StObject.set(x, "cardOpenDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedCardOpenDelay(value: Double): Self = StObject.set(x, "expandedCardOpenDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstantOpenOnClick(value: Boolean): Self = StObject.set(x, "instantOpenOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenHotKey(value: Double): Self = StObject.set(x, "openHotKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetInitialFocus(value: Boolean): Self = StObject.set(x, "setInitialFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: HoverCardType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
