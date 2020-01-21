package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParameterizedQuery extends _QueryParam {
  var binary: js.UndefOr[Boolean] = js.undefined
  var rowMode: js.UndefOr[Unit | array] = js.undefined
  var text: js.UndefOr[String | QueryFile] = js.undefined
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object IParameterizedQuery {
  @scala.inline
  def apply(
    binary: js.UndefOr[Boolean] = js.undefined,
    rowMode: Unit | array = null,
    text: String | QueryFile = null,
    values: js.Array[_] = null
  ): IParameterizedQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (rowMode != null) __obj.updateDynamic("rowMode")(rowMode.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParameterizedQuery]
  }
}

