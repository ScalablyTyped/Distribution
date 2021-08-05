package typings.officeJsPreview.Office

import typings.officeJsPreview.Office.MailboxEnums.CategoryColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a category's details like name and associated color.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait CategoryDetails extends StObject {
  
  /**
    * The color of the category.
    */
  var color: CategoryColor | String
  
  /**
    * The name of the category. Maximum length is 255 characters.
    */
  var displayName: String
}
object CategoryDetails {
  
  inline def apply(color: CategoryColor | String, displayName: String): CategoryDetails = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryDetails]
  }
  
  extension [Self <: CategoryDetails](x: Self) {
    
    inline def setColor(value: CategoryColor | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
