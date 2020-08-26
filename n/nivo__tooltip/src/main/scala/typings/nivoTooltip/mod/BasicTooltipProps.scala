package typings.nivoTooltip.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicTooltipProps extends js.Object {
  var color: String = js.native
  var enableChip: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[js.Function1[/* value */ Double | String, Double | String]] = js.native
  var id: ReactNode = js.native
  var renderContent: js.UndefOr[js.Function0[ReactNode]] = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object BasicTooltipProps {
  @scala.inline
  def apply(color: String): BasicTooltipProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicTooltipProps]
  }
  @scala.inline
  implicit class BasicTooltipPropsOps[Self <: BasicTooltipProps] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableChip(value: Boolean): Self = this.set("enableChip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableChip: Self = this.set("enableChip", js.undefined)
    @scala.inline
    def setFormat(value: /* value */ Double | String => Double | String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setId(value: ReactNode): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setRenderContent(value: () => ReactNode): Self = this.set("renderContent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderContent: Self = this.set("renderContent", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

