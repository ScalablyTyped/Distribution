package typings.atPopmotionPopcorn.libUtilsMixDashComplexMod

import org.scalablytyped.runtime.StringDictionary
import typings.styleDashValueDashTypes.libTypesMod.HSLA
import typings.styleDashValueDashTypes.libTypesMod.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@popmotion/popcorn/lib/utils/mix-complex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def mixArray(from: js.Array[String | Double | RGBA | HSLA], to: js.Array[String | Double | RGBA | HSLA]): js.Function1[/* v */ Double, js.Array[String | Double | RGBA | HSLA]] = js.native
  def mixComplex(origin: String, target: String): MixComplex = js.native
  def mixObject(origin: BlendableObject, target: BlendableObject): js.Function1[/* v */ Double, StringDictionary[String | Double | RGBA | HSLA]] = js.native
}

