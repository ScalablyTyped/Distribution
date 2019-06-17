package typings
package miniprogramDashWxsLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormat extends js.Object {
  def format(value: scala.Double): java.lang.String
  def resolvedOptions(): ResolvedNumberFormatOptions
}

@JSGlobal("Intl.NumberFormat")
@js.native
class NumberFormatCls () extends NumberFormat {
  def this(locales: java.lang.String) = this()
  def this(locales: miniprogramDashWxsLib.Array[java.lang.String]) = this()
  def this(locales: java.lang.String, options: NumberFormatOptions) = this()
  def this(locales: miniprogramDashWxsLib.Array[java.lang.String], options: NumberFormatOptions) = this()
  /* CompleteClass */
  override def format(value: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}

@JSGlobal("Intl.NumberFormat")
@js.native
object NumberFormat
  extends org.scalablytyped.runtime.Instantiable0[NumberFormat]
     with org.scalablytyped.runtime.Instantiable2[
      (/* locales */ miniprogramDashWxsLib.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ NumberFormatOptions, 
      NumberFormat
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* locales */ miniprogramDashWxsLib.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      NumberFormat
    ] {
  def apply(): miniprogramDashWxsLib.IntlNs.NumberFormat = js.native
  def apply(locales: java.lang.String): miniprogramDashWxsLib.IntlNs.NumberFormat = js.native
  def apply(locales: java.lang.String, options: miniprogramDashWxsLib.IntlNs.NumberFormatOptions): miniprogramDashWxsLib.IntlNs.NumberFormat = js.native
  def apply(locales: miniprogramDashWxsLib.Array[java.lang.String]): miniprogramDashWxsLib.IntlNs.NumberFormat = js.native
  def apply(
    locales: miniprogramDashWxsLib.Array[java.lang.String],
    options: miniprogramDashWxsLib.IntlNs.NumberFormatOptions
  ): miniprogramDashWxsLib.IntlNs.NumberFormat = js.native
  def supportedLocalesOf(locales: java.lang.String): miniprogramDashWxsLib.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: miniprogramDashWxsLib.IntlNs.NumberFormatOptions): miniprogramDashWxsLib.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: miniprogramDashWxsLib.Array[java.lang.String]): miniprogramDashWxsLib.Array[java.lang.String] = js.native
  def supportedLocalesOf(
    locales: miniprogramDashWxsLib.Array[java.lang.String],
    options: miniprogramDashWxsLib.IntlNs.NumberFormatOptions
  ): miniprogramDashWxsLib.Array[java.lang.String] = js.native
}

