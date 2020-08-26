package typings.pLocate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Number of concurrently pending promises returned by `tester`. Minimum: `1`.
  		@default Infinity
  		*/
  val concurrency: js.UndefOr[Double] = js.native
  /**
  		Preserve `input` order when searching.
  		Disable this to improve performance if you don't care about the order.
  		@default true
  		*/
  val preserveOrder: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    @scala.inline
    def setPreserveOrder(value: Boolean): Self = this.set("preserveOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveOrder: Self = this.set("preserveOrder", js.undefined)
  }
  
}

