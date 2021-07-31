package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultLocation
  extends StObject
     with InlineQueryResultLocationBase
     with InlineQueryResult {
  
  var `type`: location
}
object InlineQueryResultLocation {
  
  @scala.inline
  def apply(id: String, latitude: Double, longitude: Double, title: String): InlineQueryResultLocation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("location")
    __obj.asInstanceOf[InlineQueryResultLocation]
  }
  
  @scala.inline
  implicit class InlineQueryResultLocationMutableBuilder[Self <: InlineQueryResultLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: location): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
