package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermsAndConditions extends Entity {
  /**
    * Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms and conditions set out in the T&amp;C policy.
    * This is shown to the user on prompts to accept the T&amp;C policy.
    */
  var acceptanceStatement: js.UndefOr[java.lang.String] = js.undefined
  /** The list of acceptance statuses for this T&amp;C policy. */
  var acceptanceStatuses: js.UndefOr[js.Array[TermsAndConditionsAcceptanceStatus]] = js.undefined
  /** The list of assignments for this T&amp;C policy. */
  var assignments: js.UndefOr[js.Array[TermsAndConditionsAssignment]] = js.undefined
  /** Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user on prompts to accept the T&amp;C policy. */
  var bodyText: js.UndefOr[java.lang.String] = js.undefined
  /** DateTime the object was created. */
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Administrator-supplied description of the T&amp;C policy. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Administrator-supplied name for the T&amp;C policy. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** DateTime the object was last modified. */
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&amp;C policy. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Integer indicating the current version of the terms. Incremented when an administrator makes a change to the terms and wishes to require users to re-accept the modified T&amp;C policy. */
  var version: js.UndefOr[scala.Double] = js.undefined
}

object TermsAndConditions {
  @scala.inline
  def apply(
    acceptanceStatement: java.lang.String = null,
    acceptanceStatuses: js.Array[TermsAndConditionsAcceptanceStatus] = null,
    assignments: js.Array[TermsAndConditionsAssignment] = null,
    bodyText: java.lang.String = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    title: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): TermsAndConditions = {
    val __obj = js.Dynamic.literal()
    if (acceptanceStatement != null) __obj.updateDynamic("acceptanceStatement")(acceptanceStatement)
    if (acceptanceStatuses != null) __obj.updateDynamic("acceptanceStatuses")(acceptanceStatuses)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (bodyText != null) __obj.updateDynamic("bodyText")(bodyText)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (title != null) __obj.updateDynamic("title")(title)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermsAndConditions]
  }
}

