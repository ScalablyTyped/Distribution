package typings
package miniprogramDashWxsLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collator extends js.Object {
  def compare(x: java.lang.String, y: java.lang.String): scala.Double
  def resolvedOptions(): ResolvedCollatorOptions
}

@JSGlobal("Intl.Collator")
@js.native
class CollatorCls () extends Collator {
  def this(locales: java.lang.String) = this()
  def this(locales: miniprogramDashWxsLib.Array[java.lang.String]) = this()
  def this(locales: java.lang.String, options: CollatorOptions) = this()
  def this(locales: miniprogramDashWxsLib.Array[java.lang.String], options: CollatorOptions) = this()
  /* CompleteClass */
  override def compare(x: java.lang.String, y: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedCollatorOptions = js.native
}

@JSGlobal("Intl.Collator")
@js.native
object Collator
  extends org.scalablytyped.runtime.Instantiable0[Collator]
     with org.scalablytyped.runtime.Instantiable2[
      (/* locales */ miniprogramDashWxsLib.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ CollatorOptions, 
      Collator
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* locales */ miniprogramDashWxsLib.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      Collator
    ] {
  def apply(): miniprogramDashWxsLib.IntlNs.Collator = js.native
  def apply(locales: java.lang.String): miniprogramDashWxsLib.IntlNs.Collator = js.native
  def apply(locales: java.lang.String, options: miniprogramDashWxsLib.IntlNs.CollatorOptions): miniprogramDashWxsLib.IntlNs.Collator = js.native
  def apply(locales: miniprogramDashWxsLib.Array[java.lang.String]): miniprogramDashWxsLib.IntlNs.Collator = js.native
  def apply(
    locales: miniprogramDashWxsLib.Array[java.lang.String],
    options: miniprogramDashWxsLib.IntlNs.CollatorOptions
  ): miniprogramDashWxsLib.IntlNs.Collator = js.native
  def supportedLocalesOf(locales: java.lang.String): miniprogramDashWxsLib.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: miniprogramDashWxsLib.IntlNs.CollatorOptions): miniprogramDashWxsLib.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: miniprogramDashWxsLib.Array[java.lang.String]): miniprogramDashWxsLib.Array[java.lang.String] = js.native
  def supportedLocalesOf(
    locales: miniprogramDashWxsLib.Array[java.lang.String],
    options: miniprogramDashWxsLib.IntlNs.CollatorOptions
  ): miniprogramDashWxsLib.Array[java.lang.String] = js.native
}

