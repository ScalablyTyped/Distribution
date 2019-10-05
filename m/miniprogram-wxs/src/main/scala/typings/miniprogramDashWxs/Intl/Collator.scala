package typings.miniprogramDashWxs.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.miniprogramDashWxs.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collator extends js.Object {
  def compare(x: java.lang.String, y: java.lang.String): Double
  def resolvedOptions(): ResolvedCollatorOptions
}

@JSGlobal("Intl.Collator")
@js.native
object Collator
  extends Instantiable0[Collator]
     with Instantiable2[
      (/* locales */ Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ CollatorOptions, 
      Collator
    ]
     with Instantiable1[
      (/* locales */ Array[java.lang.String]) | (/* locales */ java.lang.String), 
      Collator
    ] {
  def apply(): Collator = js.native
  def apply(locales: java.lang.String): Collator = js.native
  def apply(locales: java.lang.String, options: CollatorOptions): Collator = js.native
  def apply(locales: Array[java.lang.String]): Collator = js.native
  def apply(locales: Array[java.lang.String], options: CollatorOptions): Collator = js.native
  def supportedLocalesOf(locales: java.lang.String): Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: CollatorOptions): Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: Array[java.lang.String]): Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: Array[java.lang.String], options: CollatorOptions): Array[java.lang.String] = js.native
}

