package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionDiff extends js.Object {
  var missing: js.UndefOr[js.Array[String]] = js.native
  var possible_ancestors: js.UndefOr[js.Array[String]] = js.native
}

object RevisionDiff {
  @scala.inline
  def apply(): RevisionDiff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionDiff]
  }
  @scala.inline
  implicit class RevisionDiffOps[Self <: RevisionDiff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMissingVarargs(value: String*): Self = this.set("missing", js.Array(value :_*))
    @scala.inline
    def setMissing(value: js.Array[String]): Self = this.set("missing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissing: Self = this.set("missing", js.undefined)
    @scala.inline
    def setPossible_ancestorsVarargs(value: String*): Self = this.set("possible_ancestors", js.Array(value :_*))
    @scala.inline
    def setPossible_ancestors(value: js.Array[String]): Self = this.set("possible_ancestors", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePossible_ancestors: Self = this.set("possible_ancestors", js.undefined)
  }
  
}

