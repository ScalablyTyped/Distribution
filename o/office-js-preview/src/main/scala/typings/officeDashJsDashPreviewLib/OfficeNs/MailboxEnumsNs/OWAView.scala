package typings
package officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OWAView extends js.Object

/**
         * Represents the current view of Outlook Web App.
         */
@JSGlobal("Office.MailboxEnums.OWAView")
@js.native
object OWAView extends js.Object {
  /**
               * One column view. Displayed when the screen is narrow. Outlook Web App uses this single-column layout on the entire screen of a smartphone.
               */
  @js.native
  sealed trait OneColumn
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.OWAView
  
  /**
               Three column view. Displayed when the screen is wide. For example, Outlook Web App uses this view in a full screen window on a desktop 
               computer.
               */
  @js.native
  sealed trait ThreeColumns
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.OWAView
  
  /**
               * Two column view. Displayed when the screen is wider. Outlook Web App uses this view on most tablets.
               */
  @js.native
  sealed trait TwoColumns
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.OWAView
  
  /* "OneColumn" */ val OneColumn: OneColumn with java.lang.String = js.native
  /* "ThreeColumns" */ val ThreeColumns: ThreeColumns with java.lang.String = js.native
  /* "TwoColumns" */ val TwoColumns: TwoColumns with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.OWAView with java.lang.String] = js.native
}

