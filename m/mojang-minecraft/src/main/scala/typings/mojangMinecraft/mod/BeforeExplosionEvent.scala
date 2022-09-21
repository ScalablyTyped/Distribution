package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BeforeExplosionEvent")
@js.native
/* protected */ open class BeforeExplosionEvent () extends StObject {
  
  /**
    * If set to true, cancels the explosion event.
    */
  var cancel: Boolean = js.native
  
  /**
    * Dimension where the explosion has occurred.
    */
  val dimension: Dimension = js.native
  
  /**
    * A collection of blocks impacted by this explosion event.
    * Note that this property can be updated to change the set of
    * blocks impacted.
    */
  var impactedBlocks: js.Array[BlockLocation] = js.native
  
  /**
    * Optional source of the explosion.
    */
  val source: Entity = js.native
}
