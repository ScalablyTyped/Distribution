package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ScoreboardObjectiveDisplayOptions")
@js.native
open class ScoreboardObjectiveDisplayOptions protected () extends StObject {
  def this(objective: ScoreboardObjective) = this()
  def this(objective: ScoreboardObjective, sortOrder: ObjectiveSortOrder) = this()
  
  /**
    * Objective to be displayed.
    */
  val objective: ScoreboardObjective = js.native
  
  /**
    * The sort order to display the objective items within.
    */
  val sortOrder: ObjectiveSortOrder = js.native
}
