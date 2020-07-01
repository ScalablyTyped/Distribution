package typings.pg.mod

import typings.pg.pgStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryArrayConfig[I /* <: js.Array[_] */] extends QueryConfig[I] {
  var rowMode: array
}

object QueryArrayConfig {
  @scala.inline
  def apply[/* <: js.Array[_] */ I](rowMode: array, text: String, name: String = null, values: I = null): QueryArrayConfig[I] = {
    val __obj = js.Dynamic.literal(rowMode = rowMode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArrayConfig[I]]
  }
}

