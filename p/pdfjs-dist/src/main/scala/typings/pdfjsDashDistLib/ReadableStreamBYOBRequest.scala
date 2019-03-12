package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamBYOBRequest extends js.Object {
  val view: stdLib.ArrayBufferView
  def respond(bytesWritten: scala.Double): scala.Unit
  def respondWithNewView(view: stdLib.ArrayBufferView): scala.Unit
}

object ReadableStreamBYOBRequest {
  @scala.inline
  def apply(
    respond: scala.Double => scala.Unit,
    respondWithNewView: stdLib.ArrayBufferView => scala.Unit,
    view: stdLib.ArrayBufferView
  ): ReadableStreamBYOBRequest = {
    val __obj = js.Dynamic.literal(respond = js.Any.fromFunction1(respond), respondWithNewView = js.Any.fromFunction1(respondWithNewView), view = view)
  
    __obj.asInstanceOf[ReadableStreamBYOBRequest]
  }
}

