package typings.oversmash

import typings.oversmash.mod.CallerOptions
import typings.oversmash.mod.Player
import typings.oversmash.mod.PlayerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Options extends js.Object {
    
    val options: CallerOptions = js.native
    
    def player(name: String): js.Promise[Player] = js.native
    def player(name: String, platfortm: String): js.Promise[Player] = js.native
    
    def playerStats(name: String): js.Promise[PlayerStats] = js.native
    def playerStats(name: String, platform: String): js.Promise[PlayerStats] = js.native
  }
}
