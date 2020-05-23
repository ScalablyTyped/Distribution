package typings.openfin.contextMod

import typings.openfin.anon.Dictkey
import typings.openfin.openfinStrings.fdc3Dotcontact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactContext extends Context {
  /**
    * The contact data. Can contain some or all of:
    * * `email`: Email address
    * * `twitter`: Twitter handle
    * * `phone`: Phone number
    */
  @JSName("id")
  var id_ContactContext: Dictkey
  /**
    * Free text name of the contact.
    */
  @JSName("name")
  var name_ContactContext: String
  /**
    * The context type is always 'fdc3.contact'.
    */
  @JSName("type")
  var type_ContactContext: fdc3Dotcontact
}

object ContactContext {
  @scala.inline
  def apply(id: Dictkey, name: String, `type`: fdc3Dotcontact): ContactContext = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactContext]
  }
}

