package typings.node.cryptoMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "randomInt")
@js.native
object randomInt extends js.Object {
  
  def apply(max: Double): Double = js.native
  def apply(max: Double, callback: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = js.native
  def apply(min: Double, max: Double): Double = js.native
  def apply(min: Double, max: Double, callback: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = js.native
}
