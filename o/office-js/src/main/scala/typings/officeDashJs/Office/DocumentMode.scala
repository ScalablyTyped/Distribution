package typings.officeDashJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentMode extends js.Object

/**
  * Specifies whether the document in the associated application is read-only or read-write.
  * 
  * @remarks
  *  
  * Returned by the mode property of the {@link Office.Document | Document} object.
  */
@JSGlobal("Office.DocumentMode")
@js.native
object DocumentMode extends js.Object {
  /**
    * The document is read-only.
    */
  @js.native
  sealed trait ReadOnly extends DocumentMode
  
  /**
    * The document can be read and written to.
    */
  @js.native
  sealed trait ReadWrite extends DocumentMode
  
  /* 0 */ val ReadOnly: typings.officeDashJs.Office.DocumentMode.ReadOnly with Double = js.native
  /* 1 */ val ReadWrite: typings.officeDashJs.Office.DocumentMode.ReadWrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentMode with Double] = js.native
}

