package typings.pinkyswear

import typings.pinkyswear.PinkySwear.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PinkySwearStatic extends js.Object {
  /**
    * Create a new promise in pending state that promises a value or set of values.
    *
    * @see PinkySwear.Promise
    * @returns PinkySwear.Promise
    */
  def apply(): Promise = js.native
  /**
    * Create a new promise in pending state that promises a value of a specific type and that also extends the
    * returned promise object as specified in an extend function.
    *
    * @param extend Called when the promise is created and is ready to be extended.
    * @returns PinkySwear.Promise
    */
  def apply[T](extend: js.Function1[/* promise */ Promise, Promise]): Promise = js.native
}

