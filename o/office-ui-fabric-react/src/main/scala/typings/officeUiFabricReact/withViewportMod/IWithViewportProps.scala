package typings.officeUiFabricReact.withViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWithViewportProps extends js.Object {
  /**
    * Whether or not to use ResizeObserver (if available) to detect
    * and measure viewport on 'resize' events.
    *
    * Falls back to window 'resize' event.
    *
    * @defaultValue false
    */
  var skipViewportMeasures: js.UndefOr[Boolean] = js.native
}

object IWithViewportProps {
  @scala.inline
  def apply(): IWithViewportProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWithViewportProps]
  }
  @scala.inline
  implicit class IWithViewportPropsOps[Self <: IWithViewportProps] (val x: Self) extends AnyVal {
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
    def setSkipViewportMeasures(value: Boolean): Self = this.set("skipViewportMeasures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipViewportMeasures: Self = this.set("skipViewportMeasures", js.undefined)
  }
  
}

