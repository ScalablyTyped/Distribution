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

