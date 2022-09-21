package typings.officeJsPreview.global.Word

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the application object.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.Application")
@js.native
open class Application ()
  extends StObject
     with typings.officeJsPreview.Word.Application {
  
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
object Application {
  
  @JSGlobal("Word.Application")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new instance of Word.Application object
    */
  /* static member */
  inline def newObject(context: ClientRequestContext): typings.officeJsPreview.Word.Application = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typings.officeJsPreview.Word.Application]
}
