package typings.officeJs.global.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.PageContentType")
@js.native
object PageContentType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.OneNote.PageContentType with String] = js.native
  
  /* "Image" */ val image: typings.officeJs.OneNote.PageContentType.image with String = js.native
  
  /* "Ink" */ val ink: typings.officeJs.OneNote.PageContentType.ink with String = js.native
  
  /* "Other" */ val other: typings.officeJs.OneNote.PageContentType.other with String = js.native
  
  /* "Outline" */ val outline: typings.officeJs.OneNote.PageContentType.outline with String = js.native
}
