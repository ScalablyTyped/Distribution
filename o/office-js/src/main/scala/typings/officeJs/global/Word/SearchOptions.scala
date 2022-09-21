package typings.officeJs.global.Word

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the options to be included in a search operation.
  *
  * To learn more about how to use search options in the Word JavaScript APIs, read {@link https://docs.microsoft.com/office/dev/add-ins/word/search-option-guidance | Use search options to find text in your Word add-in}.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.SearchOptions")
@js.native
open class SearchOptions ()
  extends StObject
     with typings.officeJs.Word.SearchOptions {
  
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
object SearchOptions {
  
  @JSGlobal("Word.SearchOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new instance of Word.SearchOptions object
    */
  /* static member */
  inline def newObject(context: ClientRequestContext): typings.officeJs.Word.SearchOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typings.officeJs.Word.SearchOptions]
}
