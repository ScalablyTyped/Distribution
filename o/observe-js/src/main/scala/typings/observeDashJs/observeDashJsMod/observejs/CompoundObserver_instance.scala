package typings.observeDashJs.observeDashJsMod.observejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompoundObserver_instance extends Observable {
  /**
  		 * Adds an Observer to the list of observables.
  		 */
  def addObserver(observer: Observable): Unit = js.native
  /**
  		 * Adds the receivers property at the specified path to the list of observables.
  		 * @param receiver the target for observation
  		 * @param path specifies the paht to observe. If path === '' the receiver itself gets observed.
  		 */
  def addPath(receiver: js.Any, path: String): Unit = js.native
}

