package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityNavigationWalkComponent")
@js.native
/* protected */ open class EntityNavigationWalkComponent () extends IEntityComponent {
  
  /**
    * Tells the pathfinder to avoid blocks that cause damage when
    * finding a path.
    * @throws This property can throw when used.
    */
  val avoidDamageBlocks: Boolean = js.native
  
  /**
    * Tells the pathfinder to avoid portals (like nether portals)
    * when finding a path.
    * @throws This property can throw when used.
    */
  val avoidPortals: Boolean = js.native
  
  /**
    * Whether or not the pathfinder should avoid tiles that are
    * exposed to the sun when creating paths.
    * @throws This property can throw when used.
    */
  val avoidSun: Boolean = js.native
  
  /**
    * Tells the pathfinder to avoid water when creating a path.
    * @throws This property can throw when used.
    */
  val avoidWater: Boolean = js.native
  
  /**
    * Tells the pathfinder whether or not it can jump out of water
    * (like a dolphin).
    * @throws This property can throw when used.
    */
  val canBreach: Boolean = js.native
  
  /**
    * Tells the pathfinder that it can path through a closed door
    * and break it.
    * @throws This property can throw when used.
    */
  val canBreakDoors: Boolean = js.native
  
  /**
    * Tells the pathfinder whether or not it can float.
    * @throws This property can throw when used.
    */
  val canFloat: Boolean = js.native
  
  /**
    * Tells the pathfinder whether or not it can jump up blocks.
    * @throws This property can throw when used.
    */
  val canJump: Boolean = js.native
  
  /**
    * Tells the pathfinder that it can path through a closed door
    * assuming the AI will open the door.
    * @throws This property can throw when used.
    */
  val canOpenDoors: Boolean = js.native
  
  /**
    * Tells the pathfinder that it can path through a closed iron
    * door assuming the AI will open the door.
    * @throws This property can throw when used.
    */
  val canOpenIronDoors: Boolean = js.native
  
  /**
    * Whether a path can be created through a door.
    * @throws This property can throw when used.
    */
  val canPassDoors: Boolean = js.native
  
  /**
    * Tells the pathfinder that it can start pathing when in the
    * air.
    * @throws This property can throw when used.
    */
  val canPathFromAir: Boolean = js.native
  
  /**
    * Tells the pathfinder whether or not it can travel on the
    * surface of the lava.
    * @throws This property can throw when used.
    */
  val canPathOverLava: Boolean = js.native
  
  /**
    * Tells the pathfinder whether or not it can travel on the
    * surface of the water.
    * @throws This property can throw when used.
    */
  val canPathOverWater: Boolean = js.native
  
  /**
    * Tells the pathfinder whether or not it will be pulled down
    * by gravity while in water.
    * @throws This property can throw when used.
    */
  val canSink: Boolean = js.native
  
  /**
    * Tells the pathfinder whether or not it can path anywhere
    * through water and plays swimming animation along that path.
    * @throws This property can throw when used.
    */
  val canSwim: Boolean = js.native
  
  /**
    * Tells the pathfinder whether or not it can walk on the
    * ground outside water.
    * @throws This property can throw when used.
    */
  val canWalk: Boolean = js.native
  
  /**
    * Tells the pathfinder whether or not it can travel in lava
    * like walking on ground.
    * @throws This property can throw when used.
    */
  val canWalkInLava: Boolean = js.native
  
  /**
    * Tells the pathfinder whether or not it can walk on the
    * ground or go underwater.
    * @throws This property can throw when used.
    */
  val isAmphibious: Boolean = js.native
}
/* static members */
object EntityNavigationWalkComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:navigation.swim.
    */
  @JSImport("mojang-minecraft", "EntityNavigationWalkComponent.id")
  @js.native
  val id: /* "minecraft:navigation.walk" */ String = js.native
}
