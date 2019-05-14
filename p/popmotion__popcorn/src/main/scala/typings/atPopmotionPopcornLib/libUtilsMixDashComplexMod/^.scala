package typings
package atPopmotionPopcornLib.libUtilsMixDashComplexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@popmotion/popcorn/lib/utils/mix-complex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def mixArray(
    from: js.Array[
      java.lang.String | scala.Double | styleDashValueDashTypesLib.libTypesMod.RGBA | styleDashValueDashTypesLib.libTypesMod.HSLA
    ],
    to: js.Array[
      java.lang.String | scala.Double | styleDashValueDashTypesLib.libTypesMod.RGBA | styleDashValueDashTypesLib.libTypesMod.HSLA
    ]
  ): js.Function1[
    /* v */ scala.Double, 
    js.Array[
      java.lang.String | scala.Double | styleDashValueDashTypesLib.libTypesMod.RGBA | styleDashValueDashTypesLib.libTypesMod.HSLA
    ]
  ] = js.native
  def mixComplex(origin: java.lang.String, target: java.lang.String): MixComplex = js.native
  def mixObject(origin: BlendableObject, target: BlendableObject): js.Function1[
    /* v */ scala.Double, 
    org.scalablytyped.runtime.StringDictionary[
      java.lang.String | scala.Double | styleDashValueDashTypesLib.libTypesMod.RGBA | styleDashValueDashTypesLib.libTypesMod.HSLA
    ]
  ] = js.native
}

