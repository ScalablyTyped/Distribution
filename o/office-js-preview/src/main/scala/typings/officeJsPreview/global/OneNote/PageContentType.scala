package typings.officeJsPreview.global.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.PageContentType")
@js.native
object PageContentType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.OneNote.PageContentType & String] = js.native
  
  /* "Image" */ val image: typings.officeJsPreview.OneNote.PageContentType.image & String = js.native
  
  /* "Ink" */ val ink: typings.officeJsPreview.OneNote.PageContentType.ink & String = js.native
  
  /* "Other" */ val other: typings.officeJsPreview.OneNote.PageContentType.other & String = js.native
  
  /* "Outline" */ val outline: typings.officeJsPreview.OneNote.PageContentType.outline & String = js.native
}
