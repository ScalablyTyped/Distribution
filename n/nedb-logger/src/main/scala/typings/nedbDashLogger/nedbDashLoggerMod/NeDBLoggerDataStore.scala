package typings.nedbDashLogger.nedbDashLoggerMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeDBLoggerDataStore extends js.Object {
  /**
    * Insert a new document
    * @param cb Optional callback, signature: err, insertedDoc
    */
  def insert[T](newDoc: T): Unit = js.native
  def insert[T](newDoc: T, cb: js.Function2[/* err */ Error, /* document */ T, Unit]): Unit = js.native
}

