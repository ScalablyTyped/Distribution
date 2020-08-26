package typings.naverWhale.whale.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  /** List of actions that are triggered if one of the condtions is fulfilled. */
  var actions: js.Array[_] = js.native
  /** List of conditions that can trigger the actions. */
  var conditions: js.Array[_] = js.native
  /** Optional. Optional identifier that allows referencing this rule.  */
  var id: js.UndefOr[String] = js.native
  /** Optional. Optional priority of this rule. Defaults to 100.  */
  var priority: js.UndefOr[Double] = js.native
  /**
    * Optional.
    * Since Chrome 28.
    * Tags can be used to annotate rules and perform operations on sets of rules.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object Rule {
  @scala.inline
  def apply(actions: js.Array[_], conditions: js.Array[_]): Rule = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: js.Any*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[_]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionsVarargs(value: js.Any*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[_]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

