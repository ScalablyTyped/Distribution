package typings.oracleOraclejet.ojmessagesMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AriaLiveRegion
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojmessageMod.ojMessage.DisplayOptions
import typings.oracleOraclejet.ojmessageMod.ojMessage.Message
import typings.oracleOraclejet.ojmessagesMod.ojMessages.Position
import typings.oracleOraclejet.oracleOraclejetStrings.general
import typings.oracleOraclejet.oracleOraclejetStrings.notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmessages.ojMessagesSettableProperties> */
@js.native
trait ojMessagesSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var display: js.UndefOr[general | notification] = js.native
  
  var displayOptions: js.UndefOr[DisplayOptions] = js.native
  
  var messages: js.UndefOr[js.Array[Message] | Null | (DataProvider[_, Message])] = js.native
  
  var position: js.UndefOr[Position | Null] = js.native
  
  var translations: js.UndefOr[AriaLiveRegion] = js.native
}
object ojMessagesSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojMessagesSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojMessagesSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojMessagesSettablePropertiesLenientOps[Self <: ojMessagesSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    def setDisplay(value: general | notification): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDisplayOptions(value: DisplayOptions): Self = this.set("displayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayOptions: Self = this.set("displayOptions", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[Message] | (DataProvider[_, Message])): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMessagesNull: Self = this.set("messages", null)
    
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
    
    @scala.inline
    def setTranslations(value: AriaLiveRegion): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
}
