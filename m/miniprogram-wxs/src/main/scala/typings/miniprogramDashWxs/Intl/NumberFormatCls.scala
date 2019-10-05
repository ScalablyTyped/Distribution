package typings.miniprogramDashWxs.Intl

import typings.miniprogramDashWxs.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.NumberFormat")
@js.native
class NumberFormatCls () extends NumberFormat {
  def this(locales: java.lang.String) = this()
  def this(locales: Array[java.lang.String]) = this()
  def this(locales: java.lang.String, options: NumberFormatOptions) = this()
  def this(locales: Array[java.lang.String], options: NumberFormatOptions) = this()
  /* CompleteClass */
  override def format(value: Double): java.lang.String = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}

