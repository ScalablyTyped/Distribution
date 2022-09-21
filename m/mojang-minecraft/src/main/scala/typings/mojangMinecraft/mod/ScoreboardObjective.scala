package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ScoreboardObjective")
@js.native
/* protected */ open class ScoreboardObjective () extends StObject {
  
  /**
    * Returns the player-visible name of this scoreboard
    * objective.
    * @throws This property can throw when used.
    */
  val displayName: String = js.native
  
  /**
    * @remarks
    * Returns all objective participant identities.
    * @throws This function can throw errors.
    */
  def getParticipants(): js.Array[ScoreboardIdentity] = js.native
  
  /**
    * @remarks
    * Returns a specific score for a participant.
    * @param participant
    * @throws This function can throw errors.
    */
  def getScore(participant: ScoreboardIdentity): Double = js.native
  
  /**
    * @remarks
    * Returns specific scores for this objective for all
    * participants.
    * @throws This function can throw errors.
    */
  def getScores(): js.Array[ScoreboardScoreInfo] = js.native
  
  /**
    * Identifier of the scoreboard objective.
    * @throws This property can throw when used.
    */
  val id: String = js.native
}
