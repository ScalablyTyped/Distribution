package typings.parallelDashTransform.parallelDashTransformMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parallel-transform", JSImport.Namespace)
@js.native
class ^ protected () extends Transform {
  def this(ontransform: OnTransform) = this()
  def this(opts: js.UndefOr[scala.Nothing], ontransform: OnTransform) = this()
  def this(opts: Double, ontransform: OnTransform) = this()
  def this(opts: Null, ontransform: OnTransform) = this()
  def this(opts: Options, ontransform: OnTransform) = this()
  def this(maxParallel: Double, opts: js.UndefOr[scala.Nothing], ontransform: OnTransform) = this()
  def this(maxParallel: Double, opts: Null, ontransform: OnTransform) = this()
  def this(maxParallel: Double, opts: Options, ontransform: OnTransform) = this()
}

@JSImport("parallel-transform", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      (Instantiable3[/* maxParallel */ Double, /* opts */ Options, /* ontransform */ OnTransform, Transform]) with (Instantiable3[
        /* maxParallel */ Double, 
        /* opts */ js.UndefOr[scala.Nothing], 
        /* ontransform */ OnTransform, 
        Transform
      ]) with (Instantiable3[/* maxParallel */ Double, /* opts */ Null, /* ontransform */ OnTransform, Transform]) with (Instantiable2[/* opts */ Options, /* ontransform */ OnTransform, Transform]) with (Instantiable2[/* opts */ Double, /* ontransform */ OnTransform, Transform]) with (Instantiable2[/* opts */ js.UndefOr[scala.Nothing], /* ontransform */ OnTransform, Transform]) with (Instantiable2[/* opts */ Null, /* ontransform */ OnTransform, Transform]) with (Instantiable1[/* ontransform */ OnTransform, Transform])
    ] {
  def apply(maxParallel: Double, opts: js.UndefOr[scala.Nothing], ontransform: OnTransform): Transform = js.native
  def apply(maxParallel: Double, opts: Null, ontransform: OnTransform): Transform = js.native
  def apply(maxParallel: Double, opts: Options, ontransform: OnTransform): Transform = js.native
  def apply(ontransform: OnTransform): Transform = js.native
  def apply(opts: js.UndefOr[scala.Nothing], ontransform: OnTransform): Transform = js.native
  def apply(opts: Double, ontransform: OnTransform): Transform = js.native
  def apply(opts: Null, ontransform: OnTransform): Transform = js.native
  def apply(opts: Options, ontransform: OnTransform): Transform = js.native
}

