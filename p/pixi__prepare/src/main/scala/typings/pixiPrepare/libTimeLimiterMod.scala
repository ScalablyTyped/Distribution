package typings.pixiPrepare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTimeLimiterMod {
  
  @JSImport("@pixi/prepare/lib/TimeLimiter", "TimeLimiter")
  @js.native
  open class TimeLimiter protected () extends StObject {
    /** @param maxMilliseconds - The maximum milliseconds that can be spent preparing items each frame. */
    def this(maxMilliseconds: Double) = this()
    
    /**
      * Checks to see if another item can be uploaded. This should only be called once per item.
      * @returns - If the item is allowed to be uploaded.
      */
    def allowedToUpload(): Boolean = js.native
    
    /** Resets any counting properties to start fresh on a new frame. */
    def beginFrame(): Unit = js.native
    
    /**
      * The start time of the current frame.
      * @readonly
      */
    var frameStart: Double = js.native
    
    /** The maximum milliseconds that can be spent preparing items each frame. */
    var maxMilliseconds: Double = js.native
  }
}
