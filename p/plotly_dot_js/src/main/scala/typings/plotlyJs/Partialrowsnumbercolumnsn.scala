package typings.plotlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  rows  :number,   columns  :number,   x  :std.Array<number>,   y  :std.Array<number>}> */
trait Partialrowsnumbercolumnsn extends js.Object {
  var columns: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[js.Array[Double]] = js.undefined
  var y: js.UndefOr[js.Array[Double]] = js.undefined
}

object Partialrowsnumbercolumnsn {
  @scala.inline
  def apply(
    columns: Int | Double = null,
    rows: Int | Double = null,
    x: js.Array[Double] = null,
    y: js.Array[Double] = null
  ): Partialrowsnumbercolumnsn = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialrowsnumbercolumnsn]
  }
}

