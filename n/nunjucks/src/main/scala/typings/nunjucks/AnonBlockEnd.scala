package typings.nunjucks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlockEnd extends js.Object {
  var blockEnd: js.UndefOr[String] = js.undefined
  var blockStart: js.UndefOr[String] = js.undefined
  var commentEnd: js.UndefOr[String] = js.undefined
  var commentStart: js.UndefOr[String] = js.undefined
  var variableEnd: js.UndefOr[String] = js.undefined
  var variableStart: js.UndefOr[String] = js.undefined
}

object AnonBlockEnd {
  @scala.inline
  def apply(
    blockEnd: String = null,
    blockStart: String = null,
    commentEnd: String = null,
    commentStart: String = null,
    variableEnd: String = null,
    variableStart: String = null
  ): AnonBlockEnd = {
    val __obj = js.Dynamic.literal()
    if (blockEnd != null) __obj.updateDynamic("blockEnd")(blockEnd.asInstanceOf[js.Any])
    if (blockStart != null) __obj.updateDynamic("blockStart")(blockStart.asInstanceOf[js.Any])
    if (commentEnd != null) __obj.updateDynamic("commentEnd")(commentEnd.asInstanceOf[js.Any])
    if (commentStart != null) __obj.updateDynamic("commentStart")(commentStart.asInstanceOf[js.Any])
    if (variableEnd != null) __obj.updateDynamic("variableEnd")(variableEnd.asInstanceOf[js.Any])
    if (variableStart != null) __obj.updateDynamic("variableStart")(variableStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlockEnd]
  }
}

