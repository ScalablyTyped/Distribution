package typings.officeJsPreview.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageContentType extends js.Object

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.PageContentType")
@js.native
object PageContentType extends js.Object {
  @js.native
  sealed trait image extends PageContentType
  
  @js.native
  sealed trait ink extends PageContentType
  
  @js.native
  sealed trait other extends PageContentType
  
  @js.native
  sealed trait outline extends PageContentType
  
}

