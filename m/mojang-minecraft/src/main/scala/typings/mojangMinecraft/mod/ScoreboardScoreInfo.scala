package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ScoreboardScoreInfo")
@js.native
/* protected */ open class ScoreboardScoreInfo () extends StObject {
  
  /**
    * This scoreboard participant for this score.
    */
  val participant: ScoreboardIdentity = js.native
  
  /**
    * Score value of the identity for this objective.
    */
  val score: Double = js.native
}
