package typings.openfin.contextMod

import typings.openfin.anon.Dictkey
import typings.openfin.openfinStrings.fdc3Dotcontact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactContext extends Context {
  /**
    * The contact data. Can contain some or all of:
    * * `email`: Email address
    * * `twitter`: Twitter handle
    * * `phone`: Phone number
    */
  @JSName("id")
  var id_ContactContext: Dictkey = js.native
  /**
    * Free text name of the contact.
    */
  @JSName("name")
  var name_ContactContext: String = js.native
  /**
    * The context type is always 'fdc3.contact'.
    */
  @JSName("type")
  var type_ContactContext: fdc3Dotcontact = js.native
}

object ContactContext {
  @scala.inline
  def apply(id: Dictkey, name: String, `type`: fdc3Dotcontact): ContactContext = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactContext]
  }
  @scala.inline
  implicit class ContactContextOps[Self <: ContactContext] (val x: Self) extends AnyVal {
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
    def setId(value: Dictkey): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: fdc3Dotcontact): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

