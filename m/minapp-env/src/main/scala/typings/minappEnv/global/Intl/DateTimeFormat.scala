package typings.minappEnv.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.minappEnv.Array
import typings.minappEnv.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.DateTimeFormat")
@js.native
object DateTimeFormat
  extends Instantiable0[typings.minappEnv.Intl.DateTimeFormat]
     with Instantiable1[
      (/* locales */ Array[String]) | (/* locales */ String), 
      typings.minappEnv.Intl.DateTimeFormat
    ]
     with Instantiable2[
      (/* locales */ Array[String]) | (/* locales */ String), 
      /* options */ DateTimeFormatOptions, 
      typings.minappEnv.Intl.DateTimeFormat
    ] {
  def apply(): typings.minappEnv.Intl.DateTimeFormat = js.native
  def apply(locales: String): typings.minappEnv.Intl.DateTimeFormat = js.native
  def apply(locales: String, options: DateTimeFormatOptions): typings.minappEnv.Intl.DateTimeFormat = js.native
  def apply(locales: Array[String]): typings.minappEnv.Intl.DateTimeFormat = js.native
  def apply(locales: Array[String], options: DateTimeFormatOptions): typings.minappEnv.Intl.DateTimeFormat = js.native
  def supportedLocalesOf(locales: String): Array[String] = js.native
  def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String]): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String], options: DateTimeFormatOptions): Array[String] = js.native
}

