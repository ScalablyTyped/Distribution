package typings.officeJs.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourceProperty extends StObject
/**
  * Specifies the source of the selected data in an item (see `Office.mailbox.item.getSelectedDataAsync` for details).
  * 
  * [Api set: Mailbox 1.2]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  */
@JSGlobal("Office.MailboxEnums.SourceProperty")
@js.native
object SourceProperty extends StObject {
  
  /**
    * The source of the data is from the body of the item.
    */
  @js.native
  sealed trait Body
    extends StObject
       with SourceProperty
  
  /**
    * The source of the data is from the subject of the item.
    */
  @js.native
  sealed trait Subject
    extends StObject
       with SourceProperty
}
