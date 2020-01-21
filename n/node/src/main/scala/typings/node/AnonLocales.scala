package typings.node

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocales
  extends Instantiable0[DateTimeFormat]
     with Instantiable1[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      DateTimeFormat
    ]
     with Instantiable2[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ DateTimeFormatOptions, 
      DateTimeFormat
    ] {
  def apply(): DateTimeFormat = js.native
  def apply(locales: java.lang.String): DateTimeFormat = js.native
  def apply(locales: java.lang.String, options: DateTimeFormatOptions): DateTimeFormat = js.native
  def apply(locales: js.Array[java.lang.String]): DateTimeFormat = js.native
  def apply(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): DateTimeFormat = js.native
  def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): js.Array[java.lang.String] = js.native
}

