package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityRideableComponent")
@js.native
/* protected */ open class EntityRideableComponent () extends IEntityComponent {
  
  /**
    * @remarks
    * Adds an entity to this entity as a rider.
    * @param rider
    * Entity that will become the rider of this entity.
    * @returns
    * True if the rider entity was successfully added.
    * @throws This function can throw errors.
    */
  def addRider(rider: Entity): Boolean = js.native
  
  /**
    * Zero-based index of the seat that can used to control this
    * entity.
    * @throws This property can throw when used.
    */
  val controllingSeat: Double = js.native
  
  /**
    * Determines whether interactions are not supported if the
    * entity is crouching.
    * @throws This property can throw when used.
    */
  val crouchingSkipInteract: Boolean = js.native
  
  /**
    * @remarks
    * Ejects the specified rider of this entity.
    * @param rider
    * Entity that should be ejected from this entity.
    * @throws This function can throw errors.
    */
  def ejectRider(rider: Entity): Unit = js.native
  
  /**
    * @remarks
    * Ejects all riders of this entity.
    * @throws This function can throw errors.
    */
  def ejectRiders(): Unit = js.native
  
  /**
    * A string-list of entity types that this entity can support
    * as riders.
    * @throws This property can throw when used.
    */
  val familyTypes: js.Array[String] = js.native
  
  /**
    * Set of text that should be displayed when a player is
    * looking to ride on this entity (commonly with touch-screen
    * controls).
    * @throws This property can throw when used.
    */
  val interactText: String = js.native
  
  /**
    * If true, this entity will pull in entities that are in the
    * correct family_types into any available seat.
    * @throws This property can throw when used.
    */
  val pullInEntities: Boolean = js.native
  
  /**
    * If true, this entity will be picked when looked at by the
    * rider.
    * @throws This property can throw when used.
    */
  val riderCanInteract: Boolean = js.native
  
  /**
    * Number of seats for riders defined for this entity.
    * @throws This property can throw when used.
    */
  val seatCount: Double = js.native
  
  /**
    * The list of positions and number of riders for each position
    * for entities riding this entity.
    * @throws This property can throw when used.
    */
  val seats: js.Array[Seat] = js.native
}
/* static members */
object EntityRideableComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:rideable.
    */
  @JSImport("mojang-minecraft", "EntityRideableComponent.id")
  @js.native
  val id: /* "minecraft:rideable" */ String = js.native
}
