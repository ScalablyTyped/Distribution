package typings.pgPromise.pgSubsetMod

import typings.pgPromise.AnonBinary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResult extends js.Object {
  var _parsers: js.Array[js.Function]
  var _types: AnonBinary
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
    _types: AnonBinary,
    command: String,
    fields: js.Array[IColumn],
    rowAsArray: Boolean,
    rowCount: Double,
    rows: js.Array[_]
  ): IResult = {
    val __obj = js.Dynamic.literal(_parsers = _parsers.asInstanceOf[js.Any], _types = _types.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], rowAsArray = rowAsArray.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult]
  }
}

