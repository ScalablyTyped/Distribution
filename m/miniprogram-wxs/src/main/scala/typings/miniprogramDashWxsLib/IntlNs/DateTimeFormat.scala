package typings
package miniprogramDashWxsLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormat extends js.Object {
  def format(): java.lang.String = js.native
  def format(date: miniprogramDashWxsLib.Date): java.lang.String = js.native
  def format(date: scala.Double): java.lang.String = js.native
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}

@JSGlobal("Intl.DateTimeFormat")
@js.native
class DateTimeFormatCls () extends DateTimeFormat {
  def this(locales: java.lang.String) = this()
  def this(locales: miniprogramDashWxsLib.Array[java.lang.String]) = this()
  def this(locales: java.lang.String, options: DateTimeFormatOptions) = this()
  def this(locales: miniprogramDashWxsLib.Array[java.lang.String], options: DateTimeFormatOptions) = this()
}

@JSGlobal("Intl.DateTimeFormat")
@js.native
object DateTimeFormat
  extends org.scalablytyped.runtime.Instantiable0[DateTimeFormat]
     with org.scalablytyped.runtime.Instantiable2[
      (/* locales */ miniprogramDashWxsLib.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ DateTimeFormatOptions, 
      DateTimeFormat
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* locales */ miniprogramDashWxsLib.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      DateTimeFormat
    ] {
  def apply(): miniprogramDashWxsLib.IntlNs.DateTimeFormat = js.native
  def apply(locales: java.lang.String): miniprogramDashWxsLib.IntlNs.DateTimeFormat = js.native
  def apply(locales: java.lang.String, options: miniprogramDashWxsLib.IntlNs.DateTimeFormatOptions): miniprogramDashWxsLib.IntlNs.DateTimeFormat = js.native
  def apply(locales: miniprogramDashWxsLib.Array[java.lang.String]): miniprogramDashWxsLib.IntlNs.DateTimeFormat = js.native
  def apply(
    locales: miniprogramDashWxsLib.Array[java.lang.String],
    options: miniprogramDashWxsLib.IntlNs.DateTimeFormatOptions
  ): miniprogramDashWxsLib.IntlNs.DateTimeFormat = js.native
  def supportedLocalesOf(locales: java.lang.String): miniprogramDashWxsLib.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: miniprogramDashWxsLib.IntlNs.DateTimeFormatOptions): miniprogramDashWxsLib.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: miniprogramDashWxsLib.Array[java.lang.String]): miniprogramDashWxsLib.Array[java.lang.String] = js.native
  def supportedLocalesOf(
    locales: miniprogramDashWxsLib.Array[java.lang.String],
    options: miniprogramDashWxsLib.IntlNs.DateTimeFormatOptions
  ): miniprogramDashWxsLib.Array[java.lang.String] = js.native
}

