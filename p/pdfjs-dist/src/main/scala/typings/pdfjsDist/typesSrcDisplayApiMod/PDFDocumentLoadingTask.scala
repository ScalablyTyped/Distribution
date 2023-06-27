package typings.pdfjsDist.typesSrcDisplayApiMod

import typings.pdfjsDist.typesSrcSharedUtilMod.PromiseCapability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist/types/src/display/api", "PDFDocumentLoadingTask")
@js.native
open class PDFDocumentLoadingTask () extends StObject {
  
  var _capability: PromiseCapability = js.native
  
  var _transport: Any = js.native
  
  var _worker: Any = js.native
  
  /**
    * Abort all network requests and destroy the worker.
    * @returns {Promise<void>} A promise that is resolved when destruction is
    *   completed.
    */
  def destroy(): js.Promise[Unit] = js.native
  
  /**
    * Whether the loading task is destroyed or not.
    * @type {boolean}
    */
  var destroyed: Boolean = js.native
  
  /**
    * Unique identifier for the document loading task.
    * @type {string}
    */
  var docId: String = js.native
  
  /**
    * Callback to request a password if a wrong or no password was provided.
    * The callback receives two parameters: a function that should be called
    * with the new password, and a reason (see {@link PasswordResponses}).
    * @type {function}
    */
  var onPassword: js.Function = js.native
  
  /**
    * Callback to be able to monitor the loading progress of the PDF file
    * (necessary to implement e.g. a loading bar).
    * The callback receives an {@link OnProgressParameters} argument.
    * @type {function}
    */
  var onProgress: js.Function = js.native
  
  /**
    * Promise for document loading task completion.
    * @type {Promise<PDFDocumentProxy>}
    */
  def promise: js.Promise[PDFDocumentProxy] = js.native
}
/* static members */
object PDFDocumentLoadingTask {
  
  @JSImport("pdfjs-dist/types/src/display/api", "PDFDocumentLoadingTask.__#19@#docId")
  @js.native
  val `__Numbersign19@NumbersigndocId`: Double = js.native
}
