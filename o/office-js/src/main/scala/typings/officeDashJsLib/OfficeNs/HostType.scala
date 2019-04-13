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
  
  val Access: Access with java.lang.String = js.native
  val Excel: Excel with java.lang.String = js.native
  val OneNote: OneNote with java.lang.String = js.native
  val Outlook: Outlook with java.lang.String = js.native
  val PowerPoint: PowerPoint with java.lang.String = js.native
  val Project: Project with java.lang.String = js.native
  val Word: Word with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.HostType with java.lang.String] = js.native
}

