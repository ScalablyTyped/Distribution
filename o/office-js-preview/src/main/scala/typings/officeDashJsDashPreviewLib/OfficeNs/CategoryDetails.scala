package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an item's category details like name and associated color.
  *
  * [Api set: Mailbox Preview]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
  * </table>
  * 
  * @beta
  */
trait CategoryDetails extends js.Object {
  /**
    * The color of the category.
    */
  var color: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.CategoryColor
  /**
    * The name of the category. Maximum length is 255 characters.
    */
  var displayName: java.lang.String
}

object CategoryDetails {
  @scala.inline
  def apply(
    color: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.CategoryColor,
    displayName: java.lang.String
  ): CategoryDetails = {
    val __obj = js.Dynamic.literal(color = color, displayName = displayName)
  
    __obj.asInstanceOf[CategoryDetails]
  }
}

