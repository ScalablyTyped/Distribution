package typings.officeJs.global.OneNote

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of notebooks.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.NotebookCollection")
@js.native
open class NotebookCollection ()
  extends StObject
     with typings.officeJs.OneNote.NotebookCollection {
  
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
