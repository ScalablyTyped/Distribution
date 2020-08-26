package typings.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowChartConfig extends js.Object {
  /**
    * default: 'linear'
    */
  var curve: js.UndefOr[String] = js.native
  /**
    * **htmlLabels** - Flag for setting whether or not a html tag should be used for rendering labels
    * on the edges
    * default: true
    */
  var htmlLabels: js.UndefOr[Boolean] = js.native
}

object FlowChartConfig {
  @scala.inline
  def apply(): FlowChartConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowChartConfig]
  }
  @scala.inline
  implicit class FlowChartConfigOps[Self <: FlowChartConfig] (val x: Self) extends AnyVal {
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
    def setCurve(value: String): Self = this.set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurve: Self = this.set("curve", js.undefined)
    @scala.inline
    def setHtmlLabels(value: Boolean): Self = this.set("htmlLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlLabels: Self = this.set("htmlLabels", js.undefined)
  }
  
}

