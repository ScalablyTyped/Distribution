package typings.node.inspectorMod.Console

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Console message.
  */
trait ConsoleMessage extends js.Object {
  /**
    * Column number in the resource that generated this message (1-based).
    */
  var column: js.UndefOr[Double] = js.undefined
  /**
    * Message severity.
    */
  var level: java.lang.String
  /**
    * Line number in the resource that generated this message (1-based).
    */
  var line: js.UndefOr[Double] = js.undefined
  /**
    * Message source.
    */
  var source: java.lang.String
  /**
    * Message text.
    */
  var text: java.lang.String
  /**
    * URL of the message origin.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ConsoleMessage {
  @scala.inline
  def apply(
    level: java.lang.String,
    source: java.lang.String,
    text: java.lang.String,
    column: Int | Double = null,
    line: Int | Double = null,
    url: java.lang.String = null
  ): ConsoleMessage = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleMessage]
  }
}

