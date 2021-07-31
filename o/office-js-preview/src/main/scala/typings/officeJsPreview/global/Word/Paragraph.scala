package typings.officeJsPreview.global.Word

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a single paragraph in a selection, range, content control, or document body.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.Paragraph")
@js.native
class Paragraph ()
  extends StObject
     with typings.officeJsPreview.Word.Paragraph {
  
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
