package typings.plotlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Domain> */
trait PartialDomain extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var row: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[js.Array[Double]] = js.undefined
  var y: js.UndefOr[js.Array[Double]] = js.undefined
}

object PartialDomain {
  @scala.inline
  def apply(
    column: Int | Double = null,
    row: Int | Double = null,
    x: js.Array[Double] = null,
    y: js.Array[Double] = null
  ): PartialDomain = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDomain]
  }
}

