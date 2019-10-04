package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.Anon_Binary
import typings.pgDashPromise.typescriptPgDashSubsetMod.IColumn
import typings.pgDashPromise.typescriptPgDashSubsetMod.IResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResultExt extends IResult {
  // Property 'duration' exists only in the following context:
  //  - for single-query events 'receive'
  //  - for method Database.result
  var duration: js.UndefOr[Double] = js.undefined
}

object IResultExt {
  @scala.inline
  def apply(
    _parsers: js.Array[js.Function],
    _types: Anon_Binary,
    command: String,
    fields: js.Array[IColumn],
    rowAsArray: Boolean,
    rowCount: Double,
    rows: js.Array[_],
    duration: Int | Double = null
  ): IResultExt = {
    val __obj = js.Dynamic.literal(_parsers = _parsers, _types = _types, command = command, fields = fields, rowAsArray = rowAsArray, rowCount = rowCount, rows = rows)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResultExt]
  }
}

