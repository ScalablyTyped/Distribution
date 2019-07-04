package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HostType extends js.Object

/**
  * Specifies the host Office application in which the add-in is running.
  */
@JSGlobal("Office.HostType")
@js.native
object HostType extends js.Object {
  /**
    * The Office host is Microsoft Access.
    * 
    * **Important**: We no longer recommend that you create and use Access web apps and databases in SharePoint.
    * As an alternative, we recommend that you use {@link https://powerapps.microsoft.com/ | Microsoft PowerApps}
    * to build no-code business solutions for web and mobile devices.
    */
  @js.native
  sealed trait Access
    extends officeDashJsDashPreviewLib.OfficeNs.HostType
  
  /**
    * The Office host is Microsoft Excel.
    */
  @js.native
  sealed trait Excel
    extends officeDashJsDashPreviewLib.OfficeNs.HostType
  
  /**
    * The Office host is Microsoft OneNote.
    */
  @js.native
  sealed trait OneNote
    extends officeDashJsDashPreviewLib.OfficeNs.HostType
  
  /**
    * The Office host is Microsoft Outlook.
    */
  @js.native
  sealed trait Outlook
    extends officeDashJsDashPreviewLib.OfficeNs.HostType
  
  /**
    * The Office host is Microsoft PowerPoint.
    */
  @js.native
  sealed trait PowerPoint
    extends officeDashJsDashPreviewLib.OfficeNs.HostType
  
  /**
    * The Office host is Microsoft Project.
    */
  @js.native
  sealed trait Project
    extends officeDashJsDashPreviewLib.OfficeNs.HostType
  
  /**
    * The Office host is Microsoft Word.
    */
  @js.native
  sealed trait Word
    extends officeDashJsDashPreviewLib.OfficeNs.HostType
  
  /* 6 */ val Access: Access with scala.Double = js.native
  /* 1 */ val Excel: Excel with scala.Double = js.native
  /* 4 */ val OneNote: OneNote with scala.Double = js.native
  /* 3 */ val Outlook: Outlook with scala.Double = js.native
  /* 2 */ val PowerPoint: PowerPoint with scala.Double = js.native
  /* 5 */ val Project: Project with scala.Double = js.native
  /* 0 */ val Word: Word with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.HostType with scala.Double] = js.native
}

