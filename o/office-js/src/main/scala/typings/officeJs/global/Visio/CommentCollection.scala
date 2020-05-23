package typings.officeJs.global.Visio

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the CommentCollection for a given Shape.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.CommentCollection")
@js.native
class CommentCollection ()
  extends typings.officeJs.Visio.CommentCollection {
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

