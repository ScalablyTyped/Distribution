package typings.parallelTransform.mod

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
  def this(opts: js.UndefOr[Double | Null | Options], ontransform: OnTransform) = this()
  def this(maxParallel: Double, opts: js.UndefOr[Null | Options], ontransform: OnTransform) = this()
}

@JSImport("parallel-transform", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      (Instantiable1[/* ontransform */ OnTransform, Transform]) with (Instantiable2[js.UndefOr[/* opts */ Double], /* ontransform */ OnTransform, Transform]) with (Instantiable2[js.UndefOr[/* opts */ Null], /* ontransform */ OnTransform, Transform]) with (Instantiable2[js.UndefOr[/* opts */ Options], /* ontransform */ OnTransform, Transform]) with (Instantiable3[
        /* maxParallel */ Double, 
        js.UndefOr[/* opts */ Null], 
        /* ontransform */ OnTransform, 
        Transform
      ]) with (Instantiable3[
        /* maxParallel */ Double, 
        js.UndefOr[/* opts */ Options], 
        /* ontransform */ OnTransform, 
        Transform
      ])
    ] {
  def apply(maxParallel: Double, opts: js.UndefOr[Null | Options], ontransform: OnTransform): Transform = js.native
  def apply(ontransform: OnTransform): Transform = js.native
  def apply(opts: js.UndefOr[Double | Null | Options], ontransform: OnTransform): Transform = js.native
}

