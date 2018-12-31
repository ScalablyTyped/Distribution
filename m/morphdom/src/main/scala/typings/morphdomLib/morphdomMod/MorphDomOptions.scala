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

