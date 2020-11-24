package typings.miniprogramWxs.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.miniprogramWxs.Array
import typings.miniprogramWxs.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Intl.DateTimeFormat")
@js.native
object DateTimeFormat
  extends Instantiable0[typings.miniprogramWxs.Intl.DateTimeFormat]
     with Instantiable1[
      (/* locales */ Array[String]) | (/* locales */ String), 
      typings.miniprogramWxs.Intl.DateTimeFormat
    ]
     with Instantiable2[
      js.UndefOr[(/* locales */ Array[String]) | (/* locales */ String)], 
      /* options */ DateTimeFormatOptions, 
      typings.miniprogramWxs.Intl.DateTimeFormat
    ] {
  
  def apply(): typings.miniprogramWxs.Intl.DateTimeFormat = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): typings.miniprogramWxs.Intl.DateTimeFormat = js.native
  def apply(locales: String): typings.miniprogramWxs.Intl.DateTimeFormat = js.native
  def apply(locales: String, options: DateTimeFormatOptions): typings.miniprogramWxs.Intl.DateTimeFormat = js.native
  def apply(locales: Array[String]): typings.miniprogramWxs.Intl.DateTimeFormat = js.native
  def apply(locales: Array[String], options: DateTimeFormatOptions): typings.miniprogramWxs.Intl.DateTimeFormat = js.native
  
  def supportedLocalesOf(locales: String): Array[String] = js.native
  def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String]): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String], options: DateTimeFormatOptions): Array[String] = js.native
}
