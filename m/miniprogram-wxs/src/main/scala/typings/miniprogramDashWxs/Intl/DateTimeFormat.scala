package typings.miniprogramDashWxs.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.miniprogramDashWxs.Array
import typings.miniprogramDashWxs.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormat extends js.Object {
  def format(): java.lang.String = js.native
  def format(date: Double): java.lang.String = js.native
  def format(date: Date): java.lang.String = js.native
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}

@JSGlobal("Intl.DateTimeFormat")
@js.native
object DateTimeFormat
  extends Instantiable0[DateTimeFormat]
     with Instantiable2[
      (/* locales */ Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ DateTimeFormatOptions, 
      DateTimeFormat
    ]
     with Instantiable1[
      (/* locales */ Array[java.lang.String]) | (/* locales */ java.lang.String), 
      DateTimeFormat
    ] {
  def apply(): DateTimeFormat = js.native
  def apply(locales: java.lang.String): DateTimeFormat = js.native
  def apply(locales: java.lang.String, options: DateTimeFormatOptions): DateTimeFormat = js.native
  def apply(locales: Array[java.lang.String]): DateTimeFormat = js.native
  def apply(locales: Array[java.lang.String], options: DateTimeFormatOptions): DateTimeFormat = js.native
  def supportedLocalesOf(locales: java.lang.String): Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: Array[java.lang.String]): Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: Array[java.lang.String], options: DateTimeFormatOptions): Array[java.lang.String] = js.native
}

