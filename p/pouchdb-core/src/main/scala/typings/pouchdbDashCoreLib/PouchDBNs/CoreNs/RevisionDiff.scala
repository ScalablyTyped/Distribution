package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionDiff extends js.Object {
  var missing: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var possible_ancestors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RevisionDiff {
  @scala.inline
  def apply(missing: js.Array[java.lang.String] = null, possible_ancestors: js.Array[java.lang.String] = null): RevisionDiff = {
    val __obj = js.Dynamic.literal()
    if (missing != null) __obj.updateDynamic("missing")(missing)
    if (possible_ancestors != null) __obj.updateDynamic("possible_ancestors")(possible_ancestors)
    __obj.asInstanceOf[RevisionDiff]
  }
}

