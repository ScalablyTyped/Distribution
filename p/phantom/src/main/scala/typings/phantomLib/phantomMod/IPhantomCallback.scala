package typings
package phantomLib.phantomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPhantomCallback extends js.Object {
  var method: phantomLib.phantomLibStrings.callback
  var parent: phantomLib.phantomLibStrings.phantom
  var target: js.Function
  var transform: phantomLib.phantomLibNumbers.`true`
}

object IPhantomCallback {
  @scala.inline
  def apply(
    method: phantomLib.phantomLibStrings.callback,
    parent: phantomLib.phantomLibStrings.phantom,
    target: js.Function,
    transform: phantomLib.phantomLibNumbers.`true`
  ): IPhantomCallback = {
    val __obj = js.Dynamic.literal(method = method, parent = parent, target = target, transform = transform)
  
    __obj.asInstanceOf[IPhantomCallback]
  }
}

