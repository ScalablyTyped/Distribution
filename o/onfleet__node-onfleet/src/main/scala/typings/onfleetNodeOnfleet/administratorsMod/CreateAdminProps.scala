package typings.onfleetNodeOnfleet.administratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @prop email - The administrator’s complete name.
  * @prop name - The administrator’s email address.
  * @prop phone - Optional. The administrator's phone number.
  * @prop isReadOnly - Optional. Whether this administrator can perform write operations.
  */
trait CreateAdminProps extends js.Object {
  var email: String
  var isReadOnly: js.UndefOr[Boolean] = js.undefined
  var name: String
  var phone: js.UndefOr[String] = js.undefined
}

object CreateAdminProps {
  @scala.inline
  def apply(email: String, name: String, isReadOnly: js.UndefOr[Boolean] = js.undefined, phone: String = null): CreateAdminProps = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(isReadOnly)) __obj.updateDynamic("isReadOnly")(isReadOnly.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAdminProps]
  }
}

