package typings.pell.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pellConfig[T /* <: HTMLElement */] extends js.Object {
  var actions: js.Array[pellAction]
  var classes: js.UndefOr[pellClasses] = js.undefined
  var defaultParagraphSeparator: js.UndefOr[String] = js.undefined
  var element: T
  var styleWithCSS: js.UndefOr[Boolean] = js.undefined
  def onChange(html: String): Unit
}

object pellConfig {
  @scala.inline
  def apply[T /* <: HTMLElement */](
    actions: js.Array[pellAction],
    element: T,
    onChange: String => Unit,
    classes: pellClasses = null,
    defaultParagraphSeparator: String = null,
    styleWithCSS: js.UndefOr[Boolean] = js.undefined
  ): pellConfig[T] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (defaultParagraphSeparator != null) __obj.updateDynamic("defaultParagraphSeparator")(defaultParagraphSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(styleWithCSS)) __obj.updateDynamic("styleWithCSS")(styleWithCSS.asInstanceOf[js.Any])
    __obj.asInstanceOf[pellConfig[T]]
  }
}

