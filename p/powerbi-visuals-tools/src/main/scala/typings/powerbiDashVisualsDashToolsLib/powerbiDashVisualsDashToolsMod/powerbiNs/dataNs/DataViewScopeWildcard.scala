package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a match against all instances of a given DataView scope. Does not match Subtotals. */
trait DataViewScopeWildcard extends DataRepetitionSelector {
  var exprs: js.Array[ISQExpr]
  var key: java.lang.String
  var kind: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataRepetitionKind
}

object DataViewScopeWildcard {
  @scala.inline
  def apply(
    exprs: js.Array[ISQExpr],
    key: java.lang.String,
    kind: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataRepetitionKind
  ): DataViewScopeWildcard = {
    val __obj = js.Dynamic.literal(exprs = exprs, key = key, kind = kind)
  
    __obj.asInstanceOf[DataViewScopeWildcard]
  }
}

