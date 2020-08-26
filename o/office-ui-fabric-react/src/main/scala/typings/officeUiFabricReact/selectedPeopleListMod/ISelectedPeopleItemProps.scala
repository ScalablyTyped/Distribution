package typings.officeUiFabricReact.selectedPeopleListMod

import typings.officeUiFabricReact.baseSelectedItemsListTypesMod.ISelectedItemProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectedPeopleItemProps extends ISelectedItemProps[IExtendedPersonaProps] {
  var onExpandItem: js.UndefOr[js.Function0[Unit]] = js.native
  var renderPersonaCoin: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
  var renderPrimaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
}

object ISelectedPeopleItemProps {
  @scala.inline
  def apply(ISelectedItemProps: ISelectedItemProps[IExtendedPersonaProps]): ISelectedPeopleItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISelectedItemProps)
    __obj.asInstanceOf[ISelectedPeopleItemProps]
  }
  @scala.inline
  implicit class ISelectedPeopleItemPropsOps[Self <: ISelectedPeopleItemProps] (val x: Self) extends AnyVal {
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
    def setOnExpandItem(value: () => Unit): Self = this.set("onExpandItem", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnExpandItem: Self = this.set("onExpandItem", js.undefined)
    @scala.inline
    def setRenderPersonaCoin(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = this.set("renderPersonaCoin", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderPersonaCoin: Self = this.set("renderPersonaCoin", js.undefined)
    @scala.inline
    def setRenderPrimaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = this.set("renderPrimaryText", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderPrimaryText: Self = this.set("renderPrimaryText", js.undefined)
  }
  
}

