package typings.officeDashJsDashPreview.Office

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Office.InitializationReason.DocumentOpened
import typings.officeDashJsDashPreview.Office.InitializationReason.Inserted
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InitializationReason with Double] = js.native
  /* 1 */ @js.native
  object DocumentOpened extends TopLevel[DocumentOpened with Double]
  
  /* 0 */ @js.native
  object Inserted extends TopLevel[Inserted with Double]
  
}

