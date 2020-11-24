package typings.polycrc.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("polycrc", "crc")
@js.native
object crc extends js.Object {
  
  def apply(width: Double, poly: Double, xor_in: Double, xor_out: Double, reflect: Boolean): js.Function1[/* buffer */ Buffer, Double] = js.native
}
