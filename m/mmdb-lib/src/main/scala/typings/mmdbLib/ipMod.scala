package typings.mmdbLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipMod {
  
  object default {
    
    @JSImport("mmdb-lib/lib/ip", "default.bitAt")
    @js.native
    def bitAt(rawAddress: js.Array[Double], idx: Double): Double = js.native
    @JSImport("mmdb-lib/lib/ip", "default.bitAt")
    @js.native
    def bitAt(rawAddress: Buffer, idx: Double): Double = js.native
    
    @JSImport("mmdb-lib/lib/ip", "default.parse")
    @js.native
    def parse(ip: String): js.Array[Double] = js.native
    
    @JSImport("mmdb-lib/lib/ip", "default.validate")
    @js.native
    def validate(ip: String): Boolean = js.native
  }
}
