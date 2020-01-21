package typings.nextServer

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoaded[P] extends js.Object {
  /**
    * @deprecated the modules option has been planned for removal
    */
  var render: js.UndefOr[js.Function2[/* props */ P, /* loaded */ js.Any, Element]] = js.undefined
}

object AnonLoaded {
  @scala.inline
  def apply[P](render: (/* props */ P, /* loaded */ js.Any) => Element = null): AnonLoaded[P] = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    __obj.asInstanceOf[AnonLoaded[P]]
  }
}

