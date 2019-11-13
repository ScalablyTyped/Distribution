package typings.next

import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loader extends js.Object {
  var render: js.UndefOr[js.Function2[/* loader */ js.Any, /* props */ js.Any, Element]] = js.undefined
}

object Anon_Loader {
  @scala.inline
  def apply(render: (/* loader */ js.Any, /* props */ js.Any) => Element = null): Anon_Loader = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    __obj.asInstanceOf[Anon_Loader]
  }
}

