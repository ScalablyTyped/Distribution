package typings.nodeForge.mod.random

import typings.nodeForge.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "random.getBytes")
@js.native
object getBytes extends js.Object {
  
  def apply(count: Double): Bytes = js.native
  def apply(count: Double, callback: js.Function1[/* bytes */ Bytes, _]): Bytes = js.native
}
