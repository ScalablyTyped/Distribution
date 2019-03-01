package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InsertedId extends js.Object {
  var insertedId: js.UndefOr[java.lang.String] = js.undefined
  var numberAffected: js.UndefOr[scala.Double] = js.undefined
}

object Anon_InsertedId {
  @scala.inline
  def apply(insertedId: java.lang.String = null, numberAffected: scala.Int | scala.Double = null): Anon_InsertedId = {
    val __obj = js.Dynamic.literal()
    if (insertedId != null) __obj.updateDynamic("insertedId")(insertedId)
    if (numberAffected != null) __obj.updateDynamic("numberAffected")(numberAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InsertedId]
  }
}

