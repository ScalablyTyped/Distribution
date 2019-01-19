package typings
package officeDashJsLib.WordNs

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
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Application: RequestContext = js.native
  /**
    *
    * Creates a new document by using an optional base64 encoded .docx file.
    *
    * [Api set: WordApi 1.3]
    *
    * @param base64File Optional. The base64 encoded .docx file. The default value is null.
    */
  def createDocument(): DocumentCreated = js.native
  def createDocument(base64File: java.lang.String): DocumentCreated = js.native
  def toJSON(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
}

/**
  *
  * Represents the application object.
  *
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.Application")
@js.native
object Application extends js.Object {
  /**
    * Create a new instance of Word.Application object
    */
  def newObject(context: officeDashJsLib.OfficeExtensionNs.ClientRequestContext): officeDashJsLib.WordNs.Application = js.native
}

