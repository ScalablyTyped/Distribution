package typings.miniprogramDashWxs.Intl

import typings.miniprogramDashWxs.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.NumberFormat")
@js.native
class NumberFormatCls () extends NumberFormat {
  def this(locales: String) = this()
  def this(locales: Array[String]) = this()
  def this(locales: String, options: NumberFormatOptions) = this()
  def this(locales: Array[String], options: NumberFormatOptions) = this()
  /* CompleteClass */
  override def format(value: Double): String = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}

