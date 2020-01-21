package typings.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait selectionObject extends js.Object {
  var end: Double
  var start: Double
}

object selectionObject {
  @scala.inline
  def apply(end: Double, start: Double): selectionObject = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[selectionObject]
  }
}

