package typings.pg.pgMod

import typings.pg.pgStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryArrayConfig[I /* <: js.Array[_] */] extends QueryConfig[I] {
  var rowMode: array
}

object QueryArrayConfig {
  @scala.inline
  def apply[I /* <: js.Array[_] */](rowMode: array, text: String, name: String = null, values: I = null): QueryArrayConfig[I] = {
    val __obj = js.Dynamic.literal(rowMode = rowMode, text = text)
    if (name != null) __obj.updateDynamic("name")(name)
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArrayConfig[I]]
  }
}

