package typings
package officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICommandBarData extends js.Object {
  /**
       * Unique string used to cache the width of the command bar
       */
  var cacheKey: java.lang.String
  /**
       * Items being rendered on the far side
       */
  var farItems: js.UndefOr[
    js.Array[
      officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotTypesMod.ICommandBarItemProps
    ]
  ]
  /**
       * Length of original overflowItems to ensure that they are not moved into primary region on resize
       */
  var minimumOverflowItems: scala.Double
  /**
       * Items being rendered in the overflow
       */
  var overflowItems: js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotTypesMod.ICommandBarItemProps
  ]
  /**
       * Items being rendered in the primary region
       */
  var primaryItems: js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotTypesMod.ICommandBarItemProps
  ]
}

