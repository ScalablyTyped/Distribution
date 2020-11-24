package typings.popmotion

import typings.styleValueTypes.typesMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/utils/mix-color", JSImport.Namespace)
@js.native
object mixColorMod extends js.Object {
  
  def mixColor(from: String, to: String): js.Function1[/* v */ Double, _] = js.native
  def mixColor(from: String, to: Color): js.Function1[/* v */ Double, _] = js.native
  def mixColor(from: Color, to: String): js.Function1[/* v */ Double, _] = js.native
  def mixColor(from: Color, to: Color): js.Function1[/* v */ Double, _] = js.native
  
  def mixLinearColor(from: Double, to: Double, v: Double): Double = js.native
}
