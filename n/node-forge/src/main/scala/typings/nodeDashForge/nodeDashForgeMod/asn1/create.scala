package typings.nodeDashForge.nodeDashForgeMod.asn1

import typings.nodeDashForge.nodeDashForgeMod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "asn1.create")
@js.native
object create extends js.Object {
  def apply(tagClass: Class, `type`: Type, constructed: Boolean, value: js.Array[Asn1]): Asn1 = js.native
  def apply(tagClass: Class, `type`: Type, constructed: Boolean, value: Bytes): Asn1 = js.native
}

