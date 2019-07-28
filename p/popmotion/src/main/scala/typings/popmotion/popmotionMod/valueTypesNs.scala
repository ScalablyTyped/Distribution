package typings.popmotion.popmotionMod

import typings.styleDashValueDashTypes.Anon_Alpha
import typings.styleDashValueDashTypes.Anon_AlphaBlue
import typings.styleDashValueDashTypes.libTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "valueTypes")
@js.native
object valueTypesNs extends js.Object {
  val alpha: ValueType = js.native
  val color: ValueType = js.native
  val degrees: ValueType = js.native
  val hex: ValueType = js.native
  val hsla: ValueType = js.native
  val number: ValueType = js.native
  val percent: ValueType = js.native
  val progressPercentage: ValueType = js.native
  val px: ValueType = js.native
  val rgbUnit: ValueType = js.native
  val rgba: ValueType = js.native
  val scale: ValueType = js.native
  val vh: ValueType = js.native
  val vw: ValueType = js.native
  @js.native
  object complex extends js.Object {
    def createTransformer(prop: String): js.Function1[/* v */ js.Array[Double | Anon_Alpha | Anon_AlphaBlue], String] = js.native
    def getAnimatableNone(target: String): String = js.native
    def parse(v: js.Any): js.Array[Double | Anon_Alpha | Anon_AlphaBlue] = js.native
    def test(v: js.Any): Boolean = js.native
  }
  
}

