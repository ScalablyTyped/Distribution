package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreparedStatement extends _QueryParam {
  var binary: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var rowMode: js.UndefOr[array | Null | Unit] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String | QueryFile] = js.undefined
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object IPreparedStatement {
  @scala.inline
  def apply(
    binary: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    rowMode: array | Unit = null,
    rows: Int | Double = null,
    text: String | QueryFile = null,
    values: js.Array[_] = null
  ): IPreparedStatement = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rowMode != null) __obj.updateDynamic("rowMode")(rowMode.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreparedStatement]
  }
}

