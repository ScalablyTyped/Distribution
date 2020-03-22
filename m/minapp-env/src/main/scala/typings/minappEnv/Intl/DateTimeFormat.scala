package typings.minappEnv.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.minappEnv.Array
import typings.minappEnv.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormat extends js.Object {
  def format(): String = js.native
  def format(date: Double): String = js.native
  def format(date: Date): String = js.native
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}

@JSGlobal("Intl.DateTimeFormat")
@js.native
object DateTimeFormat
  extends Instantiable0[DateTimeFormat]
     with Instantiable1[(/* locales */ Array[String]) | (/* locales */ String), DateTimeFormat]
     with Instantiable2[
      (/* locales */ Array[String]) | (/* locales */ String), 
      /* options */ DateTimeFormatOptions, 
      DateTimeFormat
    ] {
  def apply(): DateTimeFormat = js.native
  def apply(locales: String): DateTimeFormat = js.native
  def apply(locales: String, options: DateTimeFormatOptions): DateTimeFormat = js.native
  def apply(locales: Array[String]): DateTimeFormat = js.native
  def apply(locales: Array[String], options: DateTimeFormatOptions): DateTimeFormat = js.native
  def supportedLocalesOf(locales: String): Array[String] = js.native
  def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String]): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String], options: DateTimeFormatOptions): Array[String] = js.native
}

