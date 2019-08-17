package typings.atPopmotionPopcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsMixDashComplexMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.styleDashValueDashTypes.libTypesMod.HSLA
  import typings.styleDashValueDashTypes.libTypesMod.RGBA

  type BlendableObject = StringDictionary[String | Double | RGBA | HSLA]
  type MixComplex = js.Function1[/* p */ Double, String]
}
