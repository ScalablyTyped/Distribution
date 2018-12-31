package typings
package nedbDashLoggerLib.nedbDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeDBLoggerDataStore extends js.Object {
  /**
    * Insert a new document
    * @param cb Optional callback, signature: err, insertedDoc
    */
  def insert[T](newDoc: T): scala.Unit = js.native
  def insert[T](newDoc: T, cb: js.Function2[/* err */ stdLib.Error, /* document */ T, scala.Unit]): scala.Unit = js.native
}

