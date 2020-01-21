package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseItemVersion extends Entity {
  // Identity of the user which last modified the version. Read-only.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.undefined
  // Date and time the version was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // Indicates the publication status of this particular version. Read-only.
  var publication: js.UndefOr[PublicationFacet] = js.undefined
}

object BaseItemVersion {
  @scala.inline
  def apply(
    id: String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: String = null,
    publication: PublicationFacet = null
  ): BaseItemVersion = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (publication != null) __obj.updateDynamic("publication")(publication.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseItemVersion]
  }
}

