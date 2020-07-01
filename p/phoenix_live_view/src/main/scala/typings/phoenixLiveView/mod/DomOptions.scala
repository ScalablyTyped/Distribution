package typings.phoenixLiveView.mod

import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomOptions extends js.Object {
  var childrenOnly: js.UndefOr[Boolean] = js.undefined
  var getNodeKey: js.UndefOr[js.Function1[/* node */ Node, _]] = js.undefined
  var onBeforeElChildrenUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.undefined
  var onBeforeElUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.undefined
  var onBeforeNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.undefined
  var onBeforeNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
  var onElUpdated: js.UndefOr[js.Function1[/* el */ HTMLElement, Unit]] = js.undefined
  var onNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.undefined
  var onNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
}

object DomOptions {
  @scala.inline
  def apply(
    childrenOnly: js.UndefOr[Boolean] = js.undefined,
    getNodeKey: /* node */ Node => _ = null,
    onBeforeElChildrenUpdated: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => Boolean = null,
    onBeforeElUpdated: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => Boolean = null,
    onBeforeNodeAdded: /* node */ Node => Node = null,
    onBeforeNodeDiscarded: /* node */ Node => Boolean = null,
    onElUpdated: /* el */ HTMLElement => Unit = null,
    onNodeAdded: /* node */ Node => Node = null,
    onNodeDiscarded: /* node */ Node => Unit = null
  ): DomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(childrenOnly)) __obj.updateDynamic("childrenOnly")(childrenOnly.get.asInstanceOf[js.Any])
    if (getNodeKey != null) __obj.updateDynamic("getNodeKey")(js.Any.fromFunction1(getNodeKey))
    if (onBeforeElChildrenUpdated != null) __obj.updateDynamic("onBeforeElChildrenUpdated")(js.Any.fromFunction2(onBeforeElChildrenUpdated))
    if (onBeforeElUpdated != null) __obj.updateDynamic("onBeforeElUpdated")(js.Any.fromFunction2(onBeforeElUpdated))
    if (onBeforeNodeAdded != null) __obj.updateDynamic("onBeforeNodeAdded")(js.Any.fromFunction1(onBeforeNodeAdded))
    if (onBeforeNodeDiscarded != null) __obj.updateDynamic("onBeforeNodeDiscarded")(js.Any.fromFunction1(onBeforeNodeDiscarded))
    if (onElUpdated != null) __obj.updateDynamic("onElUpdated")(js.Any.fromFunction1(onElUpdated))
    if (onNodeAdded != null) __obj.updateDynamic("onNodeAdded")(js.Any.fromFunction1(onNodeAdded))
    if (onNodeDiscarded != null) __obj.updateDynamic("onNodeDiscarded")(js.Any.fromFunction1(onNodeDiscarded))
    __obj.asInstanceOf[DomOptions]
  }
}

