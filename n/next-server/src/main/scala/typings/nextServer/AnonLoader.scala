package typings.nextServer

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoader extends js.Object {
  var render: js.UndefOr[js.Function2[/* loader */ js.Any, /* props */ js.Any, Element]] = js.undefined
}

object AnonLoader {
  @scala.inline
  def apply(render: (/* loader */ js.Any, /* props */ js.Any) => Element = null): AnonLoader = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    __obj.asInstanceOf[AnonLoader]
  }
}

