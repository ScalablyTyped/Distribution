package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewKpiColumnMetadata extends js.Object {
  var graphic: java.lang.String
  // When false, five state KPIs are in: { -2, -1, 0, 1, 2 }.
  // When true, five state KPIs are in: { -1, -0.5, 0, 0.5, 1 }.
  var normalizedFiveStateKpiRange: js.UndefOr[scala.Boolean] = js.undefined
}

