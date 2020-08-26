package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeasureMemoryOptions extends js.Object {
  var context: js.UndefOr[Context] = js.native
  /**
    * @default 'summary'
    */
  var mode: js.UndefOr[MeasureMemoryMode] = js.native
}

object MeasureMemoryOptions {
  @scala.inline
  def apply(): MeasureMemoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureMemoryOptions]
  }
  @scala.inline
  implicit class MeasureMemoryOptionsOps[Self <: MeasureMemoryOptions] (val x: Self) extends AnyVal {
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
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setMode(value: MeasureMemoryMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

