package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the identity of a data scope in a DataView. */
trait DataViewScopeIdentity
  extends powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.DataRepetitionSelector {
  /** Predicate expression that identifies the scope. */
  var expr: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr
  /** Key string that identifies the DataViewScopeIdentity to a string, which can be used for equality comparison. */
  var key: java.lang.String
  var kind: DataRepetitionKind
}

object DataViewScopeIdentity {
  @scala.inline
  def apply(
    expr: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr,
    key: java.lang.String,
    kind: DataRepetitionKind
  ): DataViewScopeIdentity = {
    val __obj = js.Dynamic.literal(expr = expr, key = key, kind = kind)
  
    __obj.asInstanceOf[DataViewScopeIdentity]
  }
}

