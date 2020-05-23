package typings.officeJsPreview.global.Visio

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the ShapeDataItemCollection for a given Shape.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.ShapeDataItemCollection")
@js.native
class ShapeDataItemCollection ()
  extends typings.officeJsPreview.Visio.ShapeDataItemCollection {
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

