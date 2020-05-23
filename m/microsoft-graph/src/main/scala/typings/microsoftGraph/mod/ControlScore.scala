package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlScore extends js.Object {
  // Control action category (Identity, Data, Device, Apps, Infrastructure).
  var controlCategory: js.UndefOr[String] = js.undefined
  // Control unique name.
  var controlName: js.UndefOr[String] = js.undefined
  // Description of the control.
  var description: js.UndefOr[String] = js.undefined
  // Tenant achieved score for the control (it varies day by day depending on tenant operations on the control).
  var score: js.UndefOr[Double] = js.undefined
}

object ControlScore {
  @scala.inline
  def apply(
    controlCategory: String = null,
    controlName: String = null,
    description: String = null,
    score: js.UndefOr[Double] = js.undefined
  ): ControlScore = {
    val __obj = js.Dynamic.literal()
    if (controlCategory != null) __obj.updateDynamic("controlCategory")(controlCategory.asInstanceOf[js.Any])
    if (controlName != null) __obj.updateDynamic("controlName")(controlName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlScore]
  }
}

