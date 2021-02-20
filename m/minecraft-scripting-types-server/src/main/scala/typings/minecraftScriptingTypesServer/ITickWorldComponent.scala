package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntityTickingArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The tick world component is a read-only component that allows users to access the ticking areas on entities as well as the ticking area's data.
  */
@js.native
trait ITickWorldComponent extends StObject {
  
  /**
    * distance_to_players
    */
  var distance_to_players: Double = js.native
  
  /**
    * Whether or not this ticking area will despawn when a player is out of range
    */
  var never_despawn: Boolean = js.native
  
  /**
    * The radius in chunks of the ticking area
    */
  var radius: Double = js.native
  
  /**
    * The ticking area entity that is attached to this entity
    */
  var ticking_area: IEntityTickingArea = js.native
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
  
  @scala.inline
  implicit class ITickWorldComponentMutableBuilder[Self <: ITickWorldComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance_to_players(value: Double): Self = StObject.set(x, "distance_to_players", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNever_despawn(value: Boolean): Self = StObject.set(x, "never_despawn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicking_area(value: IEntityTickingArea): Self = StObject.set(x, "ticking_area", value.asInstanceOf[js.Any])
  }
}
