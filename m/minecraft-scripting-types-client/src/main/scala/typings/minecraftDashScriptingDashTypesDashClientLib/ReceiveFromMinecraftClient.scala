package typings
package minecraftDashScriptingDashTypesDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReceiveFromMinecraftClient extends js.Object

/**
  * (Client-side) Events that can be received from Minecraft
  */
@JSGlobal("ReceiveFromMinecraftClient")
@js.native
object ReceiveFromMinecraftClient extends js.Object {
  /**
    * This event is fired whenever a player joins the world. The event data contains the player entity object.
    */
  @js.native
  sealed trait ClientEnteredWorld
    extends minecraftDashScriptingDashTypesDashClientLib.ReceiveFromMinecraftClient
  
  /**
    * This event is triggered whenever the reticle changes from pointing at a block or air to pointing at an entity and the other way around. Up to 1000 blocks away.
    */
  @js.native
  sealed trait HitResultChanged
    extends minecraftDashScriptingDashTypesDashClientLib.ReceiveFromMinecraftClient
  
  /**
    * This event is triggered every update and tells you what entity the reticle is pointing to in the world up to 1000 blocks away.
    */
  @js.native
  sealed trait HitResultContinuous
    extends minecraftDashScriptingDashTypesDashClientLib.ReceiveFromMinecraftClient
  
  /**
    * This event is triggered whenever the mouse pointer changes from pointing at a block or air to pointing at an entity and the other way around. Up to 1000 blocks away.
    */
  @js.native
  sealed trait PickHitResultChanged
    extends minecraftDashScriptingDashTypesDashClientLib.ReceiveFromMinecraftClient
  
  /**
    * This event is triggered every update and tells you what entity the mouse pointer is pointing to in the world up to 1000 blocks away.
    */
  @js.native
  sealed trait PickHitResultContinuous
    extends minecraftDashScriptingDashTypesDashClientLib.ReceiveFromMinecraftClient
  
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  @js.native
  sealed trait UIEvent
    extends minecraftDashScriptingDashTypesDashClientLib.ReceiveFromMinecraftClient
  
  /* "minecraft:client_entered_world" */ val ClientEnteredWorld: ClientEnteredWorld with java.lang.String = js.native
  /* "minecraft:hit_result_changed" */ val HitResultChanged: HitResultChanged with java.lang.String = js.native
  /* "minecraft:hit_result_continuous" */ val HitResultContinuous: HitResultContinuous with java.lang.String = js.native
  /* "minecraft:pick_hit_result_changed" */ val PickHitResultChanged: PickHitResultChanged with java.lang.String = js.native
  /* "minecraft:pick_hit_result_continuous" */ val PickHitResultContinuous: PickHitResultContinuous with java.lang.String = js.native
  /* "minecraft:ui_event" */ val UIEvent: UIEvent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    minecraftDashScriptingDashTypesDashClientLib.ReceiveFromMinecraftClient with java.lang.String
  ] = js.native
}

