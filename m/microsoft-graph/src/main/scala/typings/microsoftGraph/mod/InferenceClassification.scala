package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceClassification extends Entity {
  /**
    * A set of overrides for a user to always classify messages from specific senders in certain ways: focused, or other.
    * Read-only. Nullable.
    */
  var overrides: js.UndefOr[js.Array[InferenceClassificationOverride]] = js.native
}

object InferenceClassification {
  @scala.inline
  def apply(): InferenceClassification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceClassification]
  }
  @scala.inline
  implicit class InferenceClassificationOps[Self <: InferenceClassification] (val x: Self) extends AnyVal {
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
    def setOverridesVarargs(value: InferenceClassificationOverride*): Self = this.set("overrides", js.Array(value :_*))
    @scala.inline
    def setOverrides(value: js.Array[InferenceClassificationOverride]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
  
}

