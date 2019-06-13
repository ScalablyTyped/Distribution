package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonType extends js.Object {
  /** The type of data source, such as Person. */
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  /** The secondary type of data source, such as OrganizationUser. */
  var subclass: js.UndefOr[java.lang.String] = js.undefined
}

object PersonType {
  @scala.inline
  def apply(`class`: java.lang.String = null, subclass: java.lang.String = null): PersonType = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (subclass != null) __obj.updateDynamic("subclass")(subclass)
    __obj.asInstanceOf[PersonType]
  }
}

