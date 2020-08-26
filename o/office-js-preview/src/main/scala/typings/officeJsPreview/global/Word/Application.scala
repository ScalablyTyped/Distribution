package typings.officeJsPreview.global.Word

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
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
  extends typings.officeJsPreview.Word.Application

/* static members */
@JSGlobal("Word.Application")
@js.native
object Application extends js.Object {
  /**
    * Create a new instance of Word.Application object
    */
  def newObject(context: ClientRequestContext): typings.officeJsPreview.Word.Application = js.native
}

