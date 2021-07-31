package typings.officeJs.global.Word

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a section in a Word document.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.Section")
@js.native
class Section ()
  extends StObject
     with typings.officeJs.Word.Section {
  
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
