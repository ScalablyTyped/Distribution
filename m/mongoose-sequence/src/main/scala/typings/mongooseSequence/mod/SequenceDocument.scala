package typings.mongooseSequence.mod

import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceDocument extends Document_ {
  def setNext(sequenceId: String, callback: js.Function2[/* err */ js.Any, /* res */ this.type, Unit]): Unit = js.native
}

