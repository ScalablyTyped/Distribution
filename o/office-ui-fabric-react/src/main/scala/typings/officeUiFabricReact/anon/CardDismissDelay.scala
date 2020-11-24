package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.hoverCardTypesMod.HoverCardType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardDismissDelay extends js.Object {
  
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
  implicit class CardDismissDelayOps[Self <: CardDismissDelay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCardDismissDelay(value: Double): Self = this.set("cardDismissDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardOpenDelay(value: Double): Self = this.set("cardOpenDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedCardOpenDelay(value: Double): Self = this.set("expandedCardOpenDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstantOpenOnClick(value: Boolean): Self = this.set("instantOpenOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenHotKey(value: Double): Self = this.set("openHotKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetInitialFocus(value: Boolean): Self = this.set("setInitialFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: HoverCardType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
