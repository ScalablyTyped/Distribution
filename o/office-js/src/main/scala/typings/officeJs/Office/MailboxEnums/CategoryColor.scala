package typings.officeJs.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CategoryColor extends StObject
/**
  * Specifies the category color.
  *
  * **Note**: The actual color depends on how the Outlook client renders it.
  * In this case, the colors noted on each preset are for the Outlook desktop client.
  *
  * @remarks
  * [Api set: Mailbox 1.8]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.CategoryColor")
@js.native
object CategoryColor extends StObject {
  
  /**
    * Default color or no color mapped.
    */
  @js.native
  sealed trait None
    extends StObject
       with CategoryColor
  
  /**
    * Red
    */
  @js.native
  sealed trait Preset0
    extends StObject
       with CategoryColor
  
  /**
    * Orange
    */
  @js.native
  sealed trait Preset1
    extends StObject
       with CategoryColor
  
  /**
    * Steel
    */
  @js.native
  sealed trait Preset10
    extends StObject
       with CategoryColor
  
  /**
    * DarkSteel
    */
  @js.native
  sealed trait Preset11
    extends StObject
       with CategoryColor
  
  /**
    * Gray
    */
  @js.native
  sealed trait Preset12
    extends StObject
       with CategoryColor
  
  /**
    * DarkGray
    */
  @js.native
  sealed trait Preset13
    extends StObject
       with CategoryColor
  
  /**
    * Black
    */
  @js.native
  sealed trait Preset14
    extends StObject
       with CategoryColor
  
  /**
    * DarkRed
    */
  @js.native
  sealed trait Preset15
    extends StObject
       with CategoryColor
  
  /**
    * DarkOrange
    */
  @js.native
  sealed trait Preset16
    extends StObject
       with CategoryColor
  
  /**
    * DarkBrown
    */
  @js.native
  sealed trait Preset17
    extends StObject
       with CategoryColor
  
  /**
    * DarkYellow
    */
  @js.native
  sealed trait Preset18
    extends StObject
       with CategoryColor
  
  /**
    * DarkGreen
    */
  @js.native
  sealed trait Preset19
    extends StObject
       with CategoryColor
  
  /**
    * Brown
    */
  @js.native
  sealed trait Preset2
    extends StObject
       with CategoryColor
  
  /**
    * DarkTeal
    */
  @js.native
  sealed trait Preset20
    extends StObject
       with CategoryColor
  
  /**
    * DarkOlive
    */
  @js.native
  sealed trait Preset21
    extends StObject
       with CategoryColor
  
  /**
    * DarkBlue
    */
  @js.native
  sealed trait Preset22
    extends StObject
       with CategoryColor
  
  /**
    * DarkPurple
    */
  @js.native
  sealed trait Preset23
    extends StObject
       with CategoryColor
  
  /**
    * DarkCranberry
    */
  @js.native
  sealed trait Preset24
    extends StObject
       with CategoryColor
  
  /**
    * Yellow
    */
  @js.native
  sealed trait Preset3
    extends StObject
       with CategoryColor
  
  /**
    * Green
    */
  @js.native
  sealed trait Preset4
    extends StObject
       with CategoryColor
  
  /**
    * Teal
    */
  @js.native
  sealed trait Preset5
    extends StObject
       with CategoryColor
  
  /**
    * Olive
    */
  @js.native
  sealed trait Preset6
    extends StObject
       with CategoryColor
  
  /**
    * Blue
    */
  @js.native
  sealed trait Preset7
    extends StObject
       with CategoryColor
  
  /**
    * Purple
    */
  @js.native
  sealed trait Preset8
    extends StObject
       with CategoryColor
  
  /**
    * Cranberry
    */
  @js.native
  sealed trait Preset9
    extends StObject
       with CategoryColor
}
