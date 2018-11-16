package typings
package parallelDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MaxParallel
  extends ScalablyTyped.runtime.Instantiable1[/* ontransform */ OnTransform, nodeLib.streamMod.Transform]
     with ScalablyTyped.runtime.Instantiable2[
      (/* opts */ parallelDashTransformLib.parallelDashTransformMod.ParallelTransformNs.Options) | (/* opts */ scala.Double) | (/* opts */ js.UndefOr[scala.Nothing]) | (/* opts */ scala.Null), 
      /* ontransform */ OnTransform, 
      nodeLib.streamMod.Transform
    ]
     with ScalablyTyped.runtime.Instantiable3[
      /* maxParallel */ scala.Double, 
      (/* opts */ parallelDashTransformLib.parallelDashTransformMod.ParallelTransformNs.Options) | (/* opts */ js.UndefOr[scala.Nothing]) | (/* opts */ scala.Null), 
      /* ontransform */ OnTransform, 
      nodeLib.streamMod.Transform
    ] {
  def apply(maxParallel: scala.Double, opts: js.UndefOr[scala.Nothing], ontransform: OnTransform): nodeLib.streamMod.Transform = js.native
  def apply(
    maxParallel: scala.Double,
    opts: parallelDashTransformLib.parallelDashTransformMod.ParallelTransformNs.Options,
    ontransform: OnTransform
  ): nodeLib.streamMod.Transform = js.native
  def apply(maxParallel: scala.Double, opts: scala.Null, ontransform: OnTransform): nodeLib.streamMod.Transform = js.native
  def apply(ontransform: OnTransform): nodeLib.streamMod.Transform = js.native
  def apply(opts: js.UndefOr[scala.Nothing], ontransform: OnTransform): nodeLib.streamMod.Transform = js.native
  def apply(
    opts: parallelDashTransformLib.parallelDashTransformMod.ParallelTransformNs.Options,
    ontransform: OnTransform
  ): nodeLib.streamMod.Transform = js.native
  def apply(opts: scala.Double, ontransform: OnTransform): nodeLib.streamMod.Transform = js.native
  def apply(opts: scala.Null, ontransform: OnTransform): nodeLib.streamMod.Transform = js.native
}

