package typings.miniprogramWxs.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.miniprogramWxs.Array
import typings.miniprogramWxs.Intl.CollatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Intl.Collator")
@js.native
object Collator
  extends Instantiable0[typings.miniprogramWxs.Intl.Collator]
     with Instantiable1[
      (/* locales */ Array[String]) | (/* locales */ String), 
      typings.miniprogramWxs.Intl.Collator
    ]
     with Instantiable2[
      js.UndefOr[(/* locales */ Array[String]) | (/* locales */ String)], 
      /* options */ CollatorOptions, 
      typings.miniprogramWxs.Intl.Collator
    ] {
  
  def apply(): typings.miniprogramWxs.Intl.Collator = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: CollatorOptions): typings.miniprogramWxs.Intl.Collator = js.native
  def apply(locales: String): typings.miniprogramWxs.Intl.Collator = js.native
  def apply(locales: String, options: CollatorOptions): typings.miniprogramWxs.Intl.Collator = js.native
  def apply(locales: Array[String]): typings.miniprogramWxs.Intl.Collator = js.native
  def apply(locales: Array[String], options: CollatorOptions): typings.miniprogramWxs.Intl.Collator = js.native
  
  def supportedLocalesOf(locales: String): Array[String] = js.native
  def supportedLocalesOf(locales: String, options: CollatorOptions): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String]): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String], options: CollatorOptions): Array[String] = js.native
}
