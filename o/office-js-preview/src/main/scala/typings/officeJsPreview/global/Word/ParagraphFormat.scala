package typings.officeJsPreview.global.Word

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a style of paragraph in a document.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.ParagraphFormat")
@js.native
open class ParagraphFormat ()
  extends StObject
     with typings.officeJsPreview.Word.ParagraphFormat {
  
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
