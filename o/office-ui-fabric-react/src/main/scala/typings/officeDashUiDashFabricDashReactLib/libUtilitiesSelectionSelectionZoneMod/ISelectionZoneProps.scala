package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesSelectionSelectionZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISelectionZoneProps
  extends reactLib.reactMod.ReactNs.Props[SelectionZone] {
  var componentRef: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var disableAutoSelectOnInputElements: js.UndefOr[scala.Boolean] = js.undefined
  var enterModalOnTouch: js.UndefOr[scala.Boolean] = js.undefined
  var isSelectedOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * @deprecated No longer in use, focus is now managed by FocusZone
       */
  var layout: js.UndefOr[js.Object] = js.undefined
  var onItemContextMenu: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[scala.Double], 
      /* ev */ js.UndefOr[reactLib.Event], 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  var onItemInvoked: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[
        officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.IObjectWithKey
      ], 
      /* index */ js.UndefOr[scala.Double], 
      /* ev */ js.UndefOr[reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var selection: officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.ISelection
  var selectionMode: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.SelectionMode
  ] = js.undefined
  var selectionPreservedOnEmptyClick: js.UndefOr[scala.Boolean] = js.undefined
}

