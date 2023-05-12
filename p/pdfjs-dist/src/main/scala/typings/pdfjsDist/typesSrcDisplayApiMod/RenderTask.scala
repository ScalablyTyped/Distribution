package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist/types/src/display/api", "RenderTask")
@js.native
open class RenderTask protected () extends StObject {
  def this(internalRenderTask: Any) = this()
  
  /**
    * Cancels the rendering task. If the task is currently rendering it will
    * not be cancelled until graphics pauses with a timeout. The promise that
    * this object extends will be rejected when cancelled.
    *
    * @param {number} [extraDelay]
    */
  def cancel(): Unit = js.native
  def cancel(extraDelay: Double): Unit = js.native
  
  /**
    * Callback for incremental rendering -- a function that will be called
    * each time the rendering is paused.  To continue rendering call the
    * function that is the first argument to the callback.
    * @type {function}
    */
  var onContinue: js.Function = js.native
  
  /* private */ var `private`: Any = js.native
  
  /**
    * Promise for rendering task completion.
    * @type {Promise<void>}
    */
  def promise: js.Promise[Unit] = js.native
  
  /**
    * Whether form fields are rendered separately from the main operatorList.
    * @type {boolean}
    */
  def separateAnnots: Boolean = js.native
}
