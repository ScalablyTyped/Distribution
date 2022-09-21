package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockHitInformation")
@js.native
/* protected */ open class BlockHitInformation () extends StObject {
  
  /**
    * Block that was hit.
    */
  val block: Block = js.native
  
  /**
    * Face of the block that was hit.
    */
  val face: Direction = js.native
  
  /**
    * X coordinate on the face that was hit.
    */
  val faceLocationX: Double = js.native
  
  /**
    * Y coordinate on the face that was hit.
    */
  val faceLocationY: Double = js.native
}
