package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadcastOptions extends js.Object {
  var layout: BroadcastLayoutOptions = js.native
  var maxDuration: js.UndefOr[Double] = js.native
  var outputs: BroadcastOutputOptions = js.native
  var resolution: js.UndefOr[String] = js.native
}

object BroadcastOptions {
  @scala.inline
  def apply(layout: BroadcastLayoutOptions, outputs: BroadcastOutputOptions): BroadcastOptions = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastOptions]
  }
  @scala.inline
  implicit class BroadcastOptionsOps[Self <: BroadcastOptions] (val x: Self) extends AnyVal {
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
    def setLayout(value: BroadcastLayoutOptions): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputs(value: BroadcastOutputOptions): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDuration(value: Double): Self = this.set("maxDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDuration: Self = this.set("maxDuration", js.undefined)
    @scala.inline
    def setResolution(value: String): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
  }
  
}

