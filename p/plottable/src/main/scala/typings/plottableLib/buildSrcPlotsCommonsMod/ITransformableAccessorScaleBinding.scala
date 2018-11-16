package typings
package plottableLib.buildSrcPlotsCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransformableAccessorScaleBinding[D, R] extends js.Object {
  @JSName("accessor")
  var accessor_Original: plottableLib.buildSrcCoreInterfacesMod.IAccessor[_] = js.native
  var postScale: js.UndefOr[plottableLib.buildSrcCoreInterfacesMod.IRangeProjector[R]] = js.native
  var scale: js.UndefOr[plottableLib.buildSrcScalesScaleMod.TransformableScale[D, R]] = js.native
  def accessor(datum: js.Any, index: scala.Double, dataset: plottableLib.buildSrcCoreDatasetMod.Dataset): js.Any = js.native
}

