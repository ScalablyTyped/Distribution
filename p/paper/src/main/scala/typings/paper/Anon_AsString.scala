package typings.paper

import typings.paper.paperNs.Matrix
import typings.paper.paperNs.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsString extends js.Object {
  var asString: js.UndefOr[Boolean] = js.undefined
  var bounds: js.UndefOr[String | Rectangle] = js.undefined
  var embedImages: js.UndefOr[Boolean] = js.undefined
  var matchShapes: js.UndefOr[Boolean] = js.undefined
  var matrix: js.UndefOr[Matrix] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
}

object Anon_AsString {
  @scala.inline
  def apply(
    asString: js.UndefOr[Boolean] = js.undefined,
    bounds: String | Rectangle = null,
    embedImages: js.UndefOr[Boolean] = js.undefined,
    matchShapes: js.UndefOr[Boolean] = js.undefined,
    matrix: Matrix = null,
    precision: Int | Double = null
  ): Anon_AsString = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asString)) __obj.updateDynamic("asString")(asString)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(embedImages)) __obj.updateDynamic("embedImages")(embedImages)
    if (!js.isUndefined(matchShapes)) __obj.updateDynamic("matchShapes")(matchShapes)
    if (matrix != null) __obj.updateDynamic("matrix")(matrix)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsString]
  }
}

