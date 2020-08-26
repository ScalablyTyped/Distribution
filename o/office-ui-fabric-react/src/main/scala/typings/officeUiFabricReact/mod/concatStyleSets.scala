package typings.officeUiFabricReact.mod

import typings.uifabricMergeStyles.istylesetMod.IConcatenatedStyleSet
import typings.uifabricMergeStyles.objectOnlyMod.ObjectOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "concatStyleSets")
@js.native
object concatStyleSets extends js.Object {
  def apply[TStyleSet](): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = js.native
  def apply[TStyleSet](styleSet: TStyleSet): IConcatenatedStyleSet[ObjectOnly[TStyleSet]] = js.native
  def apply[TStyleSet1, TStyleSet2](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  def apply[TStyleSet1, TStyleSet2](styleSet1: js.UndefOr[scala.Nothing], styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
  def apply[TStyleSet1, TStyleSet2](styleSet1: Null, styleSet2: TStyleSet2): IConcatenatedStyleSet[ObjectOnly[TStyleSet1] with ObjectOnly[TStyleSet2]] = js.native
}

