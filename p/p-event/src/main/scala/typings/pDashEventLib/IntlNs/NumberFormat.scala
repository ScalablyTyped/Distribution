package typings
package pDashEventLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormat extends js.Object {
  def format(value: scala.Double): java.lang.String = js.native
  def formatToParts(): pDashEventLib.Array[NumberFormatPart] = js.native
  def formatToParts(number: scala.Double): pDashEventLib.Array[NumberFormatPart] = js.native
  def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}

