package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardActivityDotTypesMod

import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.PersonaInitialsColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardActivityPerson extends js.Object {
  /**
    * Whether initials are calculated for phone numbers and number sequences.
    * Example: Set property to true to get initials for project names consisting of numbers only.
    * @defaultvalue false
    */
  var allowPhoneInitials: js.UndefOr[Boolean] = js.undefined
  /**
    * The user's initials to display in the profile photo area when there is no image.
    */
  var initials: js.UndefOr[String] = js.undefined
  /**
    * The background color when the user's initials are displayed.
    * @defaultvalue PersonaInitialsColor.blue
    */
  var initialsColor: js.UndefOr[PersonaInitialsColor] = js.undefined
  /**
    * The name of the person.
    */
  var name: String
  /**
    * Path to the profile photo of the person.
    */
  var profileImageSrc: String
}

object IDocumentCardActivityPerson {
  @scala.inline
  def apply(
    name: String,
    profileImageSrc: String,
    allowPhoneInitials: js.UndefOr[Boolean] = js.undefined,
    initials: String = null,
    initialsColor: PersonaInitialsColor = null
  ): IDocumentCardActivityPerson = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profileImageSrc = profileImageSrc.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPhoneInitials)) __obj.updateDynamic("allowPhoneInitials")(allowPhoneInitials.asInstanceOf[js.Any])
    if (initials != null) __obj.updateDynamic("initials")(initials.asInstanceOf[js.Any])
    if (initialsColor != null) __obj.updateDynamic("initialsColor")(initialsColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardActivityPerson]
  }
}

