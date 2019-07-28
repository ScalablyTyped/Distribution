package typings.plottable

import typings.plottable.buildSrcScalesMod.ITransformableScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcScalesScaleMod {
  type IScaleCallback[S /* <: Scale[_, _] */] = js.Function1[/* scale */ S, js.Any]
  type TransformableScale[D, R] = (Scale[D, R]) with ITransformableScale
}
