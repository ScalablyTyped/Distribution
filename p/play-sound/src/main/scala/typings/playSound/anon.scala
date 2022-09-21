package typings.playSound

import typings.playSound.mod.Players
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<play-sound.play-sound.PlayOpts> */
  trait PartialPlayOpts extends StObject {
    
    var player: js.UndefOr[Players] = js.undefined
    
    var players: js.UndefOr[js.Array[Players]] = js.undefined
  }
  object PartialPlayOpts {
    
    inline def apply(): PartialPlayOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPlayOpts]
    }
    
    extension [Self <: PartialPlayOpts](x: Self) {
      
      inline def setPlayer(value: Players): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
      
      inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
      
      inline def setPlayers(value: js.Array[Players]): Self = StObject.set(x, "players", value.asInstanceOf[js.Any])
      
      inline def setPlayersUndefined: Self = StObject.set(x, "players", js.undefined)
      
      inline def setPlayersVarargs(value: Players*): Self = StObject.set(x, "players", js.Array(value*))
    }
  }
}
