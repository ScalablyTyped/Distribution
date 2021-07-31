package typings.minecraftScriptingTypesServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type IArmorContainerComponent = js.Array[typings.minecraftScriptingTypesShared.IItemStack]

/**
  * This component represents the contents of an entity's hands. The component contains an array of ItemStack JS API Objects representing each slot in the hand container. NOTE: Currently items and containers are read-only. Slot 0 is main-hand Slot 1 is off-hand.
  */
type IHandContainerComponent = js.Array[typings.minecraftScriptingTypesShared.IItemStack]

/**
  * This component represents the hotbar contents of a player. The component contains an array of ItemStack JS API Objects representing each slot in the hotbar. NOTE: Currently items and containers are read-only. Slots are ordered left to right.
  */
type IHotbarContainerComponent = js.Array[typings.minecraftScriptingTypesShared.IItemStack]

/**
  * This component represents the inventory contents of an entity. The component contains an array of ItemStack JS API Objects representing each slot in the inventory. NOTE: Currently items and containers are read-only.Slot 0-8 is the hotbar, 9-16 is the top row of the player's inventory, 17-24 is the middle row, 25-32 is the bottom row
  */
type IInventoryContainerComponent = js.Array[typings.minecraftScriptingTypesShared.IItemStack]
