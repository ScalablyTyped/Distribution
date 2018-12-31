package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullColoringStrategyGeneric[TStrategy, TColor] extends js.Object {
  /**
    * Only used if strategy is specificColor
    */
  var color: js.UndefOr[TColor] = js.undefined
  var strategy: TStrategy
}

