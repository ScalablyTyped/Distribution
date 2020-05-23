package typings.officeJsPreview.global.Visio

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the ShapeView class.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.ShapeView")
@js.native
class ShapeView ()
  extends typings.officeJsPreview.Visio.ShapeView {
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

