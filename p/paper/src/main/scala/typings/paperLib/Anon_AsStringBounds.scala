package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsStringBounds extends js.Object {
  var asString: js.UndefOr[scala.Boolean] = js.undefined
  var bounds: js.UndefOr[java.lang.String | paperLib.paperNs.Rectangle] = js.undefined
  var embedImages: js.UndefOr[scala.Boolean] = js.undefined
  var matchShapes: js.UndefOr[scala.Boolean] = js.undefined
  var matrix: js.UndefOr[paperLib.paperNs.Matrix] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AsStringBounds {
  @scala.inline
  def apply(
    asString: js.UndefOr[scala.Boolean] = js.undefined,
    bounds: java.lang.String | paperLib.paperNs.Rectangle = null,
    embedImages: js.UndefOr[scala.Boolean] = js.undefined,
    matchShapes: js.UndefOr[scala.Boolean] = js.undefined,
    matrix: paperLib.paperNs.Matrix = null,
    precision: scala.Int | scala.Double = null
  ): Anon_AsStringBounds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asString)) __obj.updateDynamic("asString")(asString)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(embedImages)) __obj.updateDynamic("embedImages")(embedImages)
    if (!js.isUndefined(matchShapes)) __obj.updateDynamic("matchShapes")(matchShapes)
    if (matrix != null) __obj.updateDynamic("matrix")(matrix)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsStringBounds]
  }
}

