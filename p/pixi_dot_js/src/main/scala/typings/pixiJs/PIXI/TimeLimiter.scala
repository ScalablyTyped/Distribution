package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TimeLimiter limits the number of items handled by a {@link PIXI.BasePrepare} to a specified
  * number of milliseconds per frame.
  *
  * @class
  * @memberof PIXI
  */
trait TimeLimiter extends StObject {
  
  /**
    * Checks to see if another item can be uploaded. This should only be called once per item.
    * @return {boolean} If the item is allowed to be uploaded.
    */
  def allowedToUpload(): Boolean
  
  /**
    * Resets any counting properties to start fresh on a new frame.
    */
  def beginFrame(): Unit
}
object TimeLimiter {
  
  inline def apply(allowedToUpload: () => Boolean, beginFrame: () => Unit): TimeLimiter = {
    val __obj = js.Dynamic.literal(allowedToUpload = js.Any.fromFunction0(allowedToUpload), beginFrame = js.Any.fromFunction0(beginFrame))
    __obj.asInstanceOf[TimeLimiter]
  }
  
  extension [Self <: TimeLimiter](x: Self) {
    
    inline def setAllowedToUpload(value: () => Boolean): Self = StObject.set(x, "allowedToUpload", js.Any.fromFunction0(value))
    
    inline def setBeginFrame(value: () => Unit): Self = StObject.set(x, "beginFrame", js.Any.fromFunction0(value))
  }
}
