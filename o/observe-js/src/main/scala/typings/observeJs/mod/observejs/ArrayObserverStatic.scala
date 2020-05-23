package typings.observeJs.mod.observejs

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayObserverStatic
  extends /**
  * Constructor
  * @param receiver the target for observation
  */
Instantiable1[/* receiver */ js.Array[js.Any], ArrayObserverInstance] {
  /**
    * transforms a copy of an old state of an array into a copy of its current state.
    * @param previous array of old state
    * @param current array of current state
    * @param splices  splices to apply
    */
  def applySplices(previous: js.Array[_], current: js.Array[_], splices: js.Array[splice]): Unit = js.native
}

