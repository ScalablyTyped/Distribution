package typings.mmdbLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mmdb-lib/lib/ip", JSImport.Namespace)
@js.native
object ipMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def bitAt(rawAddress: js.Array[Double], idx: Double): Double = js.native
    def bitAt(rawAddress: Buffer, idx: Double): Double = js.native
    
    def parse(ip: String): js.Array[Double] = js.native
    
    def validate(ip: String): Boolean = js.native
  }
}
