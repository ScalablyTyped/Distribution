package typings.onfleetNodeOnfleet.organizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delegatee extends js.Object {
  var country: String = js.native
  var email: String = js.native
  var id: String = js.native
  var name: String = js.native
  var timezone: String = js.native
}

object Delegatee {
  @scala.inline
  def apply(country: String, email: String, id: String, name: String, timezone: String): Delegatee = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delegatee]
  }
  @scala.inline
  implicit class DelegateeOps[Self <: Delegatee] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
  }
  
}

