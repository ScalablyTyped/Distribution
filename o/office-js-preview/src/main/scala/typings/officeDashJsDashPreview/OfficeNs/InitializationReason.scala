package typings.officeDashJsDashPreview.OfficeNs

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
  sealed trait DocumentOpened extends InitializationReason
  
  /**
    * The add-in was just inserted into the document.
    */
  @js.native
  sealed trait Inserted extends InitializationReason
  
  /* 1 */ val DocumentOpened: typings.officeDashJsDashPreview.OfficeNs.InitializationReason.DocumentOpened with Double = js.native
  /* 0 */ val Inserted: typings.officeDashJsDashPreview.OfficeNs.InitializationReason.Inserted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InitializationReason with Double] = js.native
}

