package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.error
import typings.oracleOraclejet.oracleOraclejetStrings.fatal
import typings.oracleOraclejet.oracleOraclejetStrings.info
import typings.oracleOraclejet.oracleOraclejetStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageType extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var messageType: js.UndefOr[info | error | fatal | warning] = js.native
  
  var visited: js.UndefOr[Boolean] = js.native
}
object MessageType {
  
  @scala.inline
  def apply(): MessageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageType]
  }
  
  @scala.inline
  implicit class MessageTypeMutableBuilder[Self <: MessageType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMessageType(value: info | error | fatal | warning): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    @scala.inline
    def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
  }
}
