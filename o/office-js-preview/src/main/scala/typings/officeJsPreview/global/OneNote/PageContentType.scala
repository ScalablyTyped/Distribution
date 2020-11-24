package typings.officeJsPreview.global.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.PageContentType")
@js.native
object PageContentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.OneNote.PageContentType with String] = js.native
  
  /* "Image" */ val image: typings.officeJsPreview.OneNote.PageContentType.image with String = js.native
  
  /* "Ink" */ val ink: typings.officeJsPreview.OneNote.PageContentType.ink with String = js.native
  
  /* "Other" */ val other: typings.officeJsPreview.OneNote.PageContentType.other with String = js.native
  
  /* "Outline" */ val outline: typings.officeJsPreview.OneNote.PageContentType.outline with String = js.native
}
