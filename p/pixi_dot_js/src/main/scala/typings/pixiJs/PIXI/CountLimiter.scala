package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CountLimiter limits the number of items handled by a {@link PIXI.BasePrepare} to a specified
  * number of items per frame.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait CountLimiter extends StObject {
  
  /**
    * Checks to see if another item can be uploaded. This should only be called once per item.
    * @return {boolean} If the item is allowed to be uploaded.
    */
  def allowedToUpload(): Boolean = js.native
  
  /**
    * Resets any counting properties to start fresh on a new frame.
    */
  def beginFrame(): Unit = js.native
}
object CountLimiter {
  
  @scala.inline
  def apply(allowedToUpload: () => Boolean, beginFrame: () => Unit): CountLimiter = {
    val __obj = js.Dynamic.literal(allowedToUpload = js.Any.fromFunction0(allowedToUpload), beginFrame = js.Any.fromFunction0(beginFrame))
    __obj.asInstanceOf[CountLimiter]
  }
  
  @scala.inline
  implicit class CountLimiterMutableBuilder[Self <: CountLimiter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedToUpload(value: () => Boolean): Self = StObject.set(x, "allowedToUpload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeginFrame(value: () => Unit): Self = StObject.set(x, "beginFrame", js.Any.fromFunction0(value))
  }
}
