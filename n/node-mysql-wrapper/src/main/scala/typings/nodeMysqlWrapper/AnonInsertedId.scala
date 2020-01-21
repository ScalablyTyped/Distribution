package typings.nodeMysqlWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInsertedId extends js.Object {
  var insertedId: js.UndefOr[String] = js.undefined
  var numberAffected: js.UndefOr[Double] = js.undefined
}

object AnonInsertedId {
  @scala.inline
  def apply(insertedId: String = null, numberAffected: Int | Double = null): AnonInsertedId = {
    val __obj = js.Dynamic.literal()
    if (insertedId != null) __obj.updateDynamic("insertedId")(insertedId.asInstanceOf[js.Any])
    if (numberAffected != null) __obj.updateDynamic("numberAffected")(numberAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInsertedId]
  }
}

