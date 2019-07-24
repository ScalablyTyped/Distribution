package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemVersion extends BaseItemVersion {
  // A collection of the fields and values for this version of the list item.
  var fields: js.UndefOr[FieldValueSet] = js.undefined
}

object ListItemVersion {
  @scala.inline
  def apply(
    fields: FieldValueSet = null,
    id: java.lang.String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: java.lang.String = null,
    publication: PublicationFacet = null
  ): ListItemVersion = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (publication != null) __obj.updateDynamic("publication")(publication)
    __obj.asInstanceOf[ListItemVersion]
  }
}

