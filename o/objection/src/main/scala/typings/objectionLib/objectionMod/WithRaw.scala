package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithRaw[QM /* <: Model */, RM, RV] extends js.Object {
  var join: knexLib.knexMod.JoinClause = js.native
  def apply(alias: java.lang.String, raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def apply(alias: java.lang.String, sql: java.lang.String): QueryBuilder[QM, RM, RV] = js.native
  def apply(alias: java.lang.String, sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
}

