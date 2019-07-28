package typings.nodeDashMysqlDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InsertedId extends js.Object {
  var insertedId: js.UndefOr[String] = js.undefined
  var numberAffected: js.UndefOr[Double] = js.undefined
}

object Anon_InsertedId {
  @scala.inline
  def apply(insertedId: String = null, numberAffected: Int | Double = null): Anon_InsertedId = {
    val __obj = js.Dynamic.literal()
    if (insertedId != null) __obj.updateDynamic("insertedId")(insertedId)
    if (numberAffected != null) __obj.updateDynamic("numberAffected")(numberAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InsertedId]
  }
}

