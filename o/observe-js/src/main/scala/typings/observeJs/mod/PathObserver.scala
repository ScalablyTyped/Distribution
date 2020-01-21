package typings.observeJs.mod

import org.scalablytyped.runtime.TopLevel
import typings.observeJs.mod.observejs.PathObserverInstance
import typings.observeJs.mod.observejs.PathObserverStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("observe-js", "PathObserver")
@js.native
class PathObserver protected () extends PathObserverInstance {
  /**
  		 * Constructor
  		 * @param receiver the target for observation
  		 * @param path specifies the paht to observe. If path === '' the receiver itself gets observed.
  		 * @param defaultValue the defaultValue
  		 */
  def this(receiver: js.Any, path: String) = this()
  def this(receiver: js.Any, path: String, defaultValue: js.Any) = this()
}

@JSImport("observe-js", "PathObserver")
@js.native
object PathObserver extends TopLevel[PathObserverStatic]

