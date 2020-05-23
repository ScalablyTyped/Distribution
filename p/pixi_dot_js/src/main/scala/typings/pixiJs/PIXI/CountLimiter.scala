package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CountLimiter limits the number of items handled by a {@link PIXI.BasePrepare} to a specified
  * number of items per frame.
  *
  * @class
  * @memberof PIXI
  */
trait CountLimiter extends js.Object {
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

object CountLimiter {
  @scala.inline
  def apply(allowedToUpload: () => Boolean, beginFrame: () => Unit): CountLimiter = {
    val __obj = js.Dynamic.literal(allowedToUpload = js.Any.fromFunction0(allowedToUpload), beginFrame = js.Any.fromFunction0(beginFrame))
    __obj.asInstanceOf[CountLimiter]
  }
}

