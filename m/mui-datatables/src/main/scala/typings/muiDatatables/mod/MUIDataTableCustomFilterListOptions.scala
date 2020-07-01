package typings.muiDatatables.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableCustomFilterListOptions extends js.Object {
  var render: js.UndefOr[js.Function1[/* value */ js.Any, ReactNode]] = js.undefined
  var update: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Array[String]]] = js.undefined
}

object MUIDataTableCustomFilterListOptions {
  @scala.inline
  def apply(
    render: /* value */ js.Any => ReactNode = null,
    update: /* repeated */ js.Any => js.Array[String] = null
  ): MUIDataTableCustomFilterListOptions = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[MUIDataTableCustomFilterListOptions]
  }
}

