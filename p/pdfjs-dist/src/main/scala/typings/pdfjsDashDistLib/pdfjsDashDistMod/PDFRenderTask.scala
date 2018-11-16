package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * RenderTask is basically a promise but adds a cancel function to termiate it.
 **/
@js.native
trait PDFRenderTask extends PDFPromise[PDFPageProxy] {
  /**
     * Cancel the rendering task.  If the task is currently rendering it will not be cancelled until graphics pauses with a timeout.  The promise that this object extends will resolve when cancelled.
     **/
  def cancel(): scala.Unit = js.native
}

