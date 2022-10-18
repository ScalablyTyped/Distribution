package typings.officeJs.global.OneNote

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of TableCell objects.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.TableCellCollection")
@js.native
open class TableCellCollection ()
  extends StObject
     with typings.officeJs.OneNote.TableCellCollection {
  
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
