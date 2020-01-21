package typings.plottable.commonsMod

import typings.plottable.datasetMod.Dataset
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.interfacesMod.IRangeProjector
import typings.plottable.scaleMod.TransformableScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransformableAccessorScaleBinding[D, R] extends js.Object {
  @JSName("accessor")
  var accessor_Original: IAccessor[_] = js.native
  var postScale: js.UndefOr[IRangeProjector[R]] = js.native
  var scale: js.UndefOr[TransformableScale[D, R]] = js.native
  def accessor(datum: js.Any, index: Double, dataset: Dataset): js.Any = js.native
}

