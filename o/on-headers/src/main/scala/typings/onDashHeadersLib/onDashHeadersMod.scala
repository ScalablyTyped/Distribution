package typings
package onDashHeadersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("on-headers", JSImport.Namespace)
@js.native
object onDashHeadersMod extends js.Object {
  /**
   * This will add the listener to fire when headers are emitted for res.
   * The listener is passed the response object as its context (this).
   * Headers are considered emitted only once, right before they
   * are sent to the client.
   *
   * When this is called multiple times on the same res, the listeners
   * are fired in the reverse order they were added.
   *
   * @param res HTTP server response object
   * @param listener Function to call prior to headers being emitted,
   *        the response object is passed as this context.
   */
  def apply(
    res: nodeLib.httpMod.ServerResponse,
    listener: js.ThisFunction0[/* this */ nodeLib.httpMod.ServerResponse, scala.Unit]
  ): scala.Unit = js.native
}

