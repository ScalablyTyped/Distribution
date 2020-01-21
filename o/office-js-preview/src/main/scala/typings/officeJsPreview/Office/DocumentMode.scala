package typings.officeJsPreview.Office

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentMode with Double] = js.native
  /* 0 */ @js.native
  object ReadOnly extends TopLevel[ReadOnly with Double]
  
  /* 1 */ @js.native
  object ReadWrite extends TopLevel[ReadWrite with Double]
  
}

