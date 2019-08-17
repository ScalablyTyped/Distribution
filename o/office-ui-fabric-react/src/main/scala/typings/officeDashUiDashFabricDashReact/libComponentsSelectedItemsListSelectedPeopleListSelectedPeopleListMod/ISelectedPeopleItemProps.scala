package typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod

import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod.ISelectedItemProps
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
    ISelectedItemProps: ISelectedItemProps[IExtendedPersonaProps] = null,
    onExpandItem: () => Unit = null,
    renderPersonaCoin: IRenderFunction[IPersonaProps] = null,
    renderPrimaryText: IRenderFunction[IPersonaProps] = null
  ): ISelectedPeopleItemProps = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ISelectedItemProps)
    if (onExpandItem != null) __obj.updateDynamic("onExpandItem")(js.Any.fromFunction0(onExpandItem))
    if (renderPersonaCoin != null) __obj.updateDynamic("renderPersonaCoin")(renderPersonaCoin)
    if (renderPrimaryText != null) __obj.updateDynamic("renderPrimaryText")(renderPrimaryText)
    __obj.asInstanceOf[ISelectedPeopleItemProps]
  }
}

