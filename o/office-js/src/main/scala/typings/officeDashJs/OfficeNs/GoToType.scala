package typings.officeDashJs.OfficeNs

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
  sealed trait Binding extends GoToType
  
  /**
    * Goes to the specified index by slide number or {@link Office.Index}.
    * 
    * Supported hosts: PowerPoint
    */
  @js.native
  sealed trait Index extends GoToType
  
  /**
    * Goes to a named item using that item's name.
    * In Excel, you can use any structured reference for a named range or table: "Worksheet2!Table1"
    * 
    * Supported hosts: Excel
    */
  @js.native
  sealed trait NamedItem extends GoToType
  
  /**
    * Goes to a slide using the specified id.
    * 
    * Supported hosts: PowerPoint
    */
  @js.native
  sealed trait Slide extends GoToType
  
  /* 0 */ val Binding: typings.officeDashJs.OfficeNs.GoToType.Binding with Double = js.native
  /* 3 */ val Index: typings.officeDashJs.OfficeNs.GoToType.Index with Double = js.native
  /* 1 */ val NamedItem: typings.officeDashJs.OfficeNs.GoToType.NamedItem with Double = js.native
  /* 2 */ val Slide: typings.officeDashJs.OfficeNs.GoToType.Slide with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GoToType with Double] = js.native
}

