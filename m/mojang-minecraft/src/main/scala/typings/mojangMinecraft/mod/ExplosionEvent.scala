package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ExplosionEvent")
@js.native
/* protected */ open class ExplosionEvent () extends StObject {
  
  /**
    * Dimension where the explosion has occurred.
    */
  val dimension: Dimension = js.native
  
  /**
    * A collection of blocks impacted by this explosion event.
    */
  val impactedBlocks: js.Array[BlockLocation] = js.native
  
  /**
    * Optional source of the explosion.
    */
  val source: Entity = js.native
}
