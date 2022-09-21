package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A scoped collection of custom XML parts.
  A scoped collection is the result of some operation (e.g., filtering by namespace).
  A scoped collection cannot be scoped any further.
  *
  * @remarks
  * [Api set: ExcelApi 1.5]
  */
@JSGlobal("Excel.CustomXmlPartScopedCollection")
@js.native
open class CustomXmlPartScopedCollection ()
  extends StObject
     with typings.officeJs.Excel.CustomXmlPartScopedCollection {
  
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
