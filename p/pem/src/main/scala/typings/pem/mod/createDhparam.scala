package typings.pem.mod

import typings.pem.anon.Dhparam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pem", "createDhparam")
@js.native
object createDhparam extends js.Object {
  
  def apply(callback: Callback[Dhparam]): Unit = js.native
  def apply(keyBitsize: Double, callback: Callback[Dhparam]): Unit = js.native
}
