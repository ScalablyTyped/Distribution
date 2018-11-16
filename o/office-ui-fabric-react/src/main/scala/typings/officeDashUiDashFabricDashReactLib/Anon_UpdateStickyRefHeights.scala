package typings
package officeDashUiDashFabricDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_UpdateStickyRefHeights extends js.Object {
  var addSticky: js.Function1[/* sticky */ officeDashUiDashFabricDashReactLib.libStickyMod.Sticky, scala.Unit]
  var notifySubscribers: js.Function1[/* sort */ js.UndefOr[scala.Boolean], scala.Unit]
  var removeSticky: js.Function1[/* sticky */ officeDashUiDashFabricDashReactLib.libStickyMod.Sticky, scala.Unit]
  var sortSticky: js.Function1[/* sticky */ officeDashUiDashFabricDashReactLib.libStickyMod.Sticky, scala.Unit]
  var subscribe: js.Function1[
    /* handler */ js.Function2[
      /* container */ reactLib.HTMLElement, 
      /* stickyContainer */ reactLib.HTMLElement, 
      scala.Unit
    ], 
    scala.Unit
  ]
  var unsubscribe: js.Function1[
    /* handler */ js.Function2[
      /* container */ reactLib.HTMLElement, 
      /* stickyContainer */ reactLib.HTMLElement, 
      scala.Unit
    ], 
    scala.Unit
  ]
  var updateStickyRefHeights: js.Function0[scala.Unit]
}

