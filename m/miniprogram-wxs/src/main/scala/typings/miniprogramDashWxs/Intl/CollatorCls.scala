package typings.miniprogramDashWxs.Intl

import typings.miniprogramDashWxs.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.Collator")
@js.native
class CollatorCls () extends Collator {
  def this(locales: java.lang.String) = this()
  def this(locales: Array[java.lang.String]) = this()
  def this(locales: java.lang.String, options: CollatorOptions) = this()
  def this(locales: Array[java.lang.String], options: CollatorOptions) = this()
  /* CompleteClass */
  override def compare(x: java.lang.String, y: java.lang.String): Double = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedCollatorOptions = js.native
}

