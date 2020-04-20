package typings.nodeForge.mod.tls

import typings.nodeForge.mod.Byte
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
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolVersion]
  }
}

