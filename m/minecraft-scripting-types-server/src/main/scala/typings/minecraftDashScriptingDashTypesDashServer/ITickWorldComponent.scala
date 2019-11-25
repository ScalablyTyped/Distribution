package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.IEntityTickingArea
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
  var distance_to_players: Double
  /**
    * Whether or not this ticking area will despawn when a player is out of range
    */
  var never_despawn: Boolean
  /**
    * The radius in chunks of the ticking area
    */
  var radius: Double
  /**
    * The ticking area entity that is attached to this entity
    */
  var ticking_area: IEntityTickingArea
}

object ITickWorldComponent {
  @scala.inline
  def apply(
    distance_to_players: Double,
    never_despawn: Boolean,
    radius: Double,
    ticking_area: IEntityTickingArea
  ): ITickWorldComponent = {
    val __obj = js.Dynamic.literal(distance_to_players = distance_to_players.asInstanceOf[js.Any], never_despawn = never_despawn.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], ticking_area = ticking_area.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITickWorldComponent]
  }
}

