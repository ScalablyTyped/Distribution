package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a category's details like name and associated color.
  *
  * [Api set: Mailbox Preview]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  * 
  * @beta
  */
trait CategoryDetails extends js.Object {
  /**
    * The color of the category.
    */
  var color: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.CategoryColor | java.lang.String
  /**
    * The name of the category. Maximum length is 255 characters.
    */
  var displayName: java.lang.String
}

object CategoryDetails {
  @scala.inline
  def apply(
    color: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.CategoryColor | java.lang.String,
    displayName: java.lang.String
  ): CategoryDetails = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], displayName = displayName)
  
    __obj.asInstanceOf[CategoryDetails]
  }
}

