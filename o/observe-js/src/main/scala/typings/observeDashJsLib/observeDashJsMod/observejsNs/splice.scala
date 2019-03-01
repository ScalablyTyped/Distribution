package typings
package observeDashJsLib.observeDashJsMod.observejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*----------------------
		ArrayObserver
	----------------------*/
trait splice extends js.Object {
  /**
  		 * the number of element which were inserted
  		 */
  var addedCount: scala.Double
  /**
  		 * the index position that the change occured
  		 */
  var index: scala.Double
  /**
  		 * an array of values representing the sequence of removed elements
  		 */
  var removed: js.Array[_]
}

object splice {
  @scala.inline
  def apply(addedCount: scala.Double, index: scala.Double, removed: js.Array[_]): splice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addedCount")(addedCount)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("removed")(removed)
    __obj.asInstanceOf[splice]
  }
}

