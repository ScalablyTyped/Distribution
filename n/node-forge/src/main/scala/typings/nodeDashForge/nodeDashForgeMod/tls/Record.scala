package typings.nodeDashForge.nodeDashForgeMod.tls

import typings.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  var fragment: ByteBuffer
  var length: Double
  var ready: js.UndefOr[Boolean] = js.undefined
  var `type`: ContentType
  var version: ProtocolVersion
}

object Record {
  @scala.inline
  def apply(
    fragment: ByteBuffer,
    length: Double,
    `type`: ContentType,
    version: ProtocolVersion,
    ready: js.UndefOr[Boolean] = js.undefined
  ): Record = {
    val __obj = js.Dynamic.literal(fragment = fragment, length = length, version = version)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(ready)) __obj.updateDynamic("ready")(ready)
    __obj.asInstanceOf[Record]
  }
}

