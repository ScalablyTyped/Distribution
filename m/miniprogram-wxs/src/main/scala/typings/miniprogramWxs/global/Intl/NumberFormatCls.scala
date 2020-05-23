package typings.miniprogramWxs.global.Intl

import typings.miniprogramWxs.Array
import typings.miniprogramWxs.Intl.NumberFormatOptions
import typings.miniprogramWxs.Intl.ResolvedNumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.NumberFormat")
@js.native
class NumberFormatCls ()
  extends typings.miniprogramWxs.Intl.NumberFormat {
  def this(locales: String) = this()
  def this(locales: Array[String]) = this()
  def this(locales: String, options: NumberFormatOptions) = this()
  def this(locales: Array[String], options: NumberFormatOptions) = this()
  /* CompleteClass */
  override def format(value: Double): String = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}

