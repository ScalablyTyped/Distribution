package typings.mongooseSequence.mod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceDocument extends Document {
  
  def setNext(sequenceId: String, callback: js.Function2[/* err */ js.Any, /* res */ this.type, Unit]): Unit = js.native
}
