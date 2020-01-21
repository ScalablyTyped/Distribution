package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiffLineInformation extends js.Object {
  val equivalentLineNumber: Double
}

object IDiffLineInformation {
  @scala.inline
  def apply(equivalentLineNumber: Double): IDiffLineInformation = {
    val __obj = js.Dynamic.literal(equivalentLineNumber = equivalentLineNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDiffLineInformation]
  }
}

