package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a match against all instances of given roles. */
trait DataViewRoleWildcard extends DataRepetitionSelector {
  var key: java.lang.String
  var kind: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataRepetitionKind
  var roles: js.Array[java.lang.String]
}

object DataViewRoleWildcard {
  @scala.inline
  def apply(
    key: java.lang.String,
    kind: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataRepetitionKind,
    roles: js.Array[java.lang.String]
  ): DataViewRoleWildcard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("roles")(roles)
    __obj.asInstanceOf[DataViewRoleWildcard]
  }
}

