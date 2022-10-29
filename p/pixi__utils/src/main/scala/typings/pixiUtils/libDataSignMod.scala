package typings.pixiUtils

import typings.pixiUtils.pixiUtilsInts.`-1`
import typings.pixiUtils.pixiUtilsInts.`0`
import typings.pixiUtils.pixiUtilsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataSignMod {
  
  @JSImport("@pixi/utils/lib/data/sign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sign(n: Double): `-1` | `0` | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(n.asInstanceOf[js.Any]).asInstanceOf[`-1` | `0` | `1`]
}
