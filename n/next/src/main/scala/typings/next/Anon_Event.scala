package typings.next

import typings.std.Element
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[js.Any] = js.undefined
  def onClick(event: typings.react.reactMod.MouseEvent[Element, MouseEvent]): Unit
  def onMouseEnter(event: typings.react.reactMod.MouseEvent[Element, MouseEvent]): Unit
}

object Anon_Event {
  @scala.inline
  def apply(
    onClick: typings.react.reactMod.MouseEvent[Element, MouseEvent] => Unit,
    onMouseEnter: typings.react.reactMod.MouseEvent[Element, MouseEvent] => Unit,
    href: String = null,
    ref: js.Any = null
  ): Anon_Event = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), onMouseEnter = js.Any.fromFunction1(onMouseEnter))
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Event]
  }
}

