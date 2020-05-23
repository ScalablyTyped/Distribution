package typings.miniprogramWxs.global.Intl

import typings.miniprogramWxs.Array
import typings.miniprogramWxs.Intl.CollatorOptions
import typings.miniprogramWxs.Intl.ResolvedCollatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.Collator")
@js.native
class CollatorCls ()
  extends typings.miniprogramWxs.Intl.Collator {
  def this(locales: String) = this()
  def this(locales: Array[String]) = this()
  def this(locales: String, options: CollatorOptions) = this()
  def this(locales: Array[String], options: CollatorOptions) = this()
  /* CompleteClass */
  override def compare(x: String, y: String): Double = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedCollatorOptions = js.native
}

