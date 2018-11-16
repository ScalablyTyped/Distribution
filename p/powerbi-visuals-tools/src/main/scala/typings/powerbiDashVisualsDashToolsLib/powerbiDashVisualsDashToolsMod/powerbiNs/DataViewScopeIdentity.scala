package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the identity of a data scope in a DataView. */

trait DataViewScopeIdentity extends js.Object {
  /** Predicate expression that identifies the scope. */
  var expr: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr
  /** Key string that identifies the DataViewScopeIdentity to a string, which can be used for equality comparison. */
  var key: java.lang.String
  var kind: DataRepetitionKind
}

