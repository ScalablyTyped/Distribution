package typings.officeJs.global.Word

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the application object.
  *
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.Application")
@js.native
class Application ()
  extends typings.officeJs.Word.Application {
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

/* static members */
@JSGlobal("Word.Application")
@js.native
object Application extends js.Object {
  /**
    * Create a new instance of Word.Application object
    */
  def newObject(context: ClientRequestContext): typings.officeJs.Word.Application = js.native
}

