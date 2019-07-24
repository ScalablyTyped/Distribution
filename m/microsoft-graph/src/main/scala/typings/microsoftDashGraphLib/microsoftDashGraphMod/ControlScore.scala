package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlScore extends js.Object {
  // Control action category (Identity, Data, Device, Apps, Infrastructure).
  var controlCategory: js.UndefOr[java.lang.String] = js.undefined
  // Control unique name.
  var controlName: js.UndefOr[java.lang.String] = js.undefined
  // Description of the control.
  var description: js.UndefOr[java.lang.String] = js.undefined
  // Tenant achieved score for the control (it varies day by day depending on tenant operations on the control).
  var score: js.UndefOr[scala.Double] = js.undefined
}

object ControlScore {
  @scala.inline
  def apply(
    controlCategory: java.lang.String = null,
    controlName: java.lang.String = null,
    description: java.lang.String = null,
    score: scala.Int | scala.Double = null
  ): ControlScore = {
    val __obj = js.Dynamic.literal()
    if (controlCategory != null) __obj.updateDynamic("controlCategory")(controlCategory)
    if (controlName != null) __obj.updateDynamic("controlName")(controlName)
    if (description != null) __obj.updateDynamic("description")(description)
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlScore]
  }
}

