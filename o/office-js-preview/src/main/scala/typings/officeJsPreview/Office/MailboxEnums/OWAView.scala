package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OWAView extends StObject
/**
  * Represents the current view of Outlook on the web.
  */
@JSGlobal("Office.MailboxEnums.OWAView")
@js.native
object OWAView extends StObject {
  
  /**
    * One-column view. Displayed when the screen width is greater than or equal to 436 pixels,
    * but less than 536 pixels. For example, Outlook on the web uses this view on the entire screen of newer smartphones.
    */
  @js.native
  sealed trait OneColumn
    extends StObject
       with OWAView
  
  /**
    * Narrow one-column view. Displayed when the screen width is less than 436 pixels.
    * For example, Outlook on the web uses this view on the entire screen of older smartphones.
    */
  @js.native
  sealed trait OneColumnNarrow
    extends StObject
       with OWAView
  
  /**
    * Three-column view. Displayed when the screen width is greater than or equal to 780 pixels.
    * For example, Outlook on the web uses this view in a full screen window on a desktop computer.
    */
  @js.native
  sealed trait ThreeColumns
    extends StObject
       with OWAView
  
  /**
    * Two-column view. Displayed when the screen width is greater than or equal to 536 pixels,
    * but less than 780 pixels. For example, Outlook on the web uses this view on most tablets.
    */
  @js.native
  sealed trait TwoColumns
    extends StObject
       with OWAView
}
