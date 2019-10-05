package typings.nodeDashForge.nodeDashForgeMod.util

import typings.nodeDashForge.nodeDashForgeMod.Base64
import typings.nodeDashForge.nodeDashForgeMod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "util.encode64")
@js.native
object encode64 extends js.Object {
  def apply(bytes: Bytes): Base64 = js.native
  def apply(bytes: Bytes, maxline: Double): Base64 = js.native
}

