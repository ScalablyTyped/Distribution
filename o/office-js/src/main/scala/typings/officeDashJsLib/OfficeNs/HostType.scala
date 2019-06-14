package typings
package officeDashJsLib.OfficeNs

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
    */
  @js.native
  sealed trait Access
    extends officeDashJsLib.OfficeNs.HostType
  
  /**
    * The Office host is Microsoft Excel.
    */
  @js.native
  sealed trait Excel
    extends officeDashJsLib.OfficeNs.HostType
  
  /**
    * The Office host is Microsoft OneNote.
    */
  @js.native
  sealed trait OneNote
    extends officeDashJsLib.OfficeNs.HostType
  
  /**
    * The Office host is Microsoft Outlook.
    */
  @js.native
  sealed trait Outlook
    extends officeDashJsLib.OfficeNs.HostType
  
  /**
    * The Office host is Microsoft PowerPoint.
    */
  @js.native
  sealed trait PowerPoint
    extends officeDashJsLib.OfficeNs.HostType
  
  /**
    * The Office host is Microsoft Project.
    */
  @js.native
  sealed trait Project
    extends officeDashJsLib.OfficeNs.HostType
  
  /**
    * The Office host is Microsoft Word.
    */
  @js.native
  sealed trait Word
    extends officeDashJsLib.OfficeNs.HostType
  
  /* 6 */ val Access: Access with scala.Double = js.native
  /* 1 */ val Excel: Excel with scala.Double = js.native
  /* 4 */ val OneNote: OneNote with scala.Double = js.native
  /* 3 */ val Outlook: Outlook with scala.Double = js.native
  /* 2 */ val PowerPoint: PowerPoint with scala.Double = js.native
  /* 5 */ val Project: Project with scala.Double = js.native
  /* 0 */ val Word: Word with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsLib.OfficeNs.HostType with scala.Double] = js.native
}

