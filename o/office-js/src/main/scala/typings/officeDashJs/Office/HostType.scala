package typings.officeDashJs.Office

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
  sealed trait Access extends HostType
  
  /**
    * The Office host is Microsoft Excel.
    */
  @js.native
  sealed trait Excel extends HostType
  
  /**
    * The Office host is Microsoft OneNote.
    */
  @js.native
  sealed trait OneNote extends HostType
  
  /**
    * The Office host is Microsoft Outlook.
    */
  @js.native
  sealed trait Outlook extends HostType
  
  /**
    * The Office host is Microsoft PowerPoint.
    */
  @js.native
  sealed trait PowerPoint extends HostType
  
  /**
    * The Office host is Microsoft Project.
    */
  @js.native
  sealed trait Project extends HostType
  
  /**
    * The Office host is Microsoft Word.
    */
  @js.native
  sealed trait Word extends HostType
  
  /* 6 */ val Access: typings.officeDashJs.Office.HostType.Access with Double = js.native
  /* 1 */ val Excel: typings.officeDashJs.Office.HostType.Excel with Double = js.native
  /* 4 */ val OneNote: typings.officeDashJs.Office.HostType.OneNote with Double = js.native
  /* 3 */ val Outlook: typings.officeDashJs.Office.HostType.Outlook with Double = js.native
  /* 2 */ val PowerPoint: typings.officeDashJs.Office.HostType.PowerPoint with Double = js.native
  /* 5 */ val Project: typings.officeDashJs.Office.HostType.Project with Double = js.native
  /* 0 */ val Word: typings.officeDashJs.Office.HostType.Word with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostType with Double] = js.native
}

