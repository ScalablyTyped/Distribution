package typings.observeJs.mod.observejs

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
  var addedCount: Double
  /**
    * the index position that the change occured
    */
  var index: Double
  /**
    * an array of values representing the sequence of removed elements
    */
  var removed: js.Array[_]
}

object splice {
  @scala.inline
  def apply(addedCount: Double, index: Double, removed: js.Array[_]): splice = {
    val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[splice]
  }
}

