package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a match against any Total within a given DataView scope. */
trait DataViewScopeTotal extends js.Object {
  /* The exprs defining the scope that this Total has been evaluated for
    * It's an array to support expressing Total across a composite group
    * Example: If this represents Total sales of USA across States, the Exprs wil refer to "States"
    */
  var exprs: js.Array[ISQExpr]
  var key: java.lang.String
  var kind: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataRepetitionKind
}

