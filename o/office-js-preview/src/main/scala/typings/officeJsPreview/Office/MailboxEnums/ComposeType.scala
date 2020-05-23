package typings.officeJsPreview.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ComposeType extends js.Object

/**
  * Compose type.
  *
  * [Api set: Mailbox Preview]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  *
  * @beta
  */
@JSGlobal("Office.MailboxEnums.ComposeType")
@js.native
object ComposeType extends js.Object {
  /**
    * Forward.
    *
    * [Api set: Mailbox Preview]
    */
  @js.native
  sealed trait Forward extends ComposeType
  
  /**
    * New mail.
    *
    * [Api set: Mailbox Preview]
    */
  @js.native
  sealed trait NewMail extends ComposeType
  
  /**
    * Reply.
    *
    * [Api set: Mailbox Preview]
    */
  @js.native
  sealed trait Reply extends ComposeType
  
}

