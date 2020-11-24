package typings.nodeForge.mod.util

import typings.nodeForge.mod.Base64
import typings.nodeForge.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "util.encode64")
@js.native
object encode64 extends js.Object {
  
  def apply(bytes: Bytes): Base64 = js.native
  def apply(bytes: Bytes, maxline: Double): Base64 = js.native
}
