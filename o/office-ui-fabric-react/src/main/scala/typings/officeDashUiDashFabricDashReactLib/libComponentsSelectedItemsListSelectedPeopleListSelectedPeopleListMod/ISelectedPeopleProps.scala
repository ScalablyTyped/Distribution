package typings
package officeDashUiDashFabricDashReactLib.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectedPeopleProps
  extends officeDashUiDashFabricDashReactLib.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod.IBaseSelectedItemsListProps[IExtendedPersonaProps] {
  var copyMenuItemText: js.UndefOr[java.lang.String] = js.undefined
  var editMenuItemText: js.UndefOr[java.lang.String] = js.undefined
  var floatingPickerProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPickerProps[
      officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
    ]
  ] = js.undefined
  var getEditingItemText: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, java.lang.String]] = js.undefined
  var onExpandGroup: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, scala.Unit]] = js.undefined
  var onRenderFloatingPicker: js.UndefOr[
    js.Function1[
      /* props */ officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPickerProps[
        officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
      ], 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var removeMenuItemText: js.UndefOr[java.lang.String] = js.undefined
}

