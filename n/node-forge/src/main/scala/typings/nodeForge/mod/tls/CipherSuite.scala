package typings.nodeForge.mod.tls

import typings.nodeForge.mod.Byte
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CipherSuite extends js.Object {
  var id: js.Tuple2[Byte, Byte]
  var name: String
}

object CipherSuite {
  @scala.inline
  def apply(id: js.Tuple2[Byte, Byte], name: String): CipherSuite = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherSuite]
  }
}

