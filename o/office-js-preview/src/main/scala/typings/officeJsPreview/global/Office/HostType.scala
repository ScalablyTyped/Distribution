package typings.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the host Office application in which the add-in is running.
  * 
  * @remarks
  * **Important**: In Outlook, this enum is available from Mailbox requirement set 1.5.
  */
@JSGlobal("Office.HostType")
@js.native
object HostType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJsPreview.Office.HostType & Double] = js.native
  
  /* 6 */ val Access: typings.officeJsPreview.Office.HostType.Access & Double = js.native
  
  /* 1 */ val Excel: typings.officeJsPreview.Office.HostType.Excel & Double = js.native
  
  /* 4 */ val OneNote: typings.officeJsPreview.Office.HostType.OneNote & Double = js.native
  
  /* 3 */ val Outlook: typings.officeJsPreview.Office.HostType.Outlook & Double = js.native
  
  /* 2 */ val PowerPoint: typings.officeJsPreview.Office.HostType.PowerPoint & Double = js.native
  
  /* 5 */ val Project: typings.officeJsPreview.Office.HostType.Project & Double = js.native
  
  /* 0 */ val Word: typings.officeJsPreview.Office.HostType.Word & Double = js.native
}
