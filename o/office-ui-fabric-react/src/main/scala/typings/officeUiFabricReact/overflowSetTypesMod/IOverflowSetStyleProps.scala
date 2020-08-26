package typings.officeUiFabricReact.overflowSetTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/OverflowSet/OverflowSet.types.IOverflowSetProps, 'vertical' | 'className'> */
@js.native
trait IOverflowSetStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object IOverflowSetStyleProps {
  @scala.inline
  def apply(): IOverflowSetStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverflowSetStyleProps]
  }
  @scala.inline
  implicit class IOverflowSetStylePropsOps[Self <: IOverflowSetStyleProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

