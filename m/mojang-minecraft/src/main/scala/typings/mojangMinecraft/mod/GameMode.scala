package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GameMode extends StObject
@JSImport("mojang-minecraft", "GameMode")
@js.native
object GameMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GameMode & String] = js.native
  
  /**
    * World is in a more locked-down experience, where blocks may
    * not be manipulated.
    */
  @js.native
  sealed trait adventure
    extends StObject
       with GameMode
  /* "adventure" */ val adventure: typings.mojangMinecraft.mod.GameMode.adventure & String = js.native
  
  /**
    * World is in a full creative mode. In creative mode, the
    * player has all the resources available in the item selection
    * tabs and the survival selection tab. They can also destroy
    * blocks instantly including those which would normally be
    * indestructible. Command and structure blocks can also be
    * used in creative mode. Items also do not lose durability or
    * disappear.
    */
  @js.native
  sealed trait creative
    extends StObject
       with GameMode
  /* "creative" */ val creative: typings.mojangMinecraft.mod.GameMode.creative & String = js.native
  
  /**
    * World is in a survival mode, where players can take damage
    * and entities may not be peaceful. Survival mode is where the
    * player must collect resources, build structures while
    * surviving in their generated world. Activities can, over
    * time, chip away at player health and hunger bar.
    */
  @js.native
  sealed trait survival
    extends StObject
       with GameMode
  /* "survival" */ val survival: typings.mojangMinecraft.mod.GameMode.survival & String = js.native
}
