package typings
package pDashEventLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collator extends js.Object {
  def compare(x: java.lang.String, y: java.lang.String): scala.Double
  def resolvedOptions(): ResolvedCollatorOptions
}

object Collator {
  @scala.inline
  def apply(
    compare: js.Function2[java.lang.String, java.lang.String, scala.Double],
    resolvedOptions: js.Function0[ResolvedCollatorOptions]
  ): Collator = {
    val __obj = js.Dynamic.literal(compare = compare, resolvedOptions = resolvedOptions)
  
    __obj.asInstanceOf[Collator]
  }
}

