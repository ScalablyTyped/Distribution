package typings.openfin.contextMod

import typings.openfin.anon.LEI
import typings.openfin.openfinStrings.fdc3Dotorganization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationContext extends Context {
  /**
    * The organization data. Can contain either or both
    * * `LEI`: [LEI](https://www.gleif.org/en/about-lei/introducing-the-legal-entity-identifier-lei)
    * * `PERMID`: [PERMID](https://permid.org/)
    */
  @JSName("id")
  var id_OrganizationContext: LEI
  /**
    * The context type is always fdc3.organization.
    */
  @JSName("type")
  var type_OrganizationContext: fdc3Dotorganization
}

object OrganizationContext {
  @scala.inline
  def apply(id: LEI, `type`: fdc3Dotorganization, name: String = null): OrganizationContext = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationContext]
  }
}

