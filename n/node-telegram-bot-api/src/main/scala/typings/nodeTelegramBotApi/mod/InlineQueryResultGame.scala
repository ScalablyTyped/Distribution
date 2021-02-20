package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.game
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultGame
  extends InlineQueryResultBase
     with InlineQueryResult {
  
  var game_short_name: String = js.native
  
  var `type`: game = js.native
}
object InlineQueryResultGame {
  
  @scala.inline
  def apply(game_short_name: String, id: String, `type`: game): InlineQueryResultGame = {
    val __obj = js.Dynamic.literal(game_short_name = game_short_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultGame]
  }
  
  @scala.inline
  implicit class InlineQueryResultGameMutableBuilder[Self <: InlineQueryResultGame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGame_short_name(value: String): Self = StObject.set(x, "game_short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: game): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
