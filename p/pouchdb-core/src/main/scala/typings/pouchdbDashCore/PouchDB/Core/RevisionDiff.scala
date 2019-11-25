package typings.pouchdbDashCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionDiff extends js.Object {
  var missing: js.UndefOr[js.Array[String]] = js.undefined
  var possible_ancestors: js.UndefOr[js.Array[String]] = js.undefined
}

object RevisionDiff {
  @scala.inline
  def apply(missing: js.Array[String] = null, possible_ancestors: js.Array[String] = null): RevisionDiff = {
    val __obj = js.Dynamic.literal()
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    if (possible_ancestors != null) __obj.updateDynamic("possible_ancestors")(possible_ancestors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionDiff]
  }
}

