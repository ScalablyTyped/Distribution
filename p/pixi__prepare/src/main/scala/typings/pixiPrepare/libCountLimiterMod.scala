package typings.pixiPrepare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCountLimiterMod {
  
  @JSImport("@pixi/prepare/lib/CountLimiter", "CountLimiter")
  @js.native
  open class CountLimiter protected () extends StObject {
    /**
      * @param maxItemsPerFrame - The maximum number of items that can be prepared each frame.
      */
    def this(maxItemsPerFrame: Double) = this()
    
    /**
      * Checks to see if another item can be uploaded. This should only be called once per item.
      * @returns If the item is allowed to be uploaded.
      */
    def allowedToUpload(): Boolean = js.native
    
    /** Resets any counting properties to start fresh on a new frame. */
    def beginFrame(): Unit = js.native
    
    /** The number of items that can be prepared in the current frame. */
    var itemsLeft: Double = js.native
    
    /** The maximum number of items that can be prepared each frame. */
    var maxItemsPerFrame: Double = js.native
  }
}
