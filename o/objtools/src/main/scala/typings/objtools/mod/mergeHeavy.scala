package typings.objtools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objtools", "mergeHeavy")
@js.native
object mergeHeavy extends js.Object {
  def apply(args: js.Any*): js.Any = js.native
  def apply[TTarget, TSource](target: TTarget, source: TSource): TTarget with TSource = js.native
  def apply[TTarget, TSource](target: TTarget, source: TSource, customizer: MergeCustomizer): TTarget with TSource = js.native
  def apply[TTarget, TSource1, TSource2](target: TTarget, source1: TSource1, source2: TSource2): TTarget with TSource1 with TSource2 = js.native
  def apply[TTarget, TSource1, TSource2](target: TTarget, source1: TSource1, source2: TSource2, customizer: MergeCustomizer): TTarget with TSource1 with TSource2 = js.native
  def apply[TTarget, TSource1, TSource2, TSource3](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3): TTarget with TSource1 with TSource2 with TSource3 = js.native
  def apply[TTarget, TSource1, TSource2, TSource3](
    target: TTarget,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: MergeCustomizer
  ): TTarget with TSource1 with TSource2 with TSource3 = js.native
  def apply[TTarget, TSource1, TSource2, TSource3, TSource4](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): TTarget with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  def apply[TTarget, TSource1, TSource2, TSource3, TSource4](
    target: TTarget,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: MergeCustomizer
  ): TTarget with TSource1 with TSource2 with TSource3 with TSource4 = js.native
}

