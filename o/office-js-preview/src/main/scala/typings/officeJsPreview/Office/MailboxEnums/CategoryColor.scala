package typings.officeJsPreview.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CategoryColor extends js.Object
/**
  * Specifies the category color.
  *
  * **Note**: The actual color depends on how the Outlook client renders it.
  * In this case, the colors noted on each preset are for the Outlook desktop client.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.CategoryColor")
@js.native
object CategoryColor extends js.Object {
  
  /**
    * Default color or no color mapped.
    */
  @js.native
  sealed trait None extends CategoryColor
  
  /**
    * Red
    */
  @js.native
  sealed trait Preset0 extends CategoryColor
  
  /**
    * Orange
    */
  @js.native
  sealed trait Preset1 extends CategoryColor
  
  /**
    * Steel
    */
  @js.native
  sealed trait Preset10 extends CategoryColor
  
  /**
    * DarkSteel
    */
  @js.native
  sealed trait Preset11 extends CategoryColor
  
  /**
    * Gray
    */
  @js.native
  sealed trait Preset12 extends CategoryColor
  
  /**
    * DarkGray
    */
  @js.native
  sealed trait Preset13 extends CategoryColor
  
  /**
    * Black
    */
  @js.native
  sealed trait Preset14 extends CategoryColor
  
  /**
    * DarkRed
    */
  @js.native
  sealed trait Preset15 extends CategoryColor
  
  /**
    * DarkOrange
    */
  @js.native
  sealed trait Preset16 extends CategoryColor
  
  /**
    * DarkBrown
    */
  @js.native
  sealed trait Preset17 extends CategoryColor
  
  /**
    * DarkYellow
    */
  @js.native
  sealed trait Preset18 extends CategoryColor
  
  /**
    * DarkGreen
    */
  @js.native
  sealed trait Preset19 extends CategoryColor
  
  /**
    * Brown
    */
  @js.native
  sealed trait Preset2 extends CategoryColor
  
  /**
    * DarkTeal
    */
  @js.native
  sealed trait Preset20 extends CategoryColor
  
  /**
    * DarkOlive
    */
  @js.native
  sealed trait Preset21 extends CategoryColor
  
  /**
    * DarkBlue
    */
  @js.native
  sealed trait Preset22 extends CategoryColor
  
  /**
    * DarkPurple
    */
  @js.native
  sealed trait Preset23 extends CategoryColor
  
  /**
    * DarkCranberry
    */
  @js.native
  sealed trait Preset24 extends CategoryColor
  
  /**
    * Yellow
    */
  @js.native
  sealed trait Preset3 extends CategoryColor
  
  /**
    * Green
    */
  @js.native
  sealed trait Preset4 extends CategoryColor
  
  /**
    * Teal
    */
  @js.native
  sealed trait Preset5 extends CategoryColor
  
  /**
    * Olive
    */
  @js.native
  sealed trait Preset6 extends CategoryColor
  
  /**
    * Blue
    */
  @js.native
  sealed trait Preset7 extends CategoryColor
  
  /**
    * Purple
    */
  @js.native
  sealed trait Preset8 extends CategoryColor
  
  /**
    * Cranberry
    */
  @js.native
  sealed trait Preset9 extends CategoryColor
}
