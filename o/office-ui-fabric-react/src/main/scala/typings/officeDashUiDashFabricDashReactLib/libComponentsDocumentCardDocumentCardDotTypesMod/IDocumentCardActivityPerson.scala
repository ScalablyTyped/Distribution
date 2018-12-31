package typings
package officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardActivityPerson extends js.Object {
  /**
    * Whether initials are calculated for phone numbers and number sequences.
    * Example: Set property to true to get initials for project names consisting of numbers only.
    * @defaultvalue false
    */
  var allowPhoneInitials: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The user's initials to display in the profile photo area when there is no image.
    */
  var initials: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The background color when the user's initials are displayed.
    * @defaultvalue PersonaInitialsColor.blue
    */
  var initialsColor: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.PersonaInitialsColor
  ] = js.undefined
  /**
    * The name of the person.
    */
  var name: java.lang.String
  /**
    * Path to the profile photo of the person.
    */
  var profileImageSrc: java.lang.String
}

