package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultLocation
  extends InlineQueryResultLocationBase
     with InlineQueryResult {
  
  var `type`: location = js.native
}
object InlineQueryResultLocation {
  
  @scala.inline
  def apply(id: String, latitude: Double, longitude: Double, title: String, `type`: location): InlineQueryResultLocation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultLocation]
  }
  
  @scala.inline
  implicit class InlineQueryResultLocationMutableBuilder[Self <: InlineQueryResultLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: location): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
