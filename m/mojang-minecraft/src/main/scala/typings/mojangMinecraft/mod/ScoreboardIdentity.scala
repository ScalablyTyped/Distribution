package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ScoreboardIdentity")
@js.native
/* protected */ open class ScoreboardIdentity () extends StObject {
  
  /**
    * Returns the player-visible name of this identity.
    */
  val displayName: String = js.native
  
  /**
    * @remarks
    * If the scoreboard identity is an entity or player, returns
    * the entity that this scoreboard item corresponds to.
    * @throws This function can throw errors.
    */
  def getEntity(): Entity = js.native
  
  /**
    * Identifier of the scoreboard identity.
    */
  val id: Double = js.native
  
  /**
    * Type of the scoreboard identity.
    */
  val `type`: ScoreboardIdentityType = js.native
}
