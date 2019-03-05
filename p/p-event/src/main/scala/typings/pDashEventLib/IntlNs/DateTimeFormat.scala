package typings
package pDashEventLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormat extends js.Object {
  def format(): java.lang.String = js.native
  def format(date: pDashEventLib.Date): java.lang.String = js.native
  def format(date: scala.Double): java.lang.String = js.native
  def formatToParts(): pDashEventLib.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: pDashEventLib.Date): pDashEventLib.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: scala.Double): pDashEventLib.Array[DateTimeFormatPart] = js.native
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}

