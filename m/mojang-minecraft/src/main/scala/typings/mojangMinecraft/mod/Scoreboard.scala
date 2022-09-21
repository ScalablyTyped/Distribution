package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Scoreboard")
@js.native
/* protected */ open class Scoreboard () extends StObject {
  
  /**
    * @remarks
    * Adds a new objective to the scoreboard.
    * @param objectiveId
    * @param displayName
    * @throws This function can throw errors.
    */
  def addObjective(objectiveId: String, displayName: String): ScoreboardObjective = js.native
  
  /**
    * @remarks
    * Clears the objective that occupies a display slot.
    * @param displaySlotId
    * @throws This function can throw errors.
    */
  def clearObjectiveAtDisplaySlot(displaySlotId: String): ScoreboardObjective = js.native
  
  /**
    * @remarks
    * Returns a specific objective (by id).
    * @param objectiveId
    * @throws This function can throw errors.
    */
  def getObjective(objectiveId: String): ScoreboardObjective = js.native
  
  /**
    * @remarks
    * Returns an objective that occupies the specified display
    * slot.
    * @param displaySlotId
    * @throws This function can throw errors.
    */
  def getObjectiveAtDisplaySlot(displaySlotId: String): ScoreboardObjectiveDisplayOptions = js.native
  
  /**
    * @remarks
    * Returns all defined objectives.
    * @throws This function can throw errors.
    */
  def getObjectives(): js.Array[ScoreboardObjective] = js.native
  
  /**
    * @remarks
    * Returns all defined scoreboard identities.
    * @throws This function can throw errors.
    */
  def getParticipants(): js.Array[ScoreboardIdentity] = js.native
  
  def removeObjective(objectiveId: String): Boolean = js.native
  /**
    * @remarks
    * Removes an objective from the scoreboard.
    * @param objectiveId
    * @throws This function can throw errors.
    */
  def removeObjective(objectiveId: ScoreboardObjective): Boolean = js.native
  
  /**
    * @remarks
    * Sets an objective into a display slot with specified
    * additional display settings.
    * @param displaySlotId
    * @param objectiveDisplaySetting
    * @throws This function can throw errors.
    */
  def setObjectiveAtDisplaySlot(displaySlotId: String, objectiveDisplaySetting: ScoreboardObjectiveDisplayOptions): ScoreboardObjective = js.native
}
