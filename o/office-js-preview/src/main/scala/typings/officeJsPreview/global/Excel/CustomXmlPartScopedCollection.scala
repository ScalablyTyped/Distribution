package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A scoped collection of custom XML parts.
  A scoped collection is the result of some operation (e.g., filtering by namespace).
  A scoped collection cannot be scoped any further.
  *
  * [Api set: ExcelApi 1.5]
  */
@JSGlobal("Excel.CustomXmlPartScopedCollection")
@js.native
class CustomXmlPartScopedCollection ()
  extends typings.officeJsPreview.Excel.CustomXmlPartScopedCollection {
  /** The request context associated with the object */
  /* CompleteClass */
  override var context: ClientRequestContext = js.native
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
    * isNullObject property.
    */
  /* CompleteClass */
  override var isNullObject: Boolean = js.native
}

