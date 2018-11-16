package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesSelectionSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISelectionOptions extends js.Object {
  var canSelectItem: js.UndefOr[
    js.Function2[
      /* item */ officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.IObjectWithKey, 
      /* index */ js.UndefOr[scala.Double], 
      scala.Boolean
    ]
  ] = js.undefined
  var getKey: js.UndefOr[
    js.Function2[
      /* item */ officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.IObjectWithKey, 
      /* index */ js.UndefOr[scala.Double], 
      java.lang.String | scala.Double
    ]
  ] = js.undefined
  var onSelectionChanged: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var selectionMode: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesSelectionInterfacesMod.SelectionMode
  ] = js.undefined
}

