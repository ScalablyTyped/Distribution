package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a match against any Total within a given DataView scope. */
trait DataViewScopeTotal extends DataRepetitionSelector {
  /* The exprs defining the scope that this Total has been evaluated for
    * It's an array to support expressing Total across a composite group
    * Example: If this represents Total sales of USA across States, the Exprs wil refer to "States"
    */
  var exprs: js.Array[ISQExpr]
  var key: java.lang.String
  var kind: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataRepetitionKind
}

object DataViewScopeTotal {
  @scala.inline
  def apply(
    exprs: js.Array[ISQExpr],
    key: java.lang.String,
    kind: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataRepetitionKind
  ): DataViewScopeTotal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exprs")(exprs)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DataViewScopeTotal]
  }
}

