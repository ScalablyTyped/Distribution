package typings
package photoswipeLib.photoswipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UI[T /* <: Options */] extends js.Object {
  /**
    * Called by PhotoSwipe after it constructs the UI.
    */
  def init(): scala.Unit
}

object UI {
  @scala.inline
  def apply[T /* <: Options */](init: () => scala.Unit): UI[T] = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
  
    __obj.asInstanceOf[UI[T]]
  }
}

