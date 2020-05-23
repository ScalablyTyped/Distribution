package typings.officeUiFabricReact.mod

import typings.uifabricMergeStyles.istylesetMod.IProcessedStyleSet
import typings.uifabricMergeStyles.objectOnlyMod.ObjectOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "mergeStyleSets")
@js.native
object mergeStyleSets extends js.Object {
  def apply[TStyleSet](): IProcessedStyleSet[ObjectOnly[TStyleSet]] = js.native
  def apply[TStyleSet](styleSet: TStyleSet): IProcessedStyleSet[ObjectOnly[TStyleSet]] = js.native
  def apply[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  def apply[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: TStyleSet2): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  def apply[TStyleSet1, TStyleSet2, TStyleSet3](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IProcessedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3]] = js.native
  def apply[TStyleSet1, TStyleSet2, TStyleSet3, TStyleSet4](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IProcessedStyleSet[
    ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2] with ObjectOnly[TStyleSet3] with ObjectOnly[TStyleSet4]
  ] = js.native
}

