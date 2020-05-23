package typings.officeJs.global.Visio

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of Page objects that are part of the document.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.PageCollection")
@js.native
class PageCollection ()
  extends typings.officeJs.Visio.PageCollection {
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

