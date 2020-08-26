package typings.miniprogramWxs.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormat extends js.Object {
  def format(value: Double): String = js.native
  def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}

object NumberFormat {
  @scala.inline
  def apply(format: Double => String, resolvedOptions: () => ResolvedNumberFormatOptions): NumberFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
    __obj.asInstanceOf[NumberFormat]
  }
  @scala.inline
  implicit class NumberFormatOps[Self <: NumberFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormat(value: Double => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setResolvedOptions(value: () => ResolvedNumberFormatOptions): Self = this.set("resolvedOptions", js.Any.fromFunction0(value))
  }
  
}

