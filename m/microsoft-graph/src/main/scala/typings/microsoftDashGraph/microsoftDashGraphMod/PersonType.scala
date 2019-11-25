package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonType extends js.Object {
  // The type of data source, such as Person.
  var `class`: js.UndefOr[String] = js.undefined
  // The secondary type of data source, such as OrganizationUser.
  var subclass: js.UndefOr[String] = js.undefined
}

object PersonType {
  @scala.inline
  def apply(`class`: String = null, subclass: String = null): PersonType = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (subclass != null) __obj.updateDynamic("subclass")(subclass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonType]
  }
}

