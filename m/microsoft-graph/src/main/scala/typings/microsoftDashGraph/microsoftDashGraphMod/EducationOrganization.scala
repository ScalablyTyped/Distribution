package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EducationOrganization extends Entity {
  // Organization description.
  var description: js.UndefOr[String] = js.undefined
  // Organization display name.
  var displayName: js.UndefOr[String] = js.undefined
  // Source where this organization was created from. The possible values are: sis, manual, unknownFutureValue.
  var externalSource: js.UndefOr[EducationExternalSource] = js.undefined
}

object EducationOrganization {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    externalSource: EducationExternalSource = null,
    id: String = null
  ): EducationOrganization = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (externalSource != null) __obj.updateDynamic("externalSource")(externalSource)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[EducationOrganization]
  }
}

