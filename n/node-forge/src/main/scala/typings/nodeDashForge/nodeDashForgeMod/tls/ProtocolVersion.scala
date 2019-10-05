package typings.nodeDashForge.nodeDashForgeMod.tls

import typings.nodeDashForge.nodeDashForgeMod.Byte
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtocolVersion extends js.Object {
  var major: Byte
  var minor: Byte
}

object ProtocolVersion {
  @scala.inline
  def apply(major: Byte, minor: Byte): ProtocolVersion = {
    val __obj = js.Dynamic.literal(major = major, minor = minor)
  
    __obj.asInstanceOf[ProtocolVersion]
  }
}

