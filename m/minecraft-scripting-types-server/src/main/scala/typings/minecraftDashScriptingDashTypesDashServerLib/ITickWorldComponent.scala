package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The tick world component is a read-only component that allows users to access the ticking areas on entities as well as the ticking area's data.
  */
trait ITickWorldComponent extends js.Object {
  /**
    * distance_to_players
    */
  var distance_to_players: scala.Double
  /**
    * Whether or not this ticking area will despawn when a player is out of range
    */
  var never_despawn: scala.Boolean
  /**
    * The radius in chunks of the ticking area
    */
  var radius: scala.Double
  /**
    * The ticking area entity that is attached to this entity
    */
  var ticking_area: minecraftDashScriptingDashTypesDashSharedLib.IEntityTickingArea
}

object ITickWorldComponent {
  @scala.inline
  def apply(
    distance_to_players: scala.Double,
    never_despawn: scala.Boolean,
    radius: scala.Double,
    ticking_area: minecraftDashScriptingDashTypesDashSharedLib.IEntityTickingArea
  ): ITickWorldComponent = {
    val __obj = js.Dynamic.literal(distance_to_players = distance_to_players, never_despawn = never_despawn, radius = radius, ticking_area = ticking_area)
  
    __obj.asInstanceOf[ITickWorldComponent]
  }
}

