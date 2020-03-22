package typings.minappEnv.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collator extends js.Object {
  def compare(x: String, y: String): Double
  def resolvedOptions(): ResolvedCollatorOptions
}

@JSGlobal("Intl.Collator")
@js.native
object Collator
  extends Instantiable0[Collator]
     with Instantiable1[(/* locales */ Array[String]) | (/* locales */ String), Collator]
     with Instantiable2[
      (/* locales */ Array[String]) | (/* locales */ String), 
      /* options */ CollatorOptions, 
      Collator
    ] {
  def apply(): Collator = js.native
  def apply(locales: String): Collator = js.native
  def apply(locales: String, options: CollatorOptions): Collator = js.native
  def apply(locales: Array[String]): Collator = js.native
  def apply(locales: Array[String], options: CollatorOptions): Collator = js.native
  def supportedLocalesOf(locales: String): Array[String] = js.native
  def supportedLocalesOf(locales: String, options: CollatorOptions): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String]): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String], options: CollatorOptions): Array[String] = js.native
}

