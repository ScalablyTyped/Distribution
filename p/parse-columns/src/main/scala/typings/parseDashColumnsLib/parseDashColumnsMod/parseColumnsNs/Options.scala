package typings
package parseDashColumnsLib.parseDashColumnsMod.parseColumnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends BaseOptions {
  def transform(
    element: java.lang.String,
    header: java.lang.String,
    columnIndex: scala.Double,
    rowIndex: scala.Double
  ): T
}

object Options {
  @scala.inline
  def apply[T](
    transform: js.Function4[java.lang.String, java.lang.String, scala.Double, scala.Double, T],
    headers: js.Array[java.lang.String] = null,
    separator: java.lang.String = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal(transform = transform)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[Options[T]]
  }
}

