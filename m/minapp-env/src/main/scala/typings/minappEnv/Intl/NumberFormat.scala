package typings.minappEnv.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormat extends js.Object {
  def format(value: Double): String
  def resolvedOptions(): ResolvedNumberFormatOptions
}

@JSGlobal("Intl.NumberFormat")
@js.native
object NumberFormat
  extends Instantiable0[NumberFormat]
     with Instantiable1[(/* locales */ Array[String]) | (/* locales */ String), NumberFormat]
     with Instantiable2[
      (/* locales */ Array[String]) | (/* locales */ String), 
      /* options */ NumberFormatOptions, 
      NumberFormat
    ] {
  def apply(): NumberFormat = js.native
  def apply(locales: String): NumberFormat = js.native
  def apply(locales: String, options: NumberFormatOptions): NumberFormat = js.native
  def apply(locales: Array[String]): NumberFormat = js.native
  def apply(locales: Array[String], options: NumberFormatOptions): NumberFormat = js.native
  def supportedLocalesOf(locales: String): Array[String] = js.native
  def supportedLocalesOf(locales: String, options: NumberFormatOptions): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String]): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String], options: NumberFormatOptions): Array[String] = js.native
}

