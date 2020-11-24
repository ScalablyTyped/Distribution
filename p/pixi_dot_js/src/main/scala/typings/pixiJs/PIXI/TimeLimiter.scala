package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TimeLimiter limits the number of items handled by a {@link PIXI.BasePrepare} to a specified
  * number of milliseconds per frame.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait TimeLimiter extends js.Object {
  
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
object TimeLimiter {
  
  @scala.inline
  def apply(allowedToUpload: () => Boolean, beginFrame: () => Unit): TimeLimiter = {
    val __obj = js.Dynamic.literal(allowedToUpload = js.Any.fromFunction0(allowedToUpload), beginFrame = js.Any.fromFunction0(beginFrame))
    __obj.asInstanceOf[TimeLimiter]
  }
  
  @scala.inline
  implicit class TimeLimiterOps[Self <: TimeLimiter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowedToUpload(value: () => Boolean): Self = this.set("allowedToUpload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeginFrame(value: () => Unit): Self = this.set("beginFrame", js.Any.fromFunction0(value))
  }
}
