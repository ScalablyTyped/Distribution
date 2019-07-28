package typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OWAView extends js.Object

/**
  * Represents the current view of Outlook on the web.
  */
@JSGlobal("Office.MailboxEnums.OWAView")
@js.native
object OWAView extends js.Object {
  /**
    * One column view. Displayed when the screen is narrow. Outlook on the web uses this single-column layout on the entire screen of a smartphone.
    */
  @js.native
  sealed trait OneColumn extends OWAView
  
  /**
    Three column view. Displayed when the screen is wide. For example, Outlook on the web uses this view in a full screen window on a desktop 
    computer.
    */
  @js.native
  sealed trait ThreeColumns extends OWAView
  
  /**
    * Two column view. Displayed when the screen is wider. Outlook on the web uses this view on most tablets.
    */
  @js.native
  sealed trait TwoColumns extends OWAView
  
  /* "OneColumn" */ val OneColumn: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.OWAView.OneColumn with String = js.native
  /* "ThreeColumns" */ val ThreeColumns: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.OWAView.ThreeColumns with String = js.native
  /* "TwoColumns" */ val TwoColumns: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.OWAView.TwoColumns with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OWAView with String] = js.native
}

