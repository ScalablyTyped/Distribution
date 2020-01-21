package typings.plottable.commonsMod

import typings.plottable.datasetMod.Dataset
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.interfacesMod.IRangeProjector
import typings.plottable.scaleMod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessorScaleBinding[D, R] extends js.Object {
  /**
    * The (possibly upcasted to a function) user defined accessor.
    *
    * The first argument in `plot.x((d) => d.x, scale)`.
    */
  @JSName("accessor")
  var accessor_Original: IAccessor[_] = js.native
  /**
    * Transforms the scaled result of the accessor.
    *
    * Normally, the accessors ,`(d) => d.x`, will be wrapped like
    * `scale.scale((d) => d.x)`. But, this is not sufficient if you want to
    * modify the scaled value.
    *
    * However, moving the scale inside the accessor prevents several useful
    * features from working properly (including `computeExtents`, `entityNearest`
    * and `deferredRendering`). So, you may optionally provide this projector
    * which, if present, will be applied to the scaled accessor result.
    * */
  var postScale: js.UndefOr[IRangeProjector[R]] = js.native
  /**
    * The Scale that the accessor's result gets passed through.
    *
    * The second argument in `plot.x((d) => d.x, scale)`.
    */
  var scale: js.UndefOr[Scale[D, R]] = js.native
  /**
    * The (possibly upcasted to a function) user defined accessor.
    *
    * The first argument in `plot.x((d) => d.x, scale)`.
    */
  def accessor(datum: js.Any, index: Double, dataset: Dataset): js.Any = js.native
}

