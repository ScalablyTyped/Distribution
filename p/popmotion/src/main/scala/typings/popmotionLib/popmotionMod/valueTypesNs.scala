package typings
package popmotionLib.popmotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "valueTypes")
@js.native
object valueTypesNs extends js.Object {
  val alpha: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  val color: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  val degrees: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  val hex: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  val hsla: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  val number: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  val percent: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  val progressPercentage: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  val px: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  val rgbUnit: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  val rgba: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  val scale: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  val vh: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  val vw: styleDashValueDashTypesLib.libTypesMod.ValueType = js.native
  @js.native
  object complex extends js.Object {
    def createTransformer(prop: java.lang.String): js.Function1[
        /* v */ js.Array[
          scala.Double | styleDashValueDashTypesLib.Anon_Alpha | styleDashValueDashTypesLib.Anon_AlphaBlue
        ], 
        java.lang.String
      ] = js.native
    def getAnimatableNone(target: java.lang.String): java.lang.String = js.native
    def parse(v: js.Any): js.Array[
        scala.Double | styleDashValueDashTypesLib.Anon_Alpha | styleDashValueDashTypesLib.Anon_AlphaBlue
      ] = js.native
    def test(v: js.Any): scala.Boolean = js.native
  }
  
}

