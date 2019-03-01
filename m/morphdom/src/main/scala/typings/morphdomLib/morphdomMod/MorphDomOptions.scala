package typings
package morphdomLib.morphdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorphDomOptions extends js.Object {
  var childrenOnly: js.UndefOr[scala.Boolean] = js.undefined
  var getNodeKey: js.UndefOr[js.Function1[/* node */ stdLib.Node, _]] = js.undefined
  var onBeforeElChildrenUpdated: js.UndefOr[
    js.Function2[/* fromEl */ stdLib.HTMLElement, /* toEl */ stdLib.HTMLElement, scala.Boolean]
  ] = js.undefined
  var onBeforeElUpdated: js.UndefOr[
    js.Function2[/* fromEl */ stdLib.HTMLElement, /* toEl */ stdLib.HTMLElement, scala.Boolean]
  ] = js.undefined
  var onBeforeNodeAdded: js.UndefOr[js.Function1[/* node */ stdLib.Node, stdLib.Node]] = js.undefined
  var onBeforeNodeDiscarded: js.UndefOr[js.Function1[/* node */ stdLib.Node, scala.Boolean]] = js.undefined
  var onElUpdated: js.UndefOr[js.Function1[/* el */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  var onNodeAdded: js.UndefOr[js.Function1[/* node */ stdLib.Node, stdLib.Node]] = js.undefined
  var onNodeDiscarded: js.UndefOr[js.Function1[/* node */ stdLib.Node, scala.Unit]] = js.undefined
}

object MorphDomOptions {
  @scala.inline
  def apply(
    childrenOnly: js.UndefOr[scala.Boolean] = js.undefined,
    getNodeKey: js.Function1[/* node */ stdLib.Node, _] = null,
    onBeforeElChildrenUpdated: js.Function2[/* fromEl */ stdLib.HTMLElement, /* toEl */ stdLib.HTMLElement, scala.Boolean] = null,
    onBeforeElUpdated: js.Function2[/* fromEl */ stdLib.HTMLElement, /* toEl */ stdLib.HTMLElement, scala.Boolean] = null,
    onBeforeNodeAdded: js.Function1[/* node */ stdLib.Node, stdLib.Node] = null,
    onBeforeNodeDiscarded: js.Function1[/* node */ stdLib.Node, scala.Boolean] = null,
    onElUpdated: js.Function1[/* el */ stdLib.HTMLElement, scala.Unit] = null,
    onNodeAdded: js.Function1[/* node */ stdLib.Node, stdLib.Node] = null,
    onNodeDiscarded: js.Function1[/* node */ stdLib.Node, scala.Unit] = null
  ): MorphDomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(childrenOnly)) __obj.updateDynamic("childrenOnly")(childrenOnly)
    if (getNodeKey != null) __obj.updateDynamic("getNodeKey")(getNodeKey)
    if (onBeforeElChildrenUpdated != null) __obj.updateDynamic("onBeforeElChildrenUpdated")(onBeforeElChildrenUpdated)
    if (onBeforeElUpdated != null) __obj.updateDynamic("onBeforeElUpdated")(onBeforeElUpdated)
    if (onBeforeNodeAdded != null) __obj.updateDynamic("onBeforeNodeAdded")(onBeforeNodeAdded)
    if (onBeforeNodeDiscarded != null) __obj.updateDynamic("onBeforeNodeDiscarded")(onBeforeNodeDiscarded)
    if (onElUpdated != null) __obj.updateDynamic("onElUpdated")(onElUpdated)
    if (onNodeAdded != null) __obj.updateDynamic("onNodeAdded")(onNodeAdded)
    if (onNodeDiscarded != null) __obj.updateDynamic("onNodeDiscarded")(onNodeDiscarded)
    __obj.asInstanceOf[MorphDomOptions]
  }
}

