package typings.miniprogramWxs.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.miniprogramWxs.Array
import typings.miniprogramWxs.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.NumberFormat")
@js.native
object NumberFormat
  extends Instantiable0[typings.miniprogramWxs.Intl.NumberFormat]
     with Instantiable1[
      (/* locales */ Array[String]) | (/* locales */ String), 
      typings.miniprogramWxs.Intl.NumberFormat
    ]
     with Instantiable2[
      (/* locales */ Array[String]) | (/* locales */ String), 
      /* options */ NumberFormatOptions, 
      typings.miniprogramWxs.Intl.NumberFormat
    ] {
  def apply(): typings.miniprogramWxs.Intl.NumberFormat = js.native
  def apply(locales: String): typings.miniprogramWxs.Intl.NumberFormat = js.native
  def apply(locales: String, options: NumberFormatOptions): typings.miniprogramWxs.Intl.NumberFormat = js.native
  def apply(locales: Array[String]): typings.miniprogramWxs.Intl.NumberFormat = js.native
  def apply(locales: Array[String], options: NumberFormatOptions): typings.miniprogramWxs.Intl.NumberFormat = js.native
  def supportedLocalesOf(locales: String): Array[String] = js.native
  def supportedLocalesOf(locales: String, options: NumberFormatOptions): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String]): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String], options: NumberFormatOptions): Array[String] = js.native
}

