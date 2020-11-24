package typings.mmdbLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mmdb-lib/lib/reader/walker", JSImport.Namespace)
@js.native
object walkerMod extends js.Object {
  
  def default(db: Buffer, recordSize: Double): Walker = js.native
  
  @js.native
  trait Walker extends js.Object {
    
    def left(offset: Double): Double = js.native
    @JSName("left")
    var left_Original: NodeReader = js.native
    
    def right(offset: Double): Double = js.native
    @JSName("right")
    var right_Original: NodeReader = js.native
  }
  
  type NodeReader = js.Function1[/* offset */ Double, Double]
}
