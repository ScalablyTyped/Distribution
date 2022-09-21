package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Events")
@js.native
/* protected */ open class Events () extends StObject {
  
  /**
    * This event fires before a chat message is broadcast or
    * delivered. The event can be canceled, and the message can
    * also be updated.
    */
  val beforeChat: BeforeChatEventSignal = js.native
  
  /**
    * This event is fired before the triggering of an entity event
    * that updates the component definition state of an entity.
    * Within this event, you can cancel or shape the impacted
    * components and event triggers.
    */
  val beforeDataDrivenEntityTriggerEvent: BeforeDataDrivenEntityTriggerEventSignal = js.native
  
  /**
    * This event is fired before an explosion occurs.
    */
  val beforeExplosion: BeforeExplosionEventSignal = js.native
  
  /**
    * For custom items, this event is triggered before the set of
    * defined components for the item change in response to a
    * triggered event. Note that this event is only fired for
    * custom data-driven items.
    */
  val beforeItemDefinitionEvent: BeforeItemDefinitionEventSignal = js.native
  
  /**
    * This event fires before an item is used by an entity or
    * player.
    */
  val beforeItemUse: BeforeItemUseEventSignal = js.native
  
  /**
    * This event fires before an item is used on a block by an
    * entity or player.
    */
  val beforeItemUseOn: BeforeItemUseOnEventSignal = js.native
  
  /**
    * Fires before a piston is activated.
    */
  val beforePistonActivate: BeforePistonActivateEventSignal = js.native
  
  /**
    * This event fires for a block that is broken by a player.
    */
  val blockBreak: BlockBreakEventSignal = js.native
  
  /**
    * This event fires for each BlockLocation destroyed by an
    * explosion. It is fired after the blocks have already been
    * destroyed.
    */
  val blockExplode: BlockExplodeEventSignal = js.native
  
  /**
    * This event fires for a block that is placed by a player.
    */
  val blockPlace: BlockPlaceEventSignal = js.native
  
  /**
    * This event fires when a button is pushed.
    */
  val buttonPush: ButtonPushEventSignal = js.native
  
  /**
    * This event is triggered after a chat message has been
    * broadcast or sent to players.
    */
  val chat: ChatEventSignal = js.native
  
  /**
    * This event is fired when an entity event has been triggered
    * that will update the component definition state of an
    * entity.
    */
  val dataDrivenEntityTriggerEvent: DataDrivenEntityTriggerEventSignal = js.native
  
  /**
    * This event fires when an effect, like poisoning, is added to
    * an entity.
    */
  val effectAdd: EffectAddEventSignal = js.native
  
  /**
    * This event fires when a new entity is created.
    */
  val entityCreate: EntityCreateEventSignal = js.native
  
  /**
    * This event fires when an entity hits (makes a melee attack)
    * and potentially impacts another entity or block.
    */
  val entityHit: EntityHitEventSignal = js.native
  
  /**
    * This event fires when an entity is hurt (takes damage).
    */
  val entityHurt: EntityHurtEventSignal = js.native
  
  /**
    * This event is fired after an explosion occurs.
    */
  val explosion: ExplosionEventSignal = js.native
  
  /**
    * This event fires when a chargeable item completes charging.
    */
  val itemCompleteCharge: ItemCompleteChargeEventSignal = js.native
  
  /**
    * For custom items, this event is triggered when the
    * fundamental set of defined components for the item change.
    * Note that this event is only fired for custom data-driven
    * items.
    */
  val itemDefinitionEvent: ItemDefinitionEventSignal = js.native
  
  /**
    * This event fires when a chargeable item is released from
    * charging.
    */
  val itemReleaseCharge: ItemReleaseChargeEventSignal = js.native
  
  /**
    * This event fires when a chargeable item starts charging.
    */
  val itemStartCharge: ItemStartChargeEventSignal = js.native
  
  /**
    * This event fires when any particular item is starting to be
    * used by an entity or player.
    */
  val itemStartUseOn: ItemStartUseOnEventSignal = js.native
  
  /**
    * This event fires when a chargeable item stops charging.
    */
  val itemStopCharge: ItemStopChargeEventSignal = js.native
  
  /**
    * This event fires when any particular item is ending being
    * used by an entity or player.
    */
  val itemStopUseOn: ItemStopUseOnEventSignal = js.native
  
  /**
    * This event fires when any particular item is used by an
    * entity or player.
    */
  val itemUse: ItemUseEventSignal = js.native
  
  /**
    * This event fires when any particular item is used on a block
    * by an entity or player.
    */
  val itemUseOn: ItemUseOnEventSignal = js.native
  
  /**
    * This event fires when a lever activates or is deactivated.
    */
  val leverActivate: LeverActionEventSignal = js.native
  
  /**
    * This event fires when a piston expands or retracts.
    */
  val pistonActivate: PistonActivateEventSignal = js.native
  
  /**
    * This event fires when a player joins a world.
    */
  val playerJoin: PlayerJoinEventSignal = js.native
  
  /**
    * This event fires when a player leaves a world.
    */
  val playerLeave: PlayerLeaveEventSignal = js.native
  
  /**
    * This event fires when a projectile hits an entity or block.
    */
  var projectileHit: ProjectileHitEventSignal = js.native
  
  /**
    * This event fires every tick - which is 20 times per second.
    */
  val tick: TickEventSignal = js.native
  
  /**
    * This event will be triggered when the weather changes within
    * Minecraft.
    */
  val weatherChange: WeatherChangeEventSignal = js.native
  
  /**
    * This event fires when the script environment is initialized
    * on a World. In addition, you can register dynamic properties
    * within the scope of a world Initialize event.
    */
  val worldInitialize: WorldInitializeEventSignal = js.native
}
