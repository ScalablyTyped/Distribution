package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardButtonPollType extends StObject {
  
  var `type`: PollType
}
object KeyboardButtonPollType {
  
  inline def apply(`type`: PollType): KeyboardButtonPollType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardButtonPollType]
  }
  
  extension [Self <: KeyboardButtonPollType](x: Self) {
    
    inline def setType(value: PollType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
