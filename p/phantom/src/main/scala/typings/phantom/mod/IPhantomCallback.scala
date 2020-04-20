package typings.phantom.mod

import typings.phantom.phantomBooleans.`true`
import typings.phantom.phantomStrings.callback
import typings.phantom.phantomStrings.phantom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPhantomCallback extends js.Object {
  var method: callback
  var parent: phantom
  var target: js.Function
  var transform: `true`
}

object IPhantomCallback {
  @scala.inline
  def apply(method: callback, parent: phantom, target: js.Function, transform: `true`): IPhantomCallback = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPhantomCallback]
  }
}

