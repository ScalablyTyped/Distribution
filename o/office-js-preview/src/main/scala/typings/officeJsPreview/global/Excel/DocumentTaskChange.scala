package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a recorded change to the task.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.DocumentTaskChange")
@js.native
open class DocumentTaskChange ()
  extends StObject
     with typings.officeJsPreview.Excel.DocumentTaskChange {
  
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
object DocumentTaskChange {
  
  @JSGlobal("Excel.DocumentTaskChange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new instance of Excel.DocumentTaskChange object
    */
  /* static member */
  inline def newObject(context: ClientRequestContext): typings.officeJsPreview.Excel.DocumentTaskChange = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typings.officeJsPreview.Excel.DocumentTaskChange]
}
