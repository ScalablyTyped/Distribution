package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScoreboardIdentityType extends StObject
@JSImport("mojang-minecraft", "ScoreboardIdentityType")
@js.native
object ScoreboardIdentityType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ScoreboardIdentityType & String] = js.native
  
  /**
    * This scoreboard participant is tied to an entity.
    */
  @js.native
  sealed trait entity
    extends StObject
       with ScoreboardIdentityType
  /* "entity" */ val entity: typings.mojangMinecraft.mod.ScoreboardIdentityType.entity & String = js.native
  
  /**
    * This scoreboard participant is tied to a pseudo player
    * entity - typically this is used to store scores as data or
    * as abstract progress.
    */
  @js.native
  sealed trait fakePlayer
    extends StObject
       with ScoreboardIdentityType
  /* "fakePlayer" */ val fakePlayer: typings.mojangMinecraft.mod.ScoreboardIdentityType.fakePlayer & String = js.native
  
  /**
    * This scoreboard participant is tied to a player.
    */
  @js.native
  sealed trait player
    extends StObject
       with ScoreboardIdentityType
  /* "player" */ val player: typings.mojangMinecraft.mod.ScoreboardIdentityType.player & String = js.native
}
