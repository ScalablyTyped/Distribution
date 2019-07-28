package typings.miniprogramDashWxs.IntlNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.miniprogramDashWxs.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormat extends js.Object {
  def format(value: Double): java.lang.String
  def resolvedOptions(): ResolvedNumberFormatOptions
}

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

@JSGlobal("Intl.NumberFormat")
@js.native
object NumberFormat
  extends Instantiable0[NumberFormat]
     with Instantiable2[
      (/* locales */ Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ NumberFormatOptions, 
      NumberFormat
    ]
     with Instantiable1[
      (/* locales */ Array[java.lang.String]) | (/* locales */ java.lang.String), 
      NumberFormat
    ] {
  def apply(): NumberFormat = js.native
  def apply(locales: java.lang.String): NumberFormat = js.native
  def apply(locales: java.lang.String, options: NumberFormatOptions): NumberFormat = js.native
  def apply(locales: Array[java.lang.String]): NumberFormat = js.native
  def apply(locales: Array[java.lang.String], options: NumberFormatOptions): NumberFormat = js.native
  def supportedLocalesOf(locales: java.lang.String): Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: NumberFormatOptions): Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: Array[java.lang.String]): Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: Array[java.lang.String], options: NumberFormatOptions): Array[java.lang.String] = js.native
}

