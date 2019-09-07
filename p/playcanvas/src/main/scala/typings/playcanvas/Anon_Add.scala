package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add extends js.Object {
  var add: js.UndefOr[js.Any] = js.undefined
  var load: js.UndefOr[js.Any] = js.undefined
  var remove: js.UndefOr[js.Any] = js.undefined
}

object Anon_Add {
  @scala.inline
  def apply(add: js.Any = null, load: js.Any = null, remove: js.Any = null): Anon_Add = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (load != null) __obj.updateDynamic("load")(load)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[Anon_Add]
  }
}

