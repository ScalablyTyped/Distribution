package typings.phantom.phantomMod

import typings.phantom.phantomNumbers.`true`
import typings.phantom.phantomStrings.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPhantomCallback extends js.Object {
  var method: callback
  var parent: typings.phantom.phantomStrings.phantom
  var target: js.Function
  var transform: `true`
}

object IPhantomCallback {
  @scala.inline
  def apply(
    method: callback,
    parent: typings.phantom.phantomStrings.phantom,
    target: js.Function,
    transform: `true`
  ): IPhantomCallback = {
    val __obj = js.Dynamic.literal(method = method, parent = parent, target = target, transform = transform)
  
    __obj.asInstanceOf[IPhantomCallback]
  }
}

