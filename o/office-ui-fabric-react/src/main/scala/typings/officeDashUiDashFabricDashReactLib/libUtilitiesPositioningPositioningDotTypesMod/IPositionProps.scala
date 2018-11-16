package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPositionProps extends js.Object {
  /**
       * If true the positioning logic will prefer flipping edges over nudging the rectangle to fit within bounds,
       * thus making sure the the element align perfectly with target.
       */
  var alignTargetEdge: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The bounding rectangle for which  the contextual menu can appear in.
       */
  var bounds: js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.undefined
  /**
       * If true the position returned will have the menu element cover the target.
       * If false then it will position next to the target;
       */
  var coverTarget: js.UndefOr[scala.Boolean] = js.undefined
  /** how the element should be positioned */
  var directionalHint: js.UndefOr[officeDashUiDashFabricDashReactLib.libCommonDirectionalHintMod.DirectionalHint] = js.undefined
  /**
       * If true the position will not change edges in an attempt to fit the rectangle within bounds.
       * It will still attempt to align it to whatever bounds are given.
       * @defaultvalue false
       */
  var directionalHintFixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * How the element should be positioned in RTL layouts.
       * If not specified, a mirror of `directionalHint` will be used instead
       */
  var directionalHintForRTL: js.UndefOr[officeDashUiDashFabricDashReactLib.libCommonDirectionalHintMod.DirectionalHint] = js.undefined
  /** The gap between the callout and the target */
  var gapSpace: js.UndefOr[scala.Double] = js.undefined
  var target: js.UndefOr[reactLib.Element | reactLib.MouseEvent | IPoint] = js.undefined
}

