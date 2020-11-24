package typings.officeJs.global.Word

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the application object.
  *
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.Application")
@js.native
class Application ()
  extends typings.officeJs.Word.Application
/* static members */
@JSGlobal("Word.Application")
@js.native
object Application extends js.Object {
  
  /**
    * Create a new instance of Word.Application object
    */
  def newObject(context: ClientRequestContext): typings.officeJs.Word.Application = js.native
}
