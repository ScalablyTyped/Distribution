package typings.pgDashPromise.typescriptPgDashSubsetMod

import typings.pgDashPromise.Anon_Binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResult extends js.Object {
  var _parsers: js.Array[js.Function]
  var _types: Anon_Binary
  var command: String
  var fields: js.Array[IColumn]
  // properties below are not available within Native Bindings:
  var rowAsArray: Boolean
  var rowCount: Double
  var rows: js.Array[_]
}

object IResult {
  @scala.inline
  def apply(
    _parsers: js.Array[js.Function],
    _types: Anon_Binary,
    command: String,
    fields: js.Array[IColumn],
    rowAsArray: Boolean,
    rowCount: Double,
    rows: js.Array[_]
  ): IResult = {
    val __obj = js.Dynamic.literal(_parsers = _parsers, _types = _types, command = command, fields = fields, rowAsArray = rowAsArray, rowCount = rowCount, rows = rows)
  
    __obj.asInstanceOf[IResult]
  }
}

