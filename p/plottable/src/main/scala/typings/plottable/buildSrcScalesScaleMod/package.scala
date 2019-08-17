package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcScalesScaleMod {
  import typings.plottable.buildSrcScalesMod.ITransformableScale

  type IScaleCallback[S /* <: Scale[_, _] */] = js.Function1[/* scale */ S, js.Any]
  type TransformableScale[D, R] = (Scale[D, R]) with ITransformableScale
}
