package typings.paper

import typings.paper.paperNs.Item
import typings.paper.paperNs.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyMatrix extends js.Object {
  var applyMatrix: js.UndefOr[Matrix] = js.undefined
  var expandShapes: js.UndefOr[Boolean] = js.undefined
  var insert: js.UndefOr[Boolean] = js.undefined
  var onError: js.UndefOr[js.Function2[/* message */ String, /* status */ Double, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function2[/* item */ Item, /* svg */ String, Unit]] = js.undefined
}

object Anon_ApplyMatrix {
  @scala.inline
  def apply(
    applyMatrix: Matrix = null,
    expandShapes: js.UndefOr[Boolean] = js.undefined,
    insert: js.UndefOr[Boolean] = js.undefined,
    onError: (/* message */ String, /* status */ Double) => Unit = null,
    onLoad: (/* item */ Item, /* svg */ String) => Unit = null
  ): Anon_ApplyMatrix = {
    val __obj = js.Dynamic.literal()
    if (applyMatrix != null) __obj.updateDynamic("applyMatrix")(applyMatrix)
    if (!js.isUndefined(expandShapes)) __obj.updateDynamic("expandShapes")(expandShapes)
    if (!js.isUndefined(insert)) __obj.updateDynamic("insert")(insert)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction2(onLoad))
    __obj.asInstanceOf[Anon_ApplyMatrix]
  }
}

