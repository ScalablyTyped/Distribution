package typings.officeJsPreview.Office

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostType with Double] = js.native
  /* 6 */ @js.native
  object Access extends TopLevel[Access with Double]
  
  /* 1 */ @js.native
  object Excel extends TopLevel[Excel with Double]
  
  /* 4 */ @js.native
  object OneNote extends TopLevel[OneNote with Double]
  
  /* 3 */ @js.native
  object Outlook extends TopLevel[Outlook with Double]
  
  /* 2 */ @js.native
  object PowerPoint extends TopLevel[PowerPoint with Double]
  
  /* 5 */ @js.native
  object Project extends TopLevel[Project with Double]
  
  /* 0 */ @js.native
  object Word extends TopLevel[Word with Double]
  
}

