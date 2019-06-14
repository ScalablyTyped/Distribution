package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InitializationReason extends js.Object

/**
  * Specifies whether the add-in was just inserted or was already contained in the document.
  */
@JSGlobal("Office.InitializationReason")
@js.native
object InitializationReason extends js.Object {
  /**
    * The add-in is already part of the document that was opened.
    */
  @js.native
  sealed trait DocumentOpened
    extends officeDashJsDashPreviewLib.OfficeNs.InitializationReason
  
  /**
    * The add-in was just inserted into the document.
    */
  @js.native
  sealed trait Inserted
    extends officeDashJsDashPreviewLib.OfficeNs.InitializationReason
  
  /* 1 */ val DocumentOpened: DocumentOpened with scala.Double = js.native
  /* 0 */ val Inserted: Inserted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.InitializationReason with scala.Double] = js.native
}

