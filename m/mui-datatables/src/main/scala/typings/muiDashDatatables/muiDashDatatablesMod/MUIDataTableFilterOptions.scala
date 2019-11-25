package typings.muiDashDatatables.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableFilterOptions extends js.Object {
  var display: js.UndefOr[
    js.Function4[
      /* filterList */ js.Array[String], 
      /* onChange */ js.Any, 
      /* index */ Double, 
      /* column */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var logic: js.UndefOr[js.Function2[/* prop */ String, /* filterValue */ js.Array[_], Boolean]] = js.undefined
  var names: js.UndefOr[js.Array[String]] = js.undefined
}

object MUIDataTableFilterOptions {
  @scala.inline
  def apply(
    display: (/* filterList */ js.Array[String], /* onChange */ js.Any, /* index */ Double, /* column */ js.Any) => Unit = null,
    logic: (/* prop */ String, /* filterValue */ js.Array[_]) => Boolean = null,
    names: js.Array[String] = null
  ): MUIDataTableFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(js.Any.fromFunction4(display))
    if (logic != null) __obj.updateDynamic("logic")(js.Any.fromFunction2(logic))
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableFilterOptions]
  }
}

