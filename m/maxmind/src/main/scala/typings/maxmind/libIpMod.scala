package typings.maxmind

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib/ip", JSImport.Namespace)
@js.native
object libIpMod extends js.Object {
  @js.native
  object default extends js.Object {
    def bitAt(rawAddress: js.Array[Double], idx: Double): Double = js.native
    def bitAt(rawAddress: Buffer, idx: Double): Double = js.native
    def parse(ip: String): js.Array[Double] = js.native
    def validate(ip: String): Boolean = js.native
  }
  
}

