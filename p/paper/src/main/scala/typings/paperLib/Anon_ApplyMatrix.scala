package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyMatrix extends js.Object {
  var applyMatrix: js.UndefOr[paperLib.paperNs.Matrix] = js.undefined
  var expandShapes: js.UndefOr[scala.Boolean] = js.undefined
  var insert: js.UndefOr[scala.Boolean] = js.undefined
  var onError: js.UndefOr[
    js.Function2[/* message */ java.lang.String, /* status */ scala.Double, scala.Unit]
  ] = js.undefined
  var onLoad: js.UndefOr[
    js.Function2[/* item */ paperLib.paperNs.Item, /* svg */ java.lang.String, scala.Unit]
  ] = js.undefined
}

object Anon_ApplyMatrix {
  @scala.inline
  def apply(
    applyMatrix: paperLib.paperNs.Matrix = null,
    expandShapes: js.UndefOr[scala.Boolean] = js.undefined,
    insert: js.UndefOr[scala.Boolean] = js.undefined,
    onError: js.Function2[/* message */ java.lang.String, /* status */ scala.Double, scala.Unit] = null,
    onLoad: js.Function2[/* item */ paperLib.paperNs.Item, /* svg */ java.lang.String, scala.Unit] = null
  ): Anon_ApplyMatrix = {
    val __obj = js.Dynamic.literal()
    if (applyMatrix != null) __obj.updateDynamic("applyMatrix")(applyMatrix)
    if (!js.isUndefined(expandShapes)) __obj.updateDynamic("expandShapes")(expandShapes)
    if (!js.isUndefined(insert)) __obj.updateDynamic("insert")(insert)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    __obj.asInstanceOf[Anon_ApplyMatrix]
  }
}

