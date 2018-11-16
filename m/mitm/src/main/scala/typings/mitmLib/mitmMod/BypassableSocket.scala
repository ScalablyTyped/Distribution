package typings
package mitmLib.mitmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BypassableSocket
  extends nodeLib.netMod.Socket {
  def bypass(): scala.Unit = js.native
}

