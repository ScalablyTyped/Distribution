package typings.officeJsPreview.global.OneNote

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents ink analysis data for a given set of ink strokes.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.InkAnalysis")
@js.native
class InkAnalysis ()
  extends StObject
     with typings.officeJsPreview.OneNote.InkAnalysis {
  
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
