package typings.polished

import typings.polished.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("polished/lib/color/mix", JSImport.Namespace)
@js.native
object mixMod extends js.Object {
  
  def default(weight: String): FnCall = js.native
  def default(weight: String, color: String): js.Function1[/* otherColor */ String, String] = js.native
  def default(weight: String, color: String, otherColor: String): String = js.native
  def default(weight: Double): FnCall = js.native
  def default(weight: Double, color: String): js.Function1[/* otherColor */ String, String] = js.native
  def default(weight: Double, color: String, otherColor: String): String = js.native
}
