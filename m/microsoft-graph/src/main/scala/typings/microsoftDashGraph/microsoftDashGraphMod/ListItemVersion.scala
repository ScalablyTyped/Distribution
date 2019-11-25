package typings.microsoftDashGraph.microsoftDashGraphMod

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
    id: String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: String = null,
    publication: PublicationFacet = null
  ): ListItemVersion = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (publication != null) __obj.updateDynamic("publication")(publication.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemVersion]
  }
}

