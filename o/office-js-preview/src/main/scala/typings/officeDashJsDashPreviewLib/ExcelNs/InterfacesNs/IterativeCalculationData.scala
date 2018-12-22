package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "iterativeCalculation.toJSON()". */

trait IterativeCalculationData extends js.Object {
  /**
               *
               * True if Excel will use iteration to resolve circular references.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns or sets the maximum amount of change between each iteration as Excel resolves circular references.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var maxChange: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Returns or sets the maximum number of iterations that Excel can use to resolve a circular reference.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var maxIteration: js.UndefOr[scala.Double] = js.undefined
}

