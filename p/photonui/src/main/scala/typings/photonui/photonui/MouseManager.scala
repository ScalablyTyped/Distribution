package typings.photonui.photonui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseManager extends Base {
  var action: String
   // readonly
  var btnLeft: Boolean
   // readonly
  var btnMiddle: Boolean
   // readonly
  var btnRight: Boolean
   // readonly
  var button: String
   // readonly
  var deltaX: Double
   // readonly
  var deltaY: Double
  var element: HTMLElement
   // readonly
  var pageX: Double
   // readonly
  var pageY: Double
  var threshold: Double
   // readonly
  var x: Double
   // readonly
  var y: Double
}

object MouseManager {
  @scala.inline
  def apply(
    action: String,
    btnLeft: Boolean,
    btnMiddle: Boolean,
    btnRight: Boolean,
    button: String,
    deltaX: Double,
    deltaY: Double,
    destroy: () => Unit,
    element: HTMLElement,
    pageX: Double,
    pageY: Double,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    threshold: Double,
    x: Double,
    y: Double
  ): MouseManager = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], btnLeft = btnLeft.asInstanceOf[js.Any], btnMiddle = btnMiddle.asInstanceOf[js.Any], btnRight = btnRight.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), threshold = threshold.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseManager]
  }
}

