package typings
package observeDashJsLib.observeDashJsMod.observejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*----------------------
		Observable
	----------------------*/
@js.native
trait Observable extends js.Object {
  /**
  		 * Ends observation. Frees resources and drops references to observed objects.
  		 */
  def close(): scala.Unit = js.native
  /**
  		 * Report any changes now (does nothing if there are no changes to report).
  		 */
  def deliver(): scala.Unit = js.native
  /**
  		 * If there are changes to report, ignore them. Returns the current value of the observation.
  		 */
  def discardChanges(): scala.Unit = js.native
  /**
  		 * Begins observation.
  		 * @param onChange the function that gets invoked if a change is detected
  		 * @param the target of observation
  		 */
  def open(onChange: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, _]): scala.Unit = js.native
  def open(onChange: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, _], receiver: js.Any): scala.Unit = js.native
}

