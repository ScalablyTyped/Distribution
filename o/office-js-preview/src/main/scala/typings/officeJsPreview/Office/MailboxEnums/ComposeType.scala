package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ComposeType extends StObject
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
object ComposeType extends StObject {
  
  /**
    * Forward.
    *
    * [Api set: Mailbox Preview]
    */
  @js.native
  sealed trait Forward
    extends StObject
       with ComposeType
  
  /**
    * New mail.
    *
    * [Api set: Mailbox Preview]
    */
  @js.native
  sealed trait NewMail
    extends StObject
       with ComposeType
  
  /**
    * Reply.
    *
    * [Api set: Mailbox Preview]
    */
  @js.native
  sealed trait Reply
    extends StObject
       with ComposeType
}
