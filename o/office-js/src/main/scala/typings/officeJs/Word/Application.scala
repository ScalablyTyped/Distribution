package typings.officeJs.Word

import org.scalablytyped.runtime.StringDictionary
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the application object.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
@js.native
trait Application
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Application: RequestContext = js.native
  
  /**
    * Creates a new document by using an optional Base64-encoded .docx file.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param base64File Optional. The Base64-encoded .docx file. The default value is null.
    */
  def createDocument(): DocumentCreated = js.native
  def createDocument(base64File: String): DocumentCreated = js.native
  
  /**
    * Parse styles from template Base64 file and return JSON format of retrieved styles as a string.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    *
    * @param base64File Required. The template file.
    */
  def retrieveStylesFromBase64(base64File: String): ClientResult[String] = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Application object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.ApplicationData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StringDictionary[String] = js.native
}
