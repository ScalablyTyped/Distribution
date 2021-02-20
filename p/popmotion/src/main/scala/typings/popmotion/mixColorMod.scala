package typings.popmotion

import typings.styleValueTypes.typesMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixColorMod {
  
  @JSImport("popmotion/lib/utils/mix-color", "mixColor")
  @js.native
  def mixColor(from: String, to: String): js.Function1[/* v */ Double, _] = js.native
  @JSImport("popmotion/lib/utils/mix-color", "mixColor")
  @js.native
  def mixColor(from: String, to: Color): js.Function1[/* v */ Double, _] = js.native
  @JSImport("popmotion/lib/utils/mix-color", "mixColor")
  @js.native
  def mixColor(from: Color, to: String): js.Function1[/* v */ Double, _] = js.native
  @JSImport("popmotion/lib/utils/mix-color", "mixColor")
  @js.native
  def mixColor(from: Color, to: Color): js.Function1[/* v */ Double, _] = js.native
  
  @JSImport("popmotion/lib/utils/mix-color", "mixLinearColor")
  @js.native
  def mixLinearColor(from: Double, to: Double, v: Double): Double = js.native
}
