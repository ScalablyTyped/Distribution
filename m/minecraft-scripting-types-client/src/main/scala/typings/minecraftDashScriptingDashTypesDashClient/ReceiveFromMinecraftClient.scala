package typings.minecraftDashScriptingDashTypesDashClient

import typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientStrings.minecraftColonclient_entered_world
import typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientStrings.minecraftColonhit_result_changed
import typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientStrings.minecraftColonhit_result_continuous
import typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientStrings.minecraftColonpick_hit_result_changed
import typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientStrings.minecraftColonpick_hit_result_continuous
import typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientStrings.minecraftColonui_event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * (Client-side) Events that can be received from Minecraft
  */
/* Rewritten from type alias, can be one of: 
  - typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientStrings.minecraftColonclient_entered_world
  - typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientStrings.minecraftColonhit_result_changed
  - typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientStrings.minecraftColonhit_result_continuous
  - typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientStrings.minecraftColonpick_hit_result_changed
  - typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientStrings.minecraftColonpick_hit_result_continuous
  - typings.minecraftDashScriptingDashTypesDashClient.minecraftDashScriptingDashTypesDashClientStrings.minecraftColonui_event
*/
trait ReceiveFromMinecraftClient extends js.Object

object ReceiveFromMinecraftClient {
  /**
    * This event is fired whenever a player joins the world. The event data contains the player entity object.
    */
  @scala.inline
  def ClientEnteredWorld: minecraftColonclient_entered_world = this.cast("minecraft:client_entered_world")
  /**
    * This event is triggered whenever the reticle changes from pointing at a block or air to pointing at an entity and the other way around. Up to 1000 blocks away.
    */
  @scala.inline
  def HitResultChanged: minecraftColonhit_result_changed = this.cast("minecraft:hit_result_changed")
  /**
    * This event is triggered every update and tells you what entity the reticle is pointing to in the world up to 1000 blocks away.
    */
  @scala.inline
  def HitResultContinuous: minecraftColonhit_result_continuous = this.cast("minecraft:hit_result_continuous")
  /**
    * This event is triggered whenever the mouse pointer changes from pointing at a block or air to pointing at an entity and the other way around. Up to 1000 blocks away.
    */
  @scala.inline
  def PickHitResultChanged: minecraftColonpick_hit_result_changed = this.cast("minecraft:pick_hit_result_changed")
  /**
    * This event is triggered every update and tells you what entity the mouse pointer is pointing to in the world up to 1000 blocks away.
    */
  @scala.inline
  def PickHitResultContinuous: minecraftColonpick_hit_result_continuous = this.cast("minecraft:pick_hit_result_continuous")
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  @scala.inline
  def UIEvent: minecraftColonui_event = this.cast("minecraft:ui_event")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

