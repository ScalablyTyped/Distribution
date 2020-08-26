package typings.officeUiFabricReact.detailsListTypesMod

import typings.officeUiFabricReact.groupedListTypesMod.IGroupRenderProps
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsGroupRenderProps extends IGroupRenderProps {
  @JSName("onRenderFooter")
  var onRenderFooter_IDetailsGroupRenderProps: js.UndefOr[IRenderFunction[IDetailsGroupDividerProps]] = js.native
  @JSName("onRenderHeader")
  var onRenderHeader_IDetailsGroupRenderProps: js.UndefOr[IRenderFunction[IDetailsGroupDividerProps]] = js.native
}

object IDetailsGroupRenderProps {
  @scala.inline
  def apply(): IDetailsGroupRenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsGroupRenderProps]
  }
  @scala.inline
  implicit class IDetailsGroupRenderPropsOps[Self <: IDetailsGroupRenderProps] (val x: Self) extends AnyVal {
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
    def setOnRenderFooter(
      value: (/* props */ js.UndefOr[IDetailsGroupDividerProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsGroupDividerProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderFooter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderFooter: Self = this.set("onRenderFooter", js.undefined)
    @scala.inline
    def setOnRenderHeader(
      value: (/* props */ js.UndefOr[IDetailsGroupDividerProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsGroupDividerProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderHeader", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderHeader: Self = this.set("onRenderHeader", js.undefined)
  }
  
}

