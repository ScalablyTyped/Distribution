package typings.mnemonist.bitVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitVectorOptions extends js.Object {
  var initialCapacity: js.UndefOr[Double] = js.native
  var initialLength: js.UndefOr[Double] = js.native
  var policy: js.UndefOr[js.Function1[/* capacity */ Double, Double]] = js.native
}

object BitVectorOptions {
  @scala.inline
  def apply(): BitVectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitVectorOptions]
  }
  @scala.inline
  implicit class BitVectorOptionsOps[Self <: BitVectorOptions] (val x: Self) extends AnyVal {
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
    def setInitialCapacity(value: Double): Self = this.set("initialCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialCapacity: Self = this.set("initialCapacity", js.undefined)
    @scala.inline
    def setInitialLength(value: Double): Self = this.set("initialLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialLength: Self = this.set("initialLength", js.undefined)
    @scala.inline
    def setPolicy(value: /* capacity */ Double => Double): Self = this.set("policy", js.Any.fromFunction1(value))
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
  
}

