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

