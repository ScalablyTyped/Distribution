package typings.officeDashJsDashPreview.OfficeNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.officeThemeChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfficeThemeChangedEventArgs extends js.Object {
  /** 
    * Gets the updated Office theme. 
    * 
    * [Api set: Mailbox Preview] 
    */ 
  var officeTheme: OfficeTheme
  /** 
    * Gets the type of the event. See `Office.EventType` for details. 
    * 
    * [Api set: Mailbox Preview] 
    */ 
  var `type`: officeThemeChanged
}

object OfficeThemeChangedEventArgs {
  @scala.inline
  def apply(officeTheme: OfficeTheme, `type`: officeThemeChanged): OfficeThemeChangedEventArgs = {
    val __obj = js.Dynamic.literal(officeTheme = officeTheme)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OfficeThemeChangedEventArgs]
  }
}

