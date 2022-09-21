package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "FeedItem")
@js.native
/* protected */ open class FeedItem () extends StObject {
  
  /**
    * As part of the Healable component, an optional collection of
    * side effects that can occur from being fed an item.
    */
  val effects: js.Array[FeedItemEffect] = js.native
  
  /**
    * The amount of health this entity gains when fed this item.
    * This number is an integer starting at 0. Sample values can
    * go as high as 40.
    */
  val healAmount: Double = js.native
  
  /**
    * Identifier of type of item that can be fed. If a namespace
    * is not specified, 'minecraft:' is assumed. Example values
    * include 'wheat' or 'golden_apple'.
    */
  val item: String = js.native
}
