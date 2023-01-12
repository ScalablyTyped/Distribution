package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.libComponentsHoverCardHoverCardDottypesMod.HoverCardType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardDismissDelay extends StObject {
  
  var cardDismissDelay: Double
  
  var cardOpenDelay: Double
  
  var expandedCardOpenDelay: Double
  
  var instantOpenOnClick: Boolean
  
  var openHotKey: Double
  
  var setInitialFocus: Boolean
  
  var `type`: HoverCardType
}
object CardDismissDelay {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: CardDismissDelay] (val x: Self) extends AnyVal {
    
    inline def setCardDismissDelay(value: Double): Self = StObject.set(x, "cardDismissDelay", value.asInstanceOf[js.Any])
    
    inline def setCardOpenDelay(value: Double): Self = StObject.set(x, "cardOpenDelay", value.asInstanceOf[js.Any])
    
    inline def setExpandedCardOpenDelay(value: Double): Self = StObject.set(x, "expandedCardOpenDelay", value.asInstanceOf[js.Any])
    
    inline def setInstantOpenOnClick(value: Boolean): Self = StObject.set(x, "instantOpenOnClick", value.asInstanceOf[js.Any])
    
    inline def setOpenHotKey(value: Double): Self = StObject.set(x, "openHotKey", value.asInstanceOf[js.Any])
    
    inline def setSetInitialFocus(value: Boolean): Self = StObject.set(x, "setInitialFocus", value.asInstanceOf[js.Any])
    
    inline def setType(value: HoverCardType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
