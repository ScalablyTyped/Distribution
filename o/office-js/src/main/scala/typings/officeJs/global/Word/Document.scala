package typings.officeJs.global.Word

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Document object is the top level object. A Document object contains one or more sections, content controls, and the body that contains the contents of the document.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.Document")
@js.native
open class Document ()
  extends StObject
     with typings.officeJs.Word.Document {
  
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
