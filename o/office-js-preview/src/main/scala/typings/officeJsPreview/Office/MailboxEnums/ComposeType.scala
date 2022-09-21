package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ComposeType extends StObject
/**
  * Specifies a message's compose type.
  *
  * @remarks
  * [Api set: Mailbox 1.10]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  */
@JSGlobal("Office.MailboxEnums.ComposeType")
@js.native
object ComposeType extends StObject {
  
  /**
    * Forward.
    */
  @js.native
  sealed trait Forward
    extends StObject
       with ComposeType
  
  /**
    * New mail.
    */
  @js.native
  sealed trait NewMail
    extends StObject
       with ComposeType
  
  /**
    * Reply.
    */
  @js.native
  sealed trait Reply
    extends StObject
       with ComposeType
}
