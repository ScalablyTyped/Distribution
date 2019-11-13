package typings.nextDashServer

import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loaded[P] extends js.Object {
  /**
    * @deprecated the modules option has been planned for removal
    */
  var render: js.UndefOr[js.Function2[/* props */ P, /* loaded */ js.Any, Element]] = js.undefined
}

object Anon_Loaded {
  @scala.inline
  def apply[P](render: (/* props */ P, /* loaded */ js.Any) => Element = null): Anon_Loaded[P] = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    __obj.asInstanceOf[Anon_Loaded[P]]
  }
}

