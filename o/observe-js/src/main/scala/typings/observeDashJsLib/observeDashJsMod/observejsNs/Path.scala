package typings
package observeDashJsLib.observeDashJsMod.observejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*----------------------
		Path
	----------------------*/
trait Path extends js.Object {
  /**
  		 * Returns the current value of the path from the provided object. If eval() is available,
    		 * a compiled getter will be used for better performance. Like PathObserver above, undefined
    		 * is returned unless you provide an overriding defaultValue.
  		 */
  def getValueFrom(`object`: js.Any, defaultValue: js.Any): js.Any
}

object Path {
  @scala.inline
  def apply(getValueFrom: (js.Any, js.Any) => js.Any): Path = {
    val __obj = js.Dynamic.literal(getValueFrom = js.Any.fromFunction2(getValueFrom))
  
    __obj.asInstanceOf[Path]
  }
}

