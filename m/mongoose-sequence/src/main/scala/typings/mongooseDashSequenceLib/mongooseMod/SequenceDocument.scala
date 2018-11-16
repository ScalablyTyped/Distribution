package typings
package mongooseDashSequenceLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceDocument
  extends stdLib.Document {
  def setNext(
    sequenceId: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* res */ this.type, scala.Unit]
  ): scala.Unit = js.native
}

