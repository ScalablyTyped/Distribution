package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryArrayConfig extends QueryConfig {
  var rowMode: pgLib.pgLibStrings.array
}

object QueryArrayConfig {
  @scala.inline
  def apply(
    rowMode: pgLib.pgLibStrings.array,
    text: java.lang.String,
    name: java.lang.String = null,
    values: js.Array[_] = null
  ): QueryArrayConfig = {
    val __obj = js.Dynamic.literal(rowMode = rowMode, text = text)
    if (name != null) __obj.updateDynamic("name")(name)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[QueryArrayConfig]
  }
}

