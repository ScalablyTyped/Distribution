package typings.officeUiFabricReact.mod

import typings.uifabricMergeStyles.istylesetMod.IConcatenatedStyleSet
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "concatStyleSets")
@js.native
object concatStyleSets extends js.Object {
  def apply[TStyleSet /* <: IStyleSet[TStyleSet] */](): IConcatenatedStyleSet[TStyleSet] = js.native
  def apply[TStyleSet /* <: IStyleSet[TStyleSet] */](styleSet: TStyleSet): IConcatenatedStyleSet[TStyleSet] = js.native
  def apply[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def apply[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: js.UndefOr[scala.Nothing], styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def apply[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: Null, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def apply[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  def apply[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet3 | TStyleSet4
  ): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
}

