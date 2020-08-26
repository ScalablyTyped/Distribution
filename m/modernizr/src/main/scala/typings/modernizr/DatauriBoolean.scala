package typings.modernizr

import typings.std.Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatauriBoolean extends Boolean {
  var over32kb: scala.Boolean = js.native
}

object DatauriBoolean {
  @scala.inline
  def apply(over32kb: scala.Boolean): DatauriBoolean = {
    val __obj = js.Dynamic.literal(over32kb = over32kb.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatauriBoolean]
  }
  @scala.inline
  implicit class DatauriBooleanOps[Self <: DatauriBoolean] (val x: Self) extends AnyVal {
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
    def setOver32kb(value: scala.Boolean): Self = this.set("over32kb", value.asInstanceOf[js.Any])
  }
  
}

