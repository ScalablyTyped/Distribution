package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFPromise[T] extends js.Object {
  def isRejected(): scala.Boolean = js.native
  def isResolved(): scala.Boolean = js.native
  def reject(reason: java.lang.String): scala.Unit = js.native
  def resolve(value: T): scala.Unit = js.native
  def `then`[U](onResolve: js.Function1[/* promise */ T, U]): PDFPromise[U] = js.native
  def `then`[U](
    onResolve: js.Function1[/* promise */ T, U],
    onReject: js.Function1[/* reason */ java.lang.String, scala.Unit]
  ): PDFPromise[U] = js.native
}

