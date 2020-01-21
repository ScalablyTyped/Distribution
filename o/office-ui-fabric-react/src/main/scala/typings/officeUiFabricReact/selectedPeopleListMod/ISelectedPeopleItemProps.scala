package typings.officeUiFabricReact.selectedPeopleListMod

import typings.officeUiFabricReact.baseSelectedItemsListTypesMod.ISelectedItemProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.react.mod._Global_.JSX.Element
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectedPeopleItemProps extends ISelectedItemProps[IExtendedPersonaProps] {
  var onExpandItem: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderPersonaCoin: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  var renderPrimaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
}

object ISelectedPeopleItemProps {
  @scala.inline
  def apply(
    ISelectedItemProps: ISelectedItemProps[IExtendedPersonaProps],
    onExpandItem: () => Unit = null,
    renderPersonaCoin: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null = null,
    renderPrimaryText: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null = null
  ): ISelectedPeopleItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISelectedItemProps)
    if (onExpandItem != null) __obj.updateDynamic("onExpandItem")(js.Any.fromFunction0(onExpandItem))
    if (renderPersonaCoin != null) __obj.updateDynamic("renderPersonaCoin")(js.Any.fromFunction2(renderPersonaCoin))
    if (renderPrimaryText != null) __obj.updateDynamic("renderPrimaryText")(js.Any.fromFunction2(renderPrimaryText))
    __obj.asInstanceOf[ISelectedPeopleItemProps]
  }
}

