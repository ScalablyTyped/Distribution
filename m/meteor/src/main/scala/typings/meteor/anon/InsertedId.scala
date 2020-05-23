package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertedId extends js.Object {
  var insertedId: js.UndefOr[String] = js.undefined
  var numberAffected: js.UndefOr[Double] = js.undefined
}

object InsertedId {
  @scala.inline
  def apply(insertedId: String = null, numberAffected: js.UndefOr[Double] = js.undefined): InsertedId = {
    val __obj = js.Dynamic.literal()
    if (insertedId != null) __obj.updateDynamic("insertedId")(insertedId.asInstanceOf[js.Any])
    if (!js.isUndefined(numberAffected)) __obj.updateDynamic("numberAffected")(numberAffected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertedId]
  }
}

