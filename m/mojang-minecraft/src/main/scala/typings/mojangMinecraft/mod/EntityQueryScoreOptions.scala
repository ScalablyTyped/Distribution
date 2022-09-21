package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityQueryScoreOptions")
@js.native
open class EntityQueryScoreOptions () extends StObject {
  
  /**
    * If set to true, entities and players within this score range
    * are excluded from query results.
    */
  var exclude: Boolean = js.native
  
  /**
    * If defined, only players that have a score equal to or under
    * maxScore are included.
    */
  var maxScore: Double = js.native
  
  /**
    * If defined, only players that have a score equal to or over
    * minScore are included.
    */
  var minScore: Double = js.native
  
  /**
    * Identifier of the scoreboard objective to filter on.
    */
  var objective: String = js.native
}
