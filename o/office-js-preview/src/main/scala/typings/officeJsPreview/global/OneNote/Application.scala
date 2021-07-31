package typings.officeJsPreview.global.OneNote

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the top-level object that contains all globally addressable OneNote objects such as notebooks, the active notebook, and the active section.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.Application")
@js.native
class Application ()
  extends StObject
     with typings.officeJsPreview.OneNote.Application {
  
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
