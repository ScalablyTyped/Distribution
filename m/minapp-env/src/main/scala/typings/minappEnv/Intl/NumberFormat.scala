package typings.minappEnv.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormat extends js.Object {
  def format(value: Double): String
  def resolvedOptions(): ResolvedNumberFormatOptions
}

object NumberFormat {
  @scala.inline
  def apply(format: Double => String, resolvedOptions: () => ResolvedNumberFormatOptions): NumberFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
    __obj.asInstanceOf[NumberFormat]
  }
}

