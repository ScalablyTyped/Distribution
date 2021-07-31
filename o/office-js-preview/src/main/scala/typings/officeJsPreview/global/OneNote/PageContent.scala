package typings.officeJsPreview.global.OneNote

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a region on a page that contains top-level content types such as Outline or Image. A PageContent object can be assigned an XY position.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.PageContent")
@js.native
class PageContent ()
  extends StObject
     with typings.officeJsPreview.OneNote.PageContent {
  
  /** The request context associated with the object */
  /* CompleteClass */
  var context: ClientRequestContext = js.native
  
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
    * isNullObject property.
    */
  /* CompleteClass */
  var isNullObject: Boolean = js.native
}
