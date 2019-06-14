package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GoToType extends js.Object

/**
  * Specifies the type of place or object to navigate to.
  */
@JSGlobal("Office.GoToType")
@js.native
object GoToType extends js.Object {
  /**
    * Goes to a binding object using the specified binding id.
    * 
    * Supported hosts: Excel, Word
    */
  @js.native
  sealed trait Binding
    extends officeDashJsDashPreviewLib.OfficeNs.GoToType
  
  /**
    * Goes to the specified index by slide number or {@link Office.Index}.
    * 
    * Supported hosts: PowerPoint
    */
  @js.native
  sealed trait Index
    extends officeDashJsDashPreviewLib.OfficeNs.GoToType
  
  /**
    * Goes to a named item using that item's name.
    * In Excel, you can use any structured reference for a named range or table: "Worksheet2!Table1"
    * 
    * Supported hosts: Excel
    */
  @js.native
  sealed trait NamedItem
    extends officeDashJsDashPreviewLib.OfficeNs.GoToType
  
  /**
    * Goes to a slide using the specified id.
    * 
    * Supported hosts: PowerPoint
    */
  @js.native
  sealed trait Slide
    extends officeDashJsDashPreviewLib.OfficeNs.GoToType
  
  /* 0 */ val Binding: Binding with scala.Double = js.native
  /* 3 */ val Index: Index with scala.Double = js.native
  /* 1 */ val NamedItem: NamedItem with scala.Double = js.native
  /* 2 */ val Slide: Slide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.GoToType with scala.Double] = js.native
}

